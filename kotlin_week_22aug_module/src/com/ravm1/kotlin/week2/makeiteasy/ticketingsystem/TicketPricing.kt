package com.ravm1.kotlin.week2.makeiteasy.ticketingsystem

interface TicketPricing {
    companion object TicketType {
        const val TYPE_VIP = 2000
        const val TYPE_50 = 50
        const val TYPE_FREE = 0

        fun getTypeFromAmount(amount: Int): String {
            return when(amount) {
                TYPE_50 -> "Silver 50$ Ticket"
                TYPE_FREE -> "FREE $0$ Ticket"
                TYPE_VIP -> "VIP 2000$ Ticket"

                else -> "Invalid Amount, out of ticket range"
            }
        }
    }


}