package kodeco

fun main() {
    fun sumOfElements(list: List<Int>): Int {
        var sum = 0
        for (number in list) {
            sum += number
        }
        return sum
    }

    println(sumOfElements(listOf(2, 2, 8, 6, 1)))
}