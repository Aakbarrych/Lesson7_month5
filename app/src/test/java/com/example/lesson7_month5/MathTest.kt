@file:Suppress("DEPRECATION")

package com.example.lesson7_month5

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun init(){
        math = Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("4", math?.add("2","2"))
    }

    @Test
    fun simpleSymbolTest(){
        assertEquals("4", math?.add("2sggggsegs","2"))
    }

    @Test
    fun simpleWithPlusTest(){
        assertEquals("4", math?.add("+2", "2") )
    }
    @Test
    fun simpleWithEmptyTest(){
        assertEquals("Вы обязаны ввести числа", math?.add("", "2") )
    }

    @Test
    fun simpleWithNegativeTest(){
        assertEquals("0", math?.add("-2", "2") )
    }

    @Test
    fun simpleWithDoubleTest(){
        assertEquals("4", math?.add("2", "2.0") )
    }

    @Test
    fun simpleWithDivideTest(){
        assertEquals("4", math?.divide("8", "2") )
    }

    @Test
    fun simpleSymbolDivideTest(){
        assertEquals("Вы обязаны ввести числа", math?.divide("8", "2dsa") )
    }

    @Test
    fun simpleNotNullDivideTest(){
        assertEquals("1.25", math?.divide("10", "8") )
    }

    @Test
    fun simpleZeroDivideTest(){
        assertEquals("На ноль делить нельзя", math?.divide("8", "2dsa") )
    }

    @After
    fun detach(){
        math = null
    }

}