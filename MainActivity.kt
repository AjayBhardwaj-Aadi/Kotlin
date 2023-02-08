package com.androidstudio.activityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.androidstudio.activityfragment.databinding.ActivityMainBinding
import com.example.actfragment.ActivityInterface
import com.example.actfragment.ActivityInterface1
import com.example.actfragment.ActivityInterface2

class MainActivity : AppCompatActivity() {
    lateinit var activityInterface: ActivityInterface
    lateinit var activityInterface1: ActivityInterface1
    lateinit var activityInterface2: ActivityInterface2
    lateinit var binding: MainActivity
    private val TAG = "MainActivity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain.inflate(layoutInflater)
        setContentView(binding?.root)

    }

    fun Red(view: View) {
        binding?.cb1stfragment?.setOnClickListener {
            if (binding?.rbRED?.isEnabled == true && binding?.cb1stfragment?.isEnabled == true) {
                activityInterface.colorChange(1)
            }
        }

        binding?.cb2ndfragment?.setOnClickListener {
            if (binding?.rbRED?.isEnabled == true && binding?.cb2ndfragment?.isEnabled == true) {
                activityInterface1.colorChange(1)
            }
        }
        binding?.cb3rdfragment?.setOnClickListener {
            if (binding?.rbRED?.isEnabled == true && binding?.cb3rdfragment?.isEnabled == true) {
                activityInterface2.colorChange(1)
            }
        }


    }

    fun Blue(view: View) {
        binding?.cb1stfragment?.setOnClickListener {
            if (binding?.rbBLUE?.isEnabled == true && binding?.cb1stfragment?.isEnabled == true) {
                activityInterface.colorChange(2)
            } else if (binding?.rbRED?.isEnabled == false) {
                binding?.cb1stfragment?.setChecked(false)
            }
        }

        binding?.cb2ndfragment?.setOnClickListener {
            if (binding?.rbBLUE?.isEnabled == true && binding?.cb2ndfragment?.isEnabled == true) {
                activityInterface1.colorChange(2)
            }
        }
        binding?.cb3rdfragment?.setOnClickListener {
            if (binding?.rbBLUE?.isEnabled == true && binding?.cb3rdfragment?.isEnabled == true) {
                activityInterface2.colorChange(2)
            }
        }


    }

    fun Purple(view: View) {
        binding?.cb1stfragment?.setOnClickListener {
            if (binding?.rbPURPLE?.isEnabled == true && binding?.cb1stfragment?.isEnabled == true) {
                activityInterface.colorChange(color = 3 )
            }
        }

        binding?.cb2ndfragment?.setOnClickListener {
            if (binding?.rbPURPLE?.isEnabled == true && binding?.cb2ndfragment?.isEnabled == true) {
                activityInterface1.colorChange(3)
            }
        }
        binding?.cb3rdfragment?.setOnClickListener {
            if (binding?.rbPURPLE?.isEnabled == true && binding?.cb3rdfragment?.isEnabled == true) {
                activityInterface2.colorChange(3)
            }
        }


    }
}

