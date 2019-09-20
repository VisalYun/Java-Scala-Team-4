package Assignment

object Kangaroo extends App {
  var data_of_both = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  var x1 = data_of_both(0)
  var v1 = data_of_both(1)
  var x2 = data_of_both(2)
  var v2 = data_of_both(3)

  while(x2>x1){
    x1+=v1
    x2+=v2
  }

  if(x1==x2){
    println("YES")
  }
  else{
    println("NO")
  }
}
