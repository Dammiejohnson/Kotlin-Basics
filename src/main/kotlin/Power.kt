fun main() {
    println("Enter first number: ")
    val x = readLine()?.toInt()
    println("Enter second number: ")
    val y = readLine()?.toInt()

    var result = 1
    var i = 0

    while(x != null && y!= null && i < y ){
        result *= x
        i++
    }
    println("The value of $x to the power of $y is: $result")
}