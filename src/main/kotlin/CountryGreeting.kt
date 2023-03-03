fun main() {
    println("Where are you from??")
    val country = readLine()?.uppercase()

    when (country) {
        "INDIA" -> println("Namaste")
        "USA" -> println("Hello")
        "GERMANY" -> println("Hallo")
        "RUSSIA" -> println("Pivet")
        else -> println("I do not know what to say in your language")
    }
}