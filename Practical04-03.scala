object StringFormatter {

  // Method to convert a string to upper case
  def toUpper(input: String): String = input.toUpperCase

  // Method to convert a string to lower case
  def toLower(input: String): String = input.toLowerCase

  // Method to format a name using a given formatting function
  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    // Specific formatting functions for the given test cases
    val formatNiroshan = (input: String) => {
      if (input.length >= 2)
        input.substring(0, 2).toUpperCase + input.substring(2).toLowerCase
      else
        toUpper(input) // Fallback if input is shorter than 2 characters
    }

    val formatKumara = (input: String) => {
      if (input.nonEmpty)
        input.init.toLowerCase + input.last.toUpper
      else
        input // Fallback if input is empty
    }

    // Test inputs with specified formatting
    println(formatNames("Benny")(toUpper))          // Output: BENNY
    println(formatNames("Niroshan")(formatNiroshan)) // Output: NIroshan
    println(formatNames("Saman")(toLower))          // Output: saman
    println(formatNames("Kumara")(formatKumara))    // Output: KumarA
  }
}
