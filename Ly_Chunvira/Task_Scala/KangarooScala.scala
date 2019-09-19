object KangarooScala {
  def main(args: Array[String]): Unit = {
    var x1 = scala.io.StdIn.readInt()
    val v1 = scala.io.StdIn.readInt()
    var x2 = scala.io.StdIn.readInt()
    val v2 = scala.io.StdIn.readInt()

    do{
      x1 += v1
      x2 += v2
    }while(x2 > x1)

    println(if(x1 == x2) "YES" else "NO")
  }
}
