package Assignment

import scala.collection.mutable.ArrayBuffer

object Electronic_Store extends App {
  var money_shop_data = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  var s = money_shop_data(0)
  var n = money_shop_data(1)
  var m = money_shop_data(2)

  var keyboard_price = scala.io.StdIn.readLine().split(" ").map(_.toInt)
  var usb_price = scala.io.StdIn.readLine().split(" ").map(_.toInt)

  var temp = ArrayBuffer[Int]()

  if(keyboard_price.length==n){
    if(usb_price.length==m){
      for(i <- keyboard_price){
        for(j <- usb_price){
          if(i+j<=s){
            temp += i+j
          }
        }
      }
    }
  }
  println(temp.max)
}
