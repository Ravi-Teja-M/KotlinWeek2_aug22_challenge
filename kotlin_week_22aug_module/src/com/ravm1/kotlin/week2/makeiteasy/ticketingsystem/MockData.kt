package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

//Gather 3 queue mock data as array at one place
val mockQueueData = arrayOf(getMockTicketingDataQ1(), getMockTicketingDataQ2(), getMockTicketingDataQ3())

//Queue 1 mock data
private fun getMockTicketingDataQ1() : MutableSet<Ticket>{
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

//Queue 2 mock data
private fun getMockTicketingDataQ2() : MutableSet<Ticket>{

    var  unorderedSpectators = mutableSetOf<Ticket>()
    unorderedSpectators.add(Ticket("Person A", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person B", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person C", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person D", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person E", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person F", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    return unorderedSpectators
}

//Queue3 mock data
private fun getMockTicketingDataQ3() : MutableSet<Ticket>{
    var  unorderedSpectators = mutableSetOf<Ticket>()
    unorderedSpectators.add(Ticket("Person X1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person Y2", TicketPricing.TYPE_50 , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person Z3", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person a1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person b1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person c1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person d1", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person e1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person f1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person g1", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person h1", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person i2", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person j2", TicketPricing.TYPE_FREE , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person k2", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    unorderedSpectators.add(Ticket("Person l2", TicketPricing.TYPE_VIP , TicketStatus.IN_QUEUE))
    return unorderedSpectators
}