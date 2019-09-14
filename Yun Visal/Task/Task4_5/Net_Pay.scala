package Task.Task4_5

object Net_Pay extends App {
  print("Hour Pay rate: ")
  var HPR = scala.io.StdIn.readDouble()
  print("Working hour: ")
  var H = scala.io.StdIn.readInt()
  var pay = 0.0

  var gross_pay = HPR*H
  println("Gross Pay: $"+gross_pay)
  if(gross_pay<=300.0){
    println("Withholding tax: 10%")
    pay = gross_pay - ((gross_pay*10)/100)
  }
  else{
    print("Withholding tax: 12%")
    pay = gross_pay - ((gross_pay*12)/100)
  }
  println("Net Worth: $"+pay)
}
