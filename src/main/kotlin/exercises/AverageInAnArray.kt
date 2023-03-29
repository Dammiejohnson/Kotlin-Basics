fun main() {
    println("Enter  5 numbers")
    var sum = 0.0
    var avg = 0.0

    for (item in 1..5){
        val input = readLine()?.toInt()
        if (input != null){
            sum += input
            avg = sum/5.0
        }
    }
    println("Average = $avg")
}