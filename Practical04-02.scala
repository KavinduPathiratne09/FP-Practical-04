import scala.io.StdIn.readLine

object PatternMatchingApp {
  def main(args: Array[String]): Unit = {
    println("Please enter an integer:")

    val input = readLine()
    if (input.length != 1) {
      println("Please provide exactly one integer as input.")
      return
    }
    input.toIntOption match {
      case Some(number) =>
        number match {
          case x if x <= 0 => println("Negative/Zero is input")
          case x if x % 2 == 0 => println("Even number is given")
          case _ => println("Odd number is given")
        }
      case None => println("Invalid input. Please provide a valid integer.")
    }
  }
}
