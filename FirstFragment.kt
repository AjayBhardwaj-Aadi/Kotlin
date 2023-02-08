package com.androidstudio.activityfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import com.androidstudio.activityfragment.databinding.FragmentActivity2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [activity2.newInstance] factory method to
 * create an instance of this fragment.
 */
class activity2 : Fragment(), ActivityInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var binding: FragmentActivity2Binding? = null
    lateinit var MainActivity: FragmentActivity



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainActivity = activity as MainActivity
        (MainActivity as MainActivity).activityInterface = this
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentActivity2Binding.inflate(layoutInflater)
        binding?.rlRelative1?.setOnClickListener {
//            MainActivity.fragmentFunction()
        }
        return binding?.root
    }
    //static members, functions

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment activity2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            activity2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    override fun colorChange(color: Int) {
        when (color) {
            1 -> binding?.rlRelative1?.setBackgroundColor(
                ContextCompat.getColor(
                    MainActivity,
                    R.color.red
                )
            )
            2 -> binding?.rlRelative1?.setBackgroundColor(
                ContextCompat.getColor(
                    MainActivity,
                    R.color.blue
                )
            )
            3 -> binding?.rlRelative1?.setBackgroundColor(
                ContextCompat.getColor(
                    MainActivity,
                    R.color.purple_200
                )
            )
        }
    }

}