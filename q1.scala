object EvenNumberFilter {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    // Using the filter method with a lambda function to filter out even numbers
    numbers.filter(number => number % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    // Example usage
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEvenNumbers(inputList)
    println(evenNumbers)  // Output: List(2, 4, 6, 8, 10)
  }
}
