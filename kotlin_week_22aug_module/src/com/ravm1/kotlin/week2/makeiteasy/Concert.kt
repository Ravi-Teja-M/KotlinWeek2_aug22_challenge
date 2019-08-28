package com.ravm1.kotlin.week2.makeiteasy

import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketSystem
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.mockQueueData

/**
 * A class to initialize 3 ticket queue instances
 */
class Concert {

   private lateinit var queue1 : TicketSystem
   private lateinit var queue2 : TicketSystem
   private lateinit var queue3 : TicketSystem

    //init the ticket management system with queue number
    fun initTicketManagementSystem() : Concert {
        queue1 = TicketSystem(1)
        queue2 = TicketSystem(2)
        queue3 = TicketSystem(3)
        return this@Concert
    }

    //after initializing set mock data and process the ticket based on price priority
    fun process() : Concert{
        queue1.addBatchTicketsToList(mockQueueData[0]).processTickets()
        queue2.addBatchTicketsToList(mockQueueData[1]).processTickets()
        queue3.addBatchTicketsToList(mockQueueData[2]).processTickets()
        return this@Concert
    }
}
