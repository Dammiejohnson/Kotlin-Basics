

fun main() {
    println("Input any word to check if it is a palindrome")
    val userInput = readLine()
    if (userInput != null){
        if(userInput.reversed() == userInput){
            println("The word $userInput is a palindrome")
        } else {
            println("The word $userInput is not a palindrome")
        }
    }
}
