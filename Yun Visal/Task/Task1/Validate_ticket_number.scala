package Task.Task1

object Validate_ticket_number extends App {
  println("Enter ticket number: ")
  val ticket = scala.io.StdIn.readInt()
  val remainder = ticket % 10
  println(checked(ticket, remainder))

  def checked(a:Int, b:Int):Boolean = if ((a / 10) % 7 == b) return true else return false
}
