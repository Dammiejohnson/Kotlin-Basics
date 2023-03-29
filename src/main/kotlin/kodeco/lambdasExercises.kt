package kodeco

fun main() {
    var prices = arrayOf(1.50, 10.00, 4.99, 2.30, 8.19)

//  for (price in prices) {
//    println(price)
//  }

//  prices.forEach(::println)

//  var salePrices = mutableListOf<Double>()
//  for (price in prices) {
//    salePrices.add(price * 0.9)
//  }
//  println(salePrices)

    val salePrices = prices.map { it * 0.9 }
//  println(salePrices)

    val largePrices = prices.filter { it > 5.0 } //literally filters the collection based on the condition passed
//  println(largePrices)

    val sum = prices.reduce {a, b ->
        a + b
    } //this takes two arguments, the current accumulated value and the value after it but this is based on the assignment we pass in the lambda function
    //reduce accumulates the result of the previous operation and passes the value to the next operation
    println(sum)


    val userInput = listOf("meow!", "15", "37.5", "seven", "42")

    val numbers = userInput.map {
        it.toIntOrNull()
    }
//  println(numbers)

    val validInput = userInput.mapNotNull {
        it.toIntOrNull()
    }
//  println(validInput)
}