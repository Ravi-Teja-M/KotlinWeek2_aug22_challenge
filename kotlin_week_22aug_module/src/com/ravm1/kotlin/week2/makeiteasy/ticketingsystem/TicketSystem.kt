package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

import java.util.*

class TicketSystem constructor(val counter: Int) : ITicketAdminTask , Comparator<Ticket> {



    var priorityQueueOne = PriorityQueue(this)

    var processedTicketsList = mutableListOf<Ticket>()

    override fun proritize() {

    }

    override fun processTicket() {

        val ticket = priorityQueueOne.peek()

        if(ticket.ticketStatus ==TicketStatus.IN_QUEUE) {
            ticket.apply {

                this.ticketStatus = TicketStatus.PROCESSED_TICKET
                this.processedCounterNumber = counter

                processedTicketsList?.let {
                    it.add( priorityQueueOne.poll() )
                }
             }
        }
    }

    override fun compare(ticket1: Ticket?, ticket2: Ticket?): Int {

       return when {

           (ticket1 ?. ticketPrice !!) < (ticket2 ?. ticketPrice !!) -> 1

           (ticket1 ?. ticketPrice !!) > (ticket2 ?. ticketPrice !!) -> -1

           else -> 0
        }
    }

    fun addTicketToList(ticket: Ticket?) {

        priorityQueueOne.add(ticket)
    }
}