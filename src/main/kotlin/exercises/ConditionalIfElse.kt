fun main() {
    println("How old are you??")
    val age = readLine()?.toInt()

    if(age in 0..5){
        println("You're a young kid")
    } else if(age in 6..17){
        println("You're a Teenager")
    } else if(age == 18){
        println("Finally You're 18!!")
    } else if(age == 19 || age == 20){
        println("You're a young adult")
    } else if(age in 21.. 65){
        println("You're an Adult")
    }else{
        println("You're really old")
    }
}