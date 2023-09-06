fun main(args: Array<String>) {
   val numbersStrings = listOf("One", "Two", "Three", "Four")
    println(numbersStrings)
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end" ))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 25, truncated = "<...>"))
//Transformation
    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
}