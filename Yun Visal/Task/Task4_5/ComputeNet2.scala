package Task.Task4_5

object ComputeNet2 extends App {
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
  else if(gross_pay<=400.00){
    println("Withholding tax: 12%")
    pay = gross_pay - ((gross_pay*12)/100)
  }
  else if(gross_pay<=500.00){
    println("Withholding tax: 15%")
    pay = gross_pay - ((gross_pay*15)/100)
  }
  else{
    println("Withholding tax: 20%")
    pay = gross_pay - ((gross_pay*20)/100)
  }
  println("Net Worth: $"+pay)
}
