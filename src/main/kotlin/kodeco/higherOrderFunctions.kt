package kodeco

/*
See Dwarves below.
I want them organized like this:
  - Grouped by which names come before or after M in the alphabet.
  - Sorted by name length.
  - No dwarves with names less than four letters long.
  - Turn dwarves before M into a map, grouped by the first letters in their names
 */

fun main() {
    val lotsOfDwarves = listOf(
        listOf("Sleepy", "Grumpy", "Doc", "Bashful", "Sneezy"),
        listOf("Thorin", "Nori", "Bombur")
    )

    val (beforeM, mAndAfter) = lotsOfDwarves.flatMap { dwarfs ->
        dwarfs.filter { it.length > 3 }
    }.sortedBy { -it.length }.partition { it < "M" }

    val groupedBeforeM = beforeM.groupBy { it.first() }

    println(groupedBeforeM)
    println(mAndAfter)

    //flatmap combines all the lists into one
    //filter removes the dwarf with length less than four letters
    // sorted by returns the reverse of lower length to higher length and makes it higher length to lower length
    //partition divides the list into the ones before letter M and the one after letter M into pair destructured variables
}