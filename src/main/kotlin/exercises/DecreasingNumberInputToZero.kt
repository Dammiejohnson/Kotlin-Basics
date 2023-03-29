fun main(){
    println("Please enter a number")
    var x = readLine()?.toInt()
    while(x != null  && x >= 0) {
        println(x)
        x--
    }
}