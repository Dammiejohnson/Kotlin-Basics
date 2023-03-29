package kodeco

fun main() {
//    val fullName = Pair<String, String>("Oluwadamilola", "Sanni")
//    val(firstname, lastname) = fullName
//    val age = 100
//
//    println("His fullname is ${fullName.first}, ${fullName.second}")
//    println("His fullname is ${firstname}, ${lastname}")
//
//    val birthday = Triple(2,2,1902)
//    val person  = Pair("Oluwadamilola Sanni", birthday)
//
//    println("${person.first}, ${person.second}")
//
//    val nameUsingOrdering = person.first
//    val birthdayUsingOrdering = person.second
//    val(name, bday) = person // this is destructuring the variable person
//    val (dayOfBirthday, birthMonth, _) = bday //note that the underscore means that we can do away or ignore the  value and this is to destructure the variable birthday
//    val yearOfMonth = birthdayUsingOrdering.third
//
//    println("$name was born on $dayOfBirthday/$birthMonth, year unknown")

    val creditCard = Triple("9875434345676", "005", "Visa")
    val bankAccount = Pair(17000.0, creditCard)

    val (balance, card) = bankAccount
    val (cardNumber, securityCode, cardType) = creditCard

    println("The account has a $balance with the cardNumber: $cardNumber, $cardType")



}