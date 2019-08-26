package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

import java.util.*
import kotlin.Comparator

class TicketSystem constructor(private val queueNumber: Int) : ITicketAdminTask , Comparator<Ticket> {

    private var priorityQueueOne = PriorityQueue(this)
    private var processedTicketsList = LinkedList<Ticket>()

    override fun allowAudienceIntoConcert() {
        val iterator = processedTicketsList.iterator()
        while (iterator.hasNext()){
            val ticket = iterator.next()
            println(" Queue# ${ticket.recievedfromQueue} -> ${ticket.personName} ${TicketPricing.getTypeFromAmount(ticket.ticketPrice)} moved into Concert ")
        }
    }

    override fun processTickets() {
        if(priorityQueueOne.isEmpty()){
            println("Priority queue $queueNumber is empty : check the Mock insertion")
            return
        }
        while(!priorityQueueOne.isEmpty()) {
            val ticket = priorityQueueOne.peek()

            if(ticket.ticketStatus ==TicketStatus.IN_QUEUE) {
                ticket.apply {
                    this.ticketStatus = TicketStatus.PROCESSED_TICKET
                    this.recievedfromQueue = queueNumber
                    processedTicketsList.let {
                        it.add( priorityQueueOne.poll() )
                    }
                }
            }
        }
        println(" queue $queueNumber Processed")
        allowAudienceIntoConcert()
    }

    override fun compare(ticket1: Ticket?, ticket2: Ticket?): Int {

       return when {
           (ticket1 ?. ticketPrice !!) < (ticket2 ?. ticketPrice !!) -> 1
           (ticket1 ?. ticketPrice ) > (ticket2 ?. ticketPrice !!) -> -1
           else -> 0
        }
    }

    fun addTicketToList(ticket: Ticket?) : Boolean {
        return priorityQueueOne.offer(ticket)
    }

    fun addBatchTicketsToList(listOfTickets : MutableSet<Ticket>) : TicketSystem{
        for(ticket in listOfTickets) {
            priorityQueueOne.offer(ticket)
        }
        return this@TicketSystem
    }


}