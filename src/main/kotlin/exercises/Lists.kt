fun main() {
    val list = mutableListOf<Int>()
    println("ENTER 10 NUMBERS")
    for(item in 1..10) {
        val input = readLine()?.toInt()
        if(input != null){
            list.add(input)
        }
    }
    println("You have created a new list: $list")
}