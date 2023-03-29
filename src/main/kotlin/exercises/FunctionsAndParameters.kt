fun main() {
    printPower(3,5)

    sumUpToN(5)

    println( sumUpToNWithReturn(5))

    println(oneLineFunction(2,2))

    val list = listOf(1,2,3,4,5)
    println(printFirst(list))

    searchFor("book")
    searchFor("book", "library")

    println(getMax(2,4,5,6,6,7,7,100))

    val input = readLine()?.toInt()
    if (input != null){
        println("The index of $input is ${indexOf(list, input)}")
    }


}

fun printPower( base: Int, exponent:Int){
    var result = 1
    for (item in 1..exponent){
        result *= base
    }
    println("$base to the power of $exponent is: $result")
}

fun sumUpToN(number: Int){
    var result = 0
    for(item in 1 until number){
        result += item
    }
    println("The sum of the values from 1 to $number is $result")
}

fun sumUpToNWithReturn(number: Int): Int{
    var result = 0
    for(item in 1 until number){
        result += item
    }
    return result
}

fun oneLineFunction(a:Int, b:Int) = a*b

fun printFirst(list:List<Int>) = println(list[0])

fun searchFor(search: String, searchEngine: String = "Google"){
    println("Searching for $search on $searchEngine")
}

fun getMax(vararg numbers: Int):Int {
    var max = numbers[0]
    for (number in numbers) {
        if (number > max){
            max = number
        }
    }
    return max
}

fun indexOf(list: List<Int>, value: Int):Int{
    for (item in list.indices){
        if(list[item] == value){
            return item
        }
    }
    return -1
}