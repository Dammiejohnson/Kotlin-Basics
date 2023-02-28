fun main() {
    val myArray = arrayOf(1,4,5,6,23,19,100,30)
    var max = myArray[0]

    for (item in myArray){
        if(item > max){
            max = item
        }
    }
    println("The maximum number is : $max")


}