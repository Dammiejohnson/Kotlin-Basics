fun main() {
    for (i in 1..5){
        print("*")
        for (j in 5 downTo i+1){
            print("*")
        }
        println()
    }
}