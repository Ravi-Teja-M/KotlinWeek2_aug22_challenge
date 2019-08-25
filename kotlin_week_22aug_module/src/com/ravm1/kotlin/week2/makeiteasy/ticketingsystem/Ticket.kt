package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

data class Ticket constructor(var  personName : String , var ticketPrice: Int, var ticketStatus: TicketStatus) {

    var recievedfromQueue: Int = -1

}