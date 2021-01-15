package com.sushmita.week6assignment1

import java.io.Serializable

class Student: Serializable {
    var FullName : String;
    var Age : String;
    var Gender : String;
    var Address : String;
    var Profile : String;

    constructor(fname : String,  age : String, gender: String,  address : String ,  profile : String){
        this.FullName = fname;
        this.Age = age;
        this.Gender = gender;
        this.Address = address;
        this.Profile = profile;
    }

    override fun toString(): String{
        return FullName;

    }
}