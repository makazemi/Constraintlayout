package com.example.constraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.View
import kotlinx.android.synthetic.main.placehoder_animation.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.placehoder2)
    }
    
//    fun swapView(v:View) {
//
//        TransitionManager.beginDelayedTransition(layout)
//        placeholder.setContentId(v.id)
//    }
}
