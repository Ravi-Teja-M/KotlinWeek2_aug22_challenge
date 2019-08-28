package com.ravm1.kotlin.week2

import com.ravm1.kotlin.aug22.easy.EasyTask
import com.ravm1.kotlin.aug22.veryEasy.VeryEasyTask
import com.ravm1.kotlin.week2.makeiteasy.Concert

fun main() {
    //Task to add two integer arrays
    val easyTask = EasyTask()
    easyTask.addTwoArrays(arrayOf(1, 2, 3, 4, 5), arrayOf(1, 2, 3, 4, 5)) {
        println("Total of input arrays [] =  $it  \n\n\n\n\n -------------")
    }

    //2. easy Task#2
    //Task to check if string is a palindrome
    val inputString = "Liril"
    val isPalindrome = easyTask.isPalindrome(inputString.trim())
    println("$inputString is  ${if (isPalindrome) " a " else {" ! NOT a"}} Palindrome  \n\n\n\n -------------\"")

    //3.Very Easy Task #1     , linked list impl with traversal from head node to tail
    val veryEasyTask = VeryEasyTask()
    veryEasyTask.linkedListImplementation()
    println("-----------")

    //4. Ticket management system , priority queue basing
    val makeItEasyTask = Concert()
    makeItEasyTask.initTicketManagementSystem().process()


}


