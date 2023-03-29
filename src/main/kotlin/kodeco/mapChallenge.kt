package kodeco

fun main() {
//  val pets = mutableMapOf<String, String>()
//
//  pets["Ozma"] = "Domestic Medium Hair Cat"
//  pets["Zuri"] = "Black Hamster"
//  pets["Migos"] = "Golden Retriever Dog"
//
//  pets.remove("Ozma")

    val pets = mapOf("Ozma" to "Domestic Medium Hair Cat", "Zuri" to "Black Hamster", "Migos" to "Golden Retriever Dog")

    //the above expression is a simpler way to assign key to values of maps provided that the wonuld not be changed or that itr is immutable.

    for ((name, breed) in pets) {
        println("The pet $name is a $breed")
    }
}