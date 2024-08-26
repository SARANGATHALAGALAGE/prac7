import scala.io.StdIn._

object EvenNumberFilter {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    // Using the filter method with a lambda function to filter out even numbers
    numbers.filter(number => number % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    // Prompting user for input
    println("Enter a list of integers separated by spaces:")

    // Reading the user's input as a string
    val input = readLine()

    // Splitting the input string by spaces and converting each part to an integer
    val inputList = input.split(" ").map(_.toInt).toList

    // Filtering even numbers
    val evenNumbers = filterEvenNumbers(inputList)

    // Printing the result
    println("Even numbers: " + evenNumbers.mkString(", "))
  }
}
