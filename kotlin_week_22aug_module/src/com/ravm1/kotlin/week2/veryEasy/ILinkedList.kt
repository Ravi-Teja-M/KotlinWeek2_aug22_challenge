package com.ravm1.kotlin.week2.veryEasy

import com.ravm1.kotlin.aug22.veryEasy.Node

//abstract linked list operations
interface ILinkedList <T> {
    fun add (t : T )
    fun delete(index : Int) : Boolean
    fun get(index : Int) : Node?
    fun insertAt(index : Int, obj : T) :Boolean
    fun printAll()
}