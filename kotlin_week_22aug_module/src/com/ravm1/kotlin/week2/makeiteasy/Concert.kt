package com.ravm1.kotlin.week2.makeiteasy

import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.Ticket
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketPricing
import com.ravm1.kotlin.week2.makeiteasy.ticketingsystem.TicketStatus

fun getMockTicketingData() : MutableSet<Ticket>{

    var  unorderedSpectators = mutableSetOf<Ticket>()

    unorderedSpectators.add(Ticket(1, TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(2, TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(3, TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(4, TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(5, TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(6, TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(7, TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(8, TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(9, TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(10, TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket(11, TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))

    return unorderedSpectators
}


fun initTicketManagementSystem() {






}
