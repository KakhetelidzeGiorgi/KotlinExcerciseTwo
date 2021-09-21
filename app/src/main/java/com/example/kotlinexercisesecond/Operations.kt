package com.example.kotlinexercisesecond

import android.util.Log.d

class Operations {
    // 1
    fun sortedArray(array: Array<Int>) = array.toSet().size

    // 2
    fun intersectionOfArrays(arr1: Array<Int>, arr2: Array<Int>) = arr1.intersect(arr2.toList())

    //3
    fun unificationOfArrays(arr1: Array<Int>, arr2: Array<Int>) = (arr1 + arr2).toSet()

    //4
    fun getLowerThanAvg(arr: Array<Int>) = arr.filter { it < arr.average() }

    //5
    fun secondaryMinMax(arr: Array<Int>) {
        arr.sort()
        val secondMax = arr[arr.size - 2]
        val secondMin = arr[1]
        d("Message", "Second Max is $secondMax")
        d("Message", "Second Min is $secondMin")
    }
}