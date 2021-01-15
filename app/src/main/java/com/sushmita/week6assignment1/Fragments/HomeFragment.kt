package com.sushmita.week6assignment1.Fragments

import android.content.Intent.getIntent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sushmita.week6assignment1.Adapter.DetailsAdapter
import com.sushmita.week6assignment1.R
import com.sushmita.week6assignment1.Student

class HomeFragment : Fragment() {

    var students = arrayListOf<Student>()
    private lateinit var recyclerview: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerview = view.findViewById(R.id.recyclerview)


        var result = "0"
        result = arguments?.getString("result").toString()
        val fname = arguments?.getString("fname").toString()
        val age = arguments?.getString("age").toString()
        val gender = arguments?.getString("gender").toString()
        val address = arguments?.getString("address").toString()
        val profile = arguments?.getString("profile").toString()
        if (result== "1" ){
            students.add(  Student(fname,age,address,gender,profile))
        }
         return view
        }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        recyclerview.apply {
            layoutManager = LinearLayoutManager(activity)

            students.add(  Student("Joey","20","Male","Nepal",
                "https://cdn.onlinewebfonts.com/svg/img_504768.png"))
//
//            students.add(  Student("Rachel","25","Female","Nepal",
//                    "https://icon-library.com/images/woman-profile-icon/woman-profile-icon-20.jpg"))

            students.add(  Student("Emily","30","Others","Nepal",
                    "https://cdn.onlinewebfonts.com/svg/img_958.png"))
            adapter = DetailsAdapter(students,this@HomeFragment )

            }
        }

    }
