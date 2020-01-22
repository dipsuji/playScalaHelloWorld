package coding_test

import java.text.DateFormat._
import java.util.{Date, Locale}

/**
 *
 */
class DataDemo {

  def main(args: Array[String]): Unit = {
    printDate()
  }

  def printDate() {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)
}

