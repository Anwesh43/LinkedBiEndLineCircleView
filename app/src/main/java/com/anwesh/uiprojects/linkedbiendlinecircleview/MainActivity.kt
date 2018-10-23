package com.anwesh.uiprojects.linkedbiendlinecircleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.biendcirclelineview.BiEndLineCircleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BiEndLineCircleView.create(this)
    }
}
