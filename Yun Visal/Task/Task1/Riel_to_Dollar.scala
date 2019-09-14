package Task.Task1

import scala.collection.mutable.ArrayBuffer

object Riel_to_Dollar extends App {
  var TwoT = 0
  var OneT = 0
  var FiveH = 0
  var OneH = 0
  var checked = 0
  var display = ArrayBuffer[String]()

  System.out.print("Enter dollar money: ")
  val dollar = scala.io.StdIn.readDouble()
  val riel = dollar * 4000

  System.out.print("Enter the amount of 2000s: ")
  TwoT = scala.io.StdIn.readInt()
  System.out.print("Enter the amount of 1000s: ")
  OneT = scala.io.StdIn.readInt()
  System.out.print("Enter the amount of 500s: ")
  FiveH = scala.io.StdIn.readInt()
  System.out.print("Enter the amount of 100s: ")
  OneH = scala.io.StdIn.readInt()

  if (TwoT != 0) {
    checked += TwoT * 2000
    display += s"2000 x ${TwoT} = ${TwoT * 2000}"
  }
  if (OneT != 0) {
    checked += OneT * 1000
    display += s"1000 x ${OneT} = ${OneT * 1000}"
  }
  if (FiveH != 0) {
    checked += FiveH * 500
    display += s"500 x ${FiveH} =  ${FiveH * 500}"
  }
  if (OneH != 0) {
    checked += OneH * 100
    display += s"100 x ${OneH} = ${OneH * 100}"
  }

  if (checked == riel) {
    for (i <- display) {
      println(i)
    }
  }
  else println("Invalid")
}
