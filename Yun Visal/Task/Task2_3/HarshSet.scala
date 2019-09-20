package Task.Task2

import scala.collection.mutable.HashSet

object HarshSet extends App {
  var n = scala.io.StdIn.readInt()
  var l:Array[String] = new Array(n)
  var r:Array[String] = new Array(n)
  for (i<- 0 until n){
    val name = scala.io.StdIn.readLine().split(" ")
    l(i) = name(0)
    r(i) = name(1)
  }
  val hashSet: HashSet[String] = HashSet()
  for(i<-0 until n){
    hashSet += s"${l(i)} ${r(i)}"
    println(hashSet.size)
  }
}
