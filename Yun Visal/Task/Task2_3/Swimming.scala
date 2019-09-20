package Task.Task2

object Swimming extends App {
  print("Length: ")
  var length = scala.io.StdIn.readDouble()
  print("Width: ")
  var width = scala.io.StdIn.readDouble()
  print("Depth: ")
  var depth = scala.io.StdIn.readDouble()

  var volume = length*width*depth
  var gallons = volume * 7.5
  var time = gallons/50
  var Fillup_price = (time/60)*8

  var total_price = Fillup_price + 75

  println("Fee for cleaning: $75")
  println(s"Fee for filling up the water: $Fillup_price")
  println("--------------------------------------------")
  println(s"Total fee: $total_price")
}
