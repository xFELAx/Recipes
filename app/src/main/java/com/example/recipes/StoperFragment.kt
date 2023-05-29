package com.example.recipes

import android.content.Context
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView


class StoperFragment : Fragment(), View.OnClickListener {
    private var seconds = 300
    private var startingSeconds = 300
    private var running = false
    private var wasRunning = false
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var timeDialog: AlertDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mediaPlayer = MediaPlayer.create(context, R.raw.ring)
        val dialogView = View.inflate(activity, R.layout.time_dialog, null)
        val numberPickerHour = dialogView.findViewById<NumberPicker>(R.id.numpicker_hours)
        numberPickerHour.maxValue = 23
        numberPickerHour.value = 0
        val numberPickerMinutes = dialogView.findViewById<NumberPicker>(R.id.numpicker_minutes)
        numberPickerMinutes.maxValue = 59
        numberPickerMinutes.value = 0
        val numberPickerSeconds = dialogView.findViewById<NumberPicker>(R.id.numpicker_seconds)
        numberPickerSeconds.maxValue = 59
        numberPickerSeconds.value = 0
        val cancel = dialogView.findViewById<Button>(R.id.cancel)
        val ok = dialogView.findViewById<Button>(R.id.ok)
        val builder = AlertDialog.Builder(activity as Context)
        builder.setView(dialogView)
        timeDialog = builder.create()
        cancel.setOnClickListener { timeDialog.dismiss(); }
        ok.setOnClickListener {
            startingSeconds =
                numberPickerHour.value * 3600 + numberPickerMinutes.value * 60 + numberPickerSeconds.value
            seconds = startingSeconds
            timeDialog.dismiss()
        }
        if (savedInstanceState != null) {
            seconds = savedInstanceState.getInt("seconds")
            startingSeconds = savedInstanceState.getInt("startingSeconds")
            running = savedInstanceState.getBoolean("running")
            wasRunning = savedInstanceState.getBoolean("wasRunning")
            if (savedInstanceState.getBoolean("dialogOpen")) {
                timeDialog.show()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, SavedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_stoper, container, false)
        runStoper(layout)
        layout.findViewById<View>(R.id.start_button).setOnClickListener(this)
        layout.findViewById<View>(R.id.stop_button).setOnClickListener(this)
        layout.findViewById<View>(R.id.reset_button).setOnClickListener(this)
        layout.findViewById<View>(R.id.time_view).setOnClickListener(this)

        return layout
    }

    override fun onPause() {
        super.onPause()
        wasRunning = running
        running = false
    }

    override fun onResume() {
        super.onResume()
        if (wasRunning) {
            running = true
        }
    }

    override fun onSaveInstanceState(savedInstanceState: Bundle) {
        savedInstanceState.putInt("seconds", seconds)
        savedInstanceState.putInt("startingSeconds", startingSeconds)
        savedInstanceState.putBoolean("running", running)
        savedInstanceState.putBoolean("wasRunning", wasRunning)
        savedInstanceState.putBoolean("dialogOpen", timeDialog.isShowing)
    }

    private fun onClickStart() {
        running = true
    }

    private fun onClickStop() {
        running = false
        if (mediaPlayer.isPlaying) {
            mediaPlayer.pause()
        }
        if (seconds < 0) {
            seconds = startingSeconds
        }
    }

    private fun onClickReset() {
        running = false
        seconds = startingSeconds
    }

    private fun runStoper(view: View) {
        val timeView = view.findViewById<View>(R.id.time_view) as TextView
        val handler = Handler()
        handler.post(object : Runnable {
            override fun run() {
                val hours = seconds / 3600
                val minutes = seconds % 3600 / 60
                val secs = seconds % 60
                val time = String.format("%d:%02d:%02d", hours, minutes, secs)
                timeView.text = time
                if (running) {
                    seconds--
                }
                if (seconds == -1) {
                    mediaPlayer.seekTo(0)
                    mediaPlayer.start()
                }
                handler.postDelayed(this, 1000)
            }
        })
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.start_button -> onClickStart()
            R.id.stop_button -> onClickStop()
            R.id.reset_button -> onClickReset()
            R.id.time_view -> {
                running = false; timeDialog.show()
            }
        }
    }
}
