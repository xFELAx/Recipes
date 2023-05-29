package com.example.recipes

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.Fragment
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SunsetFragment : Fragment() {
    private lateinit var mSceneView: View
    private lateinit var mSunView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_sunset, container, false)
        mSceneView = view
        mSunView = view.findViewById(R.id.sun)
        return view
    }

    override fun onStart() {
        super.onStart()
        startAnimation()
    }

    private fun startAnimation() {
        val displayMetrics = DisplayMetrics()
        activity!!.windowManager.defaultDisplay.getMetrics(displayMetrics)
        val yStart = displayMetrics.heightPixels.toFloat() * 0.5f
        val yEnd = yStart * 0.5f
        val riseAnimator = ObjectAnimator
            .ofFloat(mSunView, "y", yStart, yEnd)
            .setDuration(500)
        val fallAnimator = ObjectAnimator
            .ofFloat(mSunView, "y", yEnd, yStart)
            .setDuration(500)

        val rotationAnimator =
            ObjectAnimator.ofFloat(mSunView, "rotation", 0f, 360f).setDuration(1000)

        val animatorSet = AnimatorSet()
        animatorSet
            .play(riseAnimator).with(rotationAnimator).before(fallAnimator)
        animatorSet.start()

        Handler().postDelayed({
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }, 1000)


    }

    companion object {
        fun newInstance(): SunsetFragment {
            return SunsetFragment()
        }
    }
}