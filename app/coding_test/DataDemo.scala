package coding_test

import java.text.DateFormat._
import java.util.{Date, Locale}

import scala.collection.immutable.HashSet
import scala.collection.mutable.{Map, Set}
import scala.io.Source

/**
 *
 */
class DataDemo {

  def main(args: Array[String]): Unit = {
    printDate()
    list_demo()
    tuple_demo()
    set_demo()
    hash_set_demo()
    map_demo()
    printArgs(Array("welcome in Scala.", "2.9", "3.4", "3.5"))
    //    printArgs("welcome in Scala.\n+The name Scala stands for “scalable language.” The language is so named" +
    //      "\nbecause it was designed to grow with the demands of its users. You can apply\n" +
    //      "Scala to a wide range of programming tasks, from writing small scripts to\nbuilding large systems.1")
  }

  def printDate() {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }

  def list_demo(): Unit = {
    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)
  }

  def tuple_demo(): Unit = {
    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)
  }

  def set_demo(): Unit = {
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
  }

  def hash_set_demo(): Unit = {
    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")
  }

  def map_demo(): Unit = {
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
    //If you prefer an immutable map, no import is necessary, as immutable is
    //the default map.
    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))
  }

  //  def widthOfLength(args: Array[String] ,s: String) = s.length.toString.length(){
  //  if (args.length > 0) {
  //    val lines = Source.fromFile(args(0)).getLines().toList
  //    val longestLine = lines.reduceLeft(
  //      (a, b) => if (a.length > b.length) a else b
  //    )
  //    val maxWidth = widthOfLength(longestLine)
  //    for (line <- lines) {
  //      val numSpaces = maxWidth - widthOfLength(line)
  //      val padding = "" "" * numSpaces
  //      println(padding + line.length +" | "+ line)
  //    }
  //  }
  //  else
  //    Console.err.println(Please enter filename)
  //  }

  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  def read(args: Array[String]): Unit = {
    if (args.length > 0) {
      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")
  }
}

