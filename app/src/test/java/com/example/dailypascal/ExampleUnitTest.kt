package com.example.dailypascal

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    /*
    @Test
    fun printTest() {
        val testMain = MainActivity()
        val testVar = testMain.main()
        assertEquals("HI", testVar)
    }

    @Test
    fun printJsonTest() {
        val testJson = MyModel()
        val testJstring = testJson.readFile()
        assertEquals("1", testJstring)
    }
     */

    @Test
    fun returnsQuoteString() {
        val testMain = MainActivity()
        val testObj = testMain.main()
        assert(testObj is String)
    }
}