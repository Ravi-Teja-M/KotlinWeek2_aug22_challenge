package com.ravm1.kotlin.week2.makeiteasy

import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.*

class Concert {

    lateinit var queue1 : TicketSystem
    lateinit var queue2 : TicketSystem
    lateinit var queue3 : TicketSystem

    fun initTicketManagementSystem() : Concert {
        queue1 = TicketSystem(1)
        queue2 = TicketSystem(2)
        queue3 = TicketSystem(3)
        return this@Concert
    }

    fun process() : Concert{
        queue1.addBatchTicketsToList(mockQueueData[0]).processTickets()
        queue2.addBatchTicketsToList(mockQueueData[1]).processTickets()
        queue3.addBatchTicketsToList(mockQueueData[2]).processTickets()
        return this@Concert
    }
}
