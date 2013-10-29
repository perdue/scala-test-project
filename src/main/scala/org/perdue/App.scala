package org.perdue

//object App 
//{
//    def main(args: Array[String]):Unit={
//        println( "Hello World!" )
//    }

//    def main(args: Array[String]) {
//        println( "Hello World!" )
//    }
//}

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
    def main(args: Array[String]) {
        val now = new Date
        val df = getDateInstance(LONG, Locale.FRANCE)
        println(df format now)
    }
}
