package kodeco

fun main() {
    val email: String? = "mail@mail.com"
    val password: String? = "password"

    fun validateString(input: String?, inputType: String) =
        if (input == null || input.isBlank()) {
            false
        } else if (inputType == "Password") {
            input.length >= 10
        } else if (inputType == "Email") {
            input.contains("@")
        } else {
            println("Cannot verify this input type")

            false
        }

    fun validateString(input: String?, validator: (String) -> Boolean) =
        if (input == null || input.isBlank()) {
            false
        } else {
            validator(input)
        }

    validateString("Hello World", "Welcome Message")

    val isValidEmail = validateString(email, "Email")
    println(isValidEmail)

//  val isValidPassword = validateString(password, { it.length >= 10 })
    val isValidPassword = validateString(password) { input -> input.length >= 10 }
    println(isValidPassword)

    fun validatePassword(password: String) = password.length >= 10

    val isValidPword = validateString(password, ::validatePassword)
    println(isValidPword)

    val passwordValidator = ::validatePassword
    println(passwordValidator("Weak PW"))

    val validator: (String?) -> Boolean = {input ->
        input != null && validatePassword(input)
    }
    println(validator("ReallyStrongPassword123"))
}