package Task.Task4_5

object Tag_Content {
  val n = scala.io.StdIn.readInt()
  while (n>0){
    val str = scala.io.StdIn.readLine()
    val format = "<(.+)>([^<]+)</(.+)>".r
    val format(open,content,close) = str
    if(open == close){
      println(content)
    }
    else{
      println("None")
    }
    n-=1
  }

}
