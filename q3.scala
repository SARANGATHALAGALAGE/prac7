import scala.io.StdIn

object PrimeFilter {
  // Helper function to check if a number is prime
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  // Function to filter prime numbers using a lambda function
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(num => isPrime(num)) // Lambda function used here
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers separated by spaces:")
    val input = StdIn.readLine() // Read input as a single line of text
    val numbers = input.split("\\s+").map(_.toInt).toList // Convert input to a list of integers
    
    val primes = filterPrime(numbers)
    println(s"Prime numbers: $primes")
  }
}
