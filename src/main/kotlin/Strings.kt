

fun main (){
    val myName = "dami"
    println("My name is: ${myName.uppercase()}")

    val name: String = myName?.substring(0,2)?: "sanni"
    println(name)


}