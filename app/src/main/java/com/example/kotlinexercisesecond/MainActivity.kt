package com.example.kotlinexercisesecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operation = Operations()
        val sizeOfUniques = operation.sortedArray(arrayOf(5, 2, 1, 5, 2))
        d("Message", "Size of unique numbers is  $sizeOfUniques")
        val intersection =
            operation.intersectionOfArrays(arrayOf(1, 2, 3, 4, 5), arrayOf(2, 5, 6, 7))
        d("Message", "Intersection of arrays is $intersection")
        val unification = operation.unificationOfArrays(arrayOf(1, 2, 3, 4, 5), arrayOf(2, 5, 6, 7))
        d("Message", "unification of arrays is $unification")
        val sortedLowerThanAvg = operation.getLowerThanAvg(arrayOf(27, 2, 6, 54, 9, 5))
        d("Message", "sorted by lower than average array : $sortedLowerThanAvg")
        operation.secondaryMinMax(arrayOf(27, 2, 6, 54, 9, 5))
    }
}