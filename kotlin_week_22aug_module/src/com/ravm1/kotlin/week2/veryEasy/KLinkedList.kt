package com.ravm1.kotlin.aug22.veryEasy

import com.ravm1.kotlin.week2.veryEasy.ILinkedList


class KLinkedList<T : Any>  : ILinkedList<T> {

    private var headNode: Node? = null
    private var tailNode: Node? = null

   private companion object { // Static queueNumber ?? same as Companion ?? verify
        var CURRENT_INDEX = -1
    }

    override fun add(t: T) {
        val newNode = Node(null, t)
        if (headNode == null) {
            headNode = Node(null, null)
            headNode?.next = newNode
            tailNode = newNode
        }else {
            val previousNode = tailNode
            previousNode?.next  = newNode
            tailNode = newNode
        }
        CURRENT_INDEX += 1
    }

    override fun printAll() {
        if(headNode?.next == null) {
            println(" [] ")  //Don't print as per use-case
            return
        }
        var node = headNode?.next
        print("Data from node [ " )
        //Loop for next item
        do {
            print(" ${node?.data}  " )
            node = node?.next
        }   while(node!=null)

        print("]")
    }

    // if time permits write logic for these functions too
    override fun delete(index: Int): Boolean { return false   }

    override fun get(index: Int): Node? { return null }

    override fun insertAt(index: Int, obj: T): Boolean {  return false    }
}

class Node(var next: Node?, var data: Any?) //Node object accepting generic
