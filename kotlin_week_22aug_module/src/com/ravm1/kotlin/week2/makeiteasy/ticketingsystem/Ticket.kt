package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

data class Ticket constructor(var  ticketId : Int , var ticketPrice: Int, var ticketStatus: TicketStatus) {

    var processedCounterNumber: Int = -1
        get() = field
        set(value) {
        field = value
    }

}