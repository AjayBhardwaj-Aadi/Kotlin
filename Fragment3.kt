package com.androidstudio.activityfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import com.androidstudio.activityfragment.databinding.FragmentActivity4Binding
import com.example.actfragment.ActivityInterface
import com.example.actfragment.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [activity4.newInstance] factory method to
 * create an instance of this fragment.
 */
class activity4 : Fragment(), ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentActivity? = null
    lateinit var MainActivity : MainActivity
    private  val TAG = "activity4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivity = activity as MainActivity
        MainActivity.activityInterface2 = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActivity.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return binding?.root
    }


    companion object {

        fun newInstance(param1: String, param2: String) =
            activity4().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun colorChange(color:Int) {
        when(color) {
            1-> binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(MainActivity, R.color.teal_700))
            2->binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(MainActivity, R.color.teal_200))
            3->binding?.rlRelative3?.setBackgroundColor(ContextCompat.getColor(MainActivity, R.color.purple_500))
        }
    }
}