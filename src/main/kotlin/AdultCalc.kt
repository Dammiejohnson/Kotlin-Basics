

fun main(){
    println("Please enter your age:")
    val userInput = readLine()
    if(userInput !=null) {
        if(userInput.toInt() > 18){
            println("You are an adult")
        } else{
            println("You are not an adult")
        }
    }
}