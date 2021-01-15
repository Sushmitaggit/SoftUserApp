package com.sushmita.week6assignment1.Adapter

import android.content.Context
import android.view.*
import android.widget.*
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.sushmita.week6assignment1.*
import com.sushmita.week6assignment1.Fragments.HomeFragment
import de.hdodenhof.circleimageview.CircleImageView
import java.security.AccessController.getContext

class DetailsAdapter(val lst  : ArrayList<Student>, val context :HomeFragment
): RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>()
{


    class DetailsViewHolder(view : View): RecyclerView.ViewHolder(view){


        val imgProfile : ImageView
        val tvName : TextView
        val tvAge : TextView
        val tvAddress : TextView
        val tvGender : TextView
        lateinit var delete :  ImageView



        init {

            imgProfile = view.findViewById(R.id.imgProfile)
            tvName = view.findViewById(R.id.tvName)
            tvAge = view.findViewById(R.id.tvAge)
            tvAddress = view.findViewById(R.id.tvAddress)
            tvGender = view.findViewById(R.id.tvGender)
            delete = view.findViewById(R.id.delete)

        }
    }

    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int  ):DetailsViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.detailsholder,parent,false)

        return DetailsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val Student = lst [position]
        holder.tvName.text = Student.FullName
        holder.tvAge.text = Student.Age
        holder.tvAddress.text = Student.Address
        holder.tvGender.text = Student.Gender

        Glide.with(context).load(Student.Profile)
                .into(holder.imgProfile)


        }


    override fun getItemCount(): Int {
        return lst.size
    }

}