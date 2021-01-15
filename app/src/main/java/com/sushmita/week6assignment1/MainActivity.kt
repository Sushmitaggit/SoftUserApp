package com.sushmita.week6assignment1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.fragment.app.FragmentTransaction
import com.sushmita.week6assignment1.Fragments.AboutFragment
import com.sushmita.week6assignment1.Fragments.HomeFragment
import com.sushmita.week6assignment1.Fragments.StudentFragment

class MainActivity : AppCompatActivity() , Communicator {


    private lateinit var LinearContainer: LinearLayout

    private lateinit var home: ImageView
    private lateinit var student: ImageView
    private lateinit var about: ImageView
    private lateinit var home2: TextView
    private lateinit var student2: TextView
    private lateinit var about2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val fragment1 = StudentFragment()
        supportFragmentManager.beginTransaction().replace(R.id.LinearContainer, fragment1).commit()


        LinearContainer = findViewById(R.id.LinearContainer)

        home = findViewById(R.id.home)
        student = findViewById(R.id.student)
        about = findViewById(R.id.about)
        home2 = findViewById(R.id.home2)
        student2 = findViewById(R.id.student2)
        about2 = findViewById(R.id.about2)



        supportFragmentManager.beginTransaction().apply {
            replace(R.id.LinearContainer, StudentFragment())
            changeStudent()
            addToBackStack(null)
            commit()
        }

        student.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, StudentFragment())
                changeStudent()
                addToBackStack(null)
                commit()
            }
        }

        student2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, StudentFragment())
                changeStudent()
                addToBackStack(null)
                commit()
            }
        }

        home.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, HomeFragment())
                changeHome()
                addToBackStack(null)
                commit()
            }
        }

        home2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, HomeFragment())
                changeHome()
                addToBackStack(null)
                commit()
            }
        }


        about.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, AboutFragment())
                changeAbout()
                addToBackStack(null)
                commit()
            }
        }

        about.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.LinearContainer, AboutFragment())
                changeAbout()
                addToBackStack(null)
                commit()
            }
        }
    }

    fun changeHome() {
        student.setImageResource(R.drawable.ic_baseline_add_box_24)
        home.setImageResource(R.drawable.ic_baseline_home_24_2)
        about.setImageResource(R.drawable.ic_baseline_notifications_24)

        student2.setTextColor(Color.parseColor("#FF000000"))
        home2.setTextColor(Color.parseColor("#FF32FF69"))
        about2.setTextColor(Color.parseColor("#FF000000"))
    }

    fun changeStudent() {
        student.setImageResource(R.drawable.ic_baseline_add_box_24_2)
        home.setImageResource(R.drawable.ic_baseline_home_24)
        about.setImageResource(R.drawable.ic_baseline_notifications_24)

        student2.setTextColor(Color.parseColor("#FF32FF69"))
        home2.setTextColor(Color.parseColor("#FF000000"))
        about2.setTextColor(Color.parseColor("#FF000000"))
    }

    fun changeAbout() {
        student.setImageResource(R.drawable.ic_baseline_add_box_24)
        home.setImageResource(R.drawable.ic_baseline_home_24)
        about.setImageResource(R.drawable.ic_baseline_notifications_24_2)

        student2.setTextColor(Color.parseColor("#FF000000"))
        home2.setTextColor(Color.parseColor("#FF000000"))
        about2.setTextColor(Color.parseColor("#FF32FF69"))
    }

     override fun passDataCom(fname : String,  age : String, gender: String,  address : String ,  profile : String) {
        val bundle = Bundle()
         val result: String? = "1"
         bundle.putString("result", result)
        bundle.putString("fname", fname)
        bundle.putString("age", age)
        bundle.putString("gender", gender)
        bundle.putString("address", address)
        bundle.putString("profile", profile)
        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentTwo = HomeFragment()
        fragmentTwo.arguments = bundle
        transaction.replace(R.id.LinearContainer, fragmentTwo)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }



}




