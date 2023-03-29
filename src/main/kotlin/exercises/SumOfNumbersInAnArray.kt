fun main() {
    val myArray = arrayOf(1,3,4,5,6,2)
    var sum = 0

    for (item in myArray){
        sum += item
    }
    println("The sum of all the numbers in the array is : $sum")
}