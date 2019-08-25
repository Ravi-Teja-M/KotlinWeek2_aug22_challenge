package com.ravm1.kotlin.week2.makeiteasy

import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.Ticket
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketPricing
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketStatus
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketSystem

fun getMockTicketingData() : MutableSet<Ticket>{

    var  unorderedSpectators = mutableSetOf<Ticket>()

    unorderedSpectators.add(Ticket("Person 1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 2", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 3", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 4", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 5", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 6", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 7", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 8", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 9", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 10", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person 11", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))

    return unorderedSpectators
}


fun initTicketManagementSystem() {

    val queue1 = TicketSystem(1).addBatchTicketsToList(getMockTicketingData())
    queue1.processTickets()
}



