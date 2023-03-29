import java.lang.Math.PI

/*Create a program that calculates the area of a circle. Prompt the user for the radius and display the result.*/

fun main(){
    print("Enter the radius of the Circle in centimetres: ")

    val radius = readln().toDouble()
    val pi = PI
    val areaOfACircle : Double = pi * radius * radius
    println("The area of the circle with radius $radius cm is $areaOfACircle")
}