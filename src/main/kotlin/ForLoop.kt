fun main() {
   val myArray = arrayOf(1, 2, 3)

   for (item in myArray){
       println(item)
   }

    println()

    for (item in 1..5){
        println(item)
    }
    println()

    for(item in 10 downTo 2){
        println(item)
    }
}