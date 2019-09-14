package Task

object Credit extends App {
  print("Enter credit hours: ")
  val cr = scala.io.StdIn.readDouble()
  println("Enter the amount of money spent on books: ")
  val b = scala.io.StdIn.readDouble()
  val pcr = cr * 85
  val tot = pcr + b + 65

  println("The student enrolled " + cr + " credit hours and 85$ per credit hour = " + pcr)
  println("Plus $" + b + " spent on books = " + b)
  println("Plus a $65 on athletic fee")
  println("--> Total: $" + tot)
}
