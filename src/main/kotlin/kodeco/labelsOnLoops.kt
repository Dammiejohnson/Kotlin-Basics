package kodeco

fun main() {

   row@ for (row in 0..5){
       column@ for (column in 0..5){
           if (row == 2 && column == 2){
               break@row
           }
            print("* ")
        }
        println()
    }
}