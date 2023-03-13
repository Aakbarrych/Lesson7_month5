package com.example.lesson7_month5


class Math {
    val integerChars = '0'..'9'

    fun add(a: String, b: String) : String {
        var result: String
        if(a.isInteger() && b.isInteger() && b!="0"){
            result = (a.toInt() + b.toInt()).toString()
        } else if (a.contains(".") || b.contains(".")) {
            result = "Дроби нельзя использовать"
        } else{
            result = "You must put digits"
        }
        return result
    }

    fun divide(a: String, b: String) : String {
        var result = ""
        if(a.isInteger() && b.isInteger()){
            if(((a.toDouble() / b.toDouble()) % 1).toString() == "0.0" ){
                result = ((a.toInt() / b.toInt()).toDouble()).toString()
            } else{
                result = (a.toDouble() / b.toDouble()).toString()}
            }
        else if (a.contains(".") || b.contains(".")) {
            result = "Дроби нельзя использовать"
        } else{
            result = "You must put digits"
        }
        return result
    }


    fun String.isInteger() = this?.toIntOrNull()?.let { true } ?: false
}