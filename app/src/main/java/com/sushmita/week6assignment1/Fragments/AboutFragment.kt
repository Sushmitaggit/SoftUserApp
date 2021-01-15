package com.sushmita.week6assignment1.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.sushmita.week6assignment1.R
class AboutFragment : Fragment() {

    private lateinit var url : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view = inflater.inflate(R.layout.fragment_about, container, false)
        url = view.findViewById(R.id.url)
        url.apply {
            loadUrl("https://www.softwarica.edu.np")
            webViewClient = WebViewClient()
        }
        return view
    }
}