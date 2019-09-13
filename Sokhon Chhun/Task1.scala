object Task1 {
  def main(args: Array[String]){
    print("Amount of credit hour : ")
    val numberOfCreditHour = scala.io.StdIn.readLine().toInt
    print("Amount of book : ")
    val amountOfBook = scala.io.StdIn.readLine().toInt
    val priceOfBook = 12
    val amountPerOneCreditHour = 85
    val athleticFee = 65
    val totalFee = (numberOfCreditHour*amountPerOneCreditHour)+(amountOfBook*priceOfBook)+athleticFee
    println("student’s total fees : "+totalFee+"$")
    println("*Include athletic fee : 65$")
  }
}
