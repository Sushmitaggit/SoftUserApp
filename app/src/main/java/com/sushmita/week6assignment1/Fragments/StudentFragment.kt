package com.sushmita.week6assignment1.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import android.widget.*
import com.google.android.material.button.MaterialButton
import com.sushmita.week6assignment1.*


class StudentFragment : Fragment() {

    private lateinit var name: EditText
    private lateinit var age: EditText
    private lateinit var address: EditText
    private lateinit var rg: RadioGroup
    private lateinit var rtMale: RadioButton
    private lateinit var rtFemale: RadioButton
    private lateinit var rtOther: RadioButton
    private lateinit var btn: MaterialButton
    private lateinit var communicator: Communicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student, container, false)
        name = view.findViewById(R.id.name)
        age = view.findViewById(R.id.age)
        address = view.findViewById(R.id.address)

        rg = view.findViewById(R.id.rg)
        rtMale = view.findViewById(R.id.rtMale)
        rtFemale = view.findViewById(R.id.rtFemale)
        rtOther = view.findViewById(R.id.rtOther)
        btn = view.findViewById(R.id.btn)


        communicator = activity as Communicator

        btn.setOnClickListener {
            addStudent()

        }
        return view
    }

    fun addStudent(){
        val name = name.text.toString()
        val age = age.text.toString()
        val address = address.text.toString()
        var gender = " "
        var profile = " "

        //gender
        if (rtMale.isChecked) {
            gender = rtMale.text.toString()
            profile = "https://cdn.onlinewebfonts.com/svg/img_504768.png"
        }
        else if (rtFemale.isChecked) {
            gender = rtFemale.text.toString()
            profile ="https://icon-library.com/images/woman-profile-icon/woman-profile-icon-20.jpg"
            }
        else if (rtOther.isChecked) {
            gender = rtOther.text.toString()
            profile = "https://cdn.onlinewebfonts.com/svg/img_958.png"
        }
//        Toast.makeText(context, "Student added", Toast.LENGTH_SHORT).show()
        communicator.passDataCom(name,age,address,gender,profile)



    }
}