package com.example.recipes

import android.content.Context
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pagerAdapter = SectionsPagerAdapter(supportFragmentManager, applicationContext)
        val pager = findViewById<View>(R.id.pager) as ViewPager
        pager.adapter = pagerAdapter
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(pager)
    }

    class SectionsPagerAdapter(fm: FragmentManager?, private val context: Context) : FragmentPagerAdapter(fm) {
        override fun getCount(): Int {
            return 3
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return context.getString(R.string.kat1_tab)
                1 -> return context.getString(R.string.kat2_tab)
                2 -> return context.getString(R.string.kat3_tab)
            }
            return null
        }

        override fun getItem(position: Int): Fragment? {
            when (position) {
                0 -> return HomeFragment()
                1 -> return Category2Fragment()
                2 -> return Category1Fragment()
            }
            return null
        }
    }
}
