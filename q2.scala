import scala.io.StdIn

object MainApp {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(x => x * x)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val inputString = StdIn.readLine()  // Read user input as a single line string
    val inputList = inputString.split(" ").map(_.toInt).toList  // Convert string to list of integers

    val output = calculateSquare(inputList)
    println(s"Squares of the input numbers: $output")
  }
}
