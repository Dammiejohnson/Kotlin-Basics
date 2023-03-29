package kodeco

fun main() {

    val countries = arrayOf("Benin", "Nigeria", "Senegal", " Togo")
    print(countries)
    print(countries.size)

    val updatedArray = countries + "America"
    println(updatedArray.size)

    countries[2] = "Australia"
    println(countries[2])

    //creating an array without using the arrayof function

    val sizedArray = Array(10){""}
    val emptyArray = emptyArray<String>()

    val currentCountry = "China"
    println(countries.contains(currentCountry))

    val isWestAfricanCountry = currentCountry in countries
    val isNotAWestAfricanCountry = currentCountry !in countries

    println(isWestAfricanCountry)
    println(isNotAWestAfricanCountry)
}