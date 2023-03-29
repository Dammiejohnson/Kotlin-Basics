package kodeco

fun main() {
    val age = 23

//  when(age) {
//    in 0..12 -> println("Still a young human")
//    in 13..19 -> println("Teenager")
//    in 20..29 -> println("In your twenties")
//    in 30..39 -> println("In your thirties")
//    in 40..49 -> println("In your forties")
//    else -> println("You're a wise person :]")
//  }

    val message = when(age) {
        in 0..12 -> "Still a young human"
        in 13..19 -> "Teenager"
        in 20..29 -> "In your twenties"
        in 30..39 -> "In your thirties"
        in 40..49 -> "In your forties"
        else -> "You're a wise person :]"
    }

    println(message)

    val email = "john@mail.com"
    val password = "iLoveKotlin!"

//  when {
//    email.isEmpty() -> {
//      println("You need to choose an email")
//    }
//
//    "@" !in email -> {
//      println("Your email is invalid :[")
//    }
//
//    password.isEmpty() -> {
//      println("You need to choose a password!")
//    }
//
//    password.length < 10 -> {
//      println("Password not strong enough :[")
//    }
//
//    else -> {
//      println("Email length: ${email.length}, " +
//        "Password length: ${password.length}")
//    }
//  }

    when {
        email.isEmpty() -> println("You need to choose an email!")

        "@" !in email -> println("Your email is invalid :[")

        password.isEmpty() -> println("You need to choose a password!")

        password.length < 10 -> println("Password not strong enough :[")

        else -> println("Email length: ${email.length}, " +
                "Password length: ${password.length}")
    }
}