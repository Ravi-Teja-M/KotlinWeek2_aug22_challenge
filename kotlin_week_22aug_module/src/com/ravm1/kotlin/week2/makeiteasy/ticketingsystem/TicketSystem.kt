package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

import java.util.*

/**
 * Ticket system that prioritizes the queues based on pricing and permits the most highest tickets first
 */
class TicketSystem constructor(private val queueNumber: Int) : ITicketAdminTask, Comparator<Ticket> {

    private var priorityQueueOne = PriorityQueue(this)
    private var processedTicketsList = LinkedList<Ticket>()

    override fun allowAudienceIntoConcert() {
        val iterator = processedTicketsList.iterator()
        while (iterator.hasNext()) {
            val ticket = iterator.next()
            println(" Queue# ${ticket.processedFromQueue} -> ${ticket.personName} ${TicketPricing.getTypeFromAmount(ticket.ticketPrice)} moved into Concert ")
        }
    }

    /**
     * process the ticket by getting peek() element from  Priority queue and change the status of it and removing it later to PROCESSED_QUEUE
     */
    override fun processTickets() {
        if (priorityQueueOne.isEmpty()) {
            println("Priority queue $queueNumber is empty : check the Mock insertion")
            return
        }
        while (!priorityQueueOne.isEmpty()) {
            val ticket = priorityQueueOne.peek()

            if (ticket.ticketStatus == TicketStatus.IN_QUEUE) {
                ticket.apply {
                    this.ticketStatus = TicketStatus.PROCESSED_TICKET
                    this.processedFromQueue = queueNumber
                    processedTicketsList.let {
                        it.add(priorityQueueOne.poll())
                    }
                }
            }
        }
        println("");println("");println("");
        println(" queue $queueNumber Processed")

        //Now  processed tickets can go into the Concert, default impl  prints the ordering of processed people
        allowAudienceIntoConcert()
    }

    //Comparator<Ticket> reorders or sorts queue based on ticket value
    override fun compare(ticket1: Ticket?, ticket2: Ticket?): Int {

        return when {
            (ticket1?.ticketPrice!!) < (ticket2?.ticketPrice!!) -> 1
            (ticket1?.ticketPrice) > (ticket2?.ticketPrice!!) -> -1
            else -> 0
        }
    }

    fun addTicketToList(ticket: Ticket?): Boolean {
        return priorityQueueOne.offer(ticket)
    }

    //add mock data into priority queue who come in random order and  using priority queue it sorts as per ticket price
    fun addBatchTicketsToList(listOfTickets: MutableSet<Ticket>): TicketSystem {
        for (ticket in listOfTickets) {
            priorityQueueOne.offer(ticket)
        }
        return this@TicketSystem
    }
}