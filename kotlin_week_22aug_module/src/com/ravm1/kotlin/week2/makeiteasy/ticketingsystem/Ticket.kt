package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

/**
 * Ticket object containing status of queue , amount , status of it currently
 */
data class Ticket constructor(var  personName : String , var ticketPrice: Int, var ticketStatus: TicketStatus) {
    var processedFromQueue: Int = -1
}