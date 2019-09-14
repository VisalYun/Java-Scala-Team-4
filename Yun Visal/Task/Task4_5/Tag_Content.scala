package Task.Task4_5

import scala.util.matching.Regex

object Tag_Content {
  val pattern:Regex = "<(.+)>([^<]+)</\\1>".r
  val n = scala.io.StdIn.readInt()
  for (i<- 0 until n){
    val inp = scala.io.StdIn.readLine()
    pattern.findFirstMatchIn(inp) match {
      case Some(_) =>
    }
  }
}
