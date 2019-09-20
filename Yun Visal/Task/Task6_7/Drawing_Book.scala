package Assignment

object Drawing_Book extends App {
  var n = scala.io.StdIn.readInt()
  var p = scala.io.StdIn.readInt()

  if(p>n/2){
    println((n-p)/2)
  }
  else{
    println(p/2)
  }
}
