package com.example.dailypascal

import kotlin.random.Random

class QuotePicker {

    // Generate random number
    fun randomNum(): Int {
        var pascalNumber: Int
        pascalNumber = Random.nextInt(0, 303)
        return pascalNumber
    }

    fun getQuote(): String {
        // Read JSON file
        val model = MyModel()
        val quoteOb = model.readFile()

        // Generate random number & get quote ID
        val id = randomNum()
        val quoteId = quoteOb?.list?.get(id)?.id.toString()

        // Get corresponding quote to quote ID
        var quoteText = ""
        if (quoteId.toInt() == id) {
            quoteText = quoteOb?.list?.get(id)?.quote.toString()
        }

        return quoteText
    }
}