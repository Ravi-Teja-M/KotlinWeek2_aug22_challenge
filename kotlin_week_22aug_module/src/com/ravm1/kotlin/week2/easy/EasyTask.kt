package com.ravm1.kotlin.aug22.easy

import java.lang.Exception

class EasyTask {

    fun addTwoArrays(input1 : Array<Int>, input2: Array<Int> , printTotalToConsole : (Int) -> Unit) : Int {
        var sumOfArray = 0
        if(input1.size  != input2.size) {
           throw  Exception("Input1  & Input2 are of not equal size")
        }
        for((index,_) in input1.withIndex()) {
            sumOfArray += (input1[index] + input2[index])
        }
        printTotalToConsole(sumOfArray)
        return sumOfArray
    }

    fun isPalindrome(input: String  ): Boolean {
        if(input.length == 1) {
          return true
        }
        if(input[0].equals(input[input.length-1],true)) {
            return  isPalindrome(input.substring(1,input.length-1))
        }
        return false
    }
}