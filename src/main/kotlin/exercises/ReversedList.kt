fun main() {
    val list = mutableListOf<Int>()
    println("ENTER 5 NUMBERS")
    for(item in 1..5) {
        val input = readln().toInt()
        list.add(input)
    }
    println("You have created a new list: $list")
    for(item in list.size-1 downTo 0){
        println(list[item])
    }
}