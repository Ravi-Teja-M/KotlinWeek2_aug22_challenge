package com.ravm1.kotlin.aug22.veryEasy

class VeryEasyTask {

    fun linkedListImplementation() {

    val linkedListData = KLinkedList<String>()   // KLinkedList<Int>()
        for(i in 1..10) {
            linkedListData.add("Person $i")  //  linkedListData.add(i)
        }
        linkedListData.printAll()
    }


}