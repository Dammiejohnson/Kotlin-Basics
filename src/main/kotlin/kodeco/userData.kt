package kodeco

fun main (){
println(checkRegistration())

}

fun message(message: String){
    println(message)
}

fun checkRegistration(): String {
    message("Enter your email")
    val email = readln()
    message("Enter your password")
    val password = readln()
    message("Enter your username")
    val username = readln()

    val feedback = if(email.isEmpty() || password.isEmpty() || username.isEmpty()) {
        "You must fill in data!"
    } else if (username.length < 6) {
        "Username needs to be at least 6 characters long!"
    } else if (password.length < 10) {
        "Password needs to be at least 10 characters long!"
    } else if (!email.contains("@") || !email.contains(".")) {
        "Invalid email format"
    } else {
        "Successful Registration"
    }
    return feedback

}