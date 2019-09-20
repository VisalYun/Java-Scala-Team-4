package Assignment

object Angry_Professor extends App {
  var flag=0
  var T = scala.io.StdIn.readInt()
  for(i <- 0 until(T)){
    var student_data = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var N = student_data(0)
    var K = student_data(1)

    if(K<=N){
      var arrival = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      if(arrival.length==K){
        for(i <- arrival){
          if(i>=0){
            flag+=1
          }
        }
      }
    }
    else{
      println("Too much student to expected!")
    }

    if(flag>=K){
      println("NO")
    }
    else{
      println("YES")
    }
  }
}
