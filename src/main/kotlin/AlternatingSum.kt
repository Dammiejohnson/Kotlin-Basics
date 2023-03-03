fun main() {
    val sum = alternatingSum(3,4,5,2,1,2,3)
    println("The alternating sum of the numbers is $sum")

}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for(number in numbers){
        if(toggle){
            sum += number
        } else {
            sum -= number
        }
        toggle = !toggle
    }
    return sum
}

//fun alternatingSum(vararg numbers: Int):Int {
//    var sum = 0
//    for((x, i) in numbers.withIndex()) {
//        if(x%2 == 0) sum += i
//        else sum -= i
//    }
//    return sum
//}