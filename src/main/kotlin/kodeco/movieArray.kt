package kodeco

fun main() {
    val movies = arrayOf("John wick", "Pathaan", "Life in a year")

    movies[1] = "Stranger Things"
    println(movies[1])

    val movieList = movies.toMutableList()
    movieList.addAll(listOf("Night Agent", "Coco"))

    movieList.remove("Life in a year")

    println(movieList)

    println("Life in a year" in movieList)
}