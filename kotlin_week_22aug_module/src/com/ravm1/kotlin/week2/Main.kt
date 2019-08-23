package com.ravm1.kotlin.week2

import com.ravm1.kotlin.aug22.easy.EasyTask
import com.ravm1.kotlin.aug22.veryEasy.VeryEasyTask

fun main() {

    val easyTask = EasyTask()

    //1. Easy Task#1
    easyTask.addTwoArrays(arrayOf(1,2,3,4,5), arrayOf(1,2,3,4,5)){
        println("Total of input arrays [] =  $it")
    }

    //2. easy Task#2    TODO Handle even sized strings  like 'abba' or 'lirril'
    val inputString = "Liril"
    val isPalindrome = easyTask.isPalindrome(inputString.trim())
    println(" $inputString is  ${ if(isPalindrome) " a " else {" ! NOT a" }} Palindrome ")


    //3.Very Easy Task #1
    val veryEasyTask = VeryEasyTask()
    veryEasyTask.linkedListImplementation()

}