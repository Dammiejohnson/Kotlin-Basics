fun main() {
    val list = mutableListOf<Int>(0,1)
    println("Enter a number to check the fibonacci series")
    val number = readLine()?.toInt()
    if (number != null){
        for (item in 2 until number-1){
            list.add(list[item-2] + list[item-1])
        }
    }
    println("The fibonacci series of $number is : $list")
}