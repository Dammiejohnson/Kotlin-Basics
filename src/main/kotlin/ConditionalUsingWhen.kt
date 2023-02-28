fun main() {
    println("How old are you??")
    val age = readLine()?.toInt()

    when (age) {
        in 0..5 -> println("You're a young kid")
        in 6..17 -> println("You're a Teenager")
        18 -> println("Finally You're 18!!")
        19, 20 -> println("You're a young adult")
        in 21.. 65 -> println("You're an Adult")
        else -> println("You're really old")
    }
}