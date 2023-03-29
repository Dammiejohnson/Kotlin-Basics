package kodeco

fun main() {
    val userIds = setOf("ID1B", "ID2C", "ID3F", "ID8I")
    println(userIds)
    println(userIds.contains("ID3F"))
    println("ID1B" in userIds)

    val mutableIds = userIds.toMutableSet()

    println(mutableIds.add("ID0Z"))
    println(mutableIds)

    println(mutableIds.add("ID1B"))
    println(mutableIds)

    println(mutableIds.remove("ID1B"))

    for (userId in mutableIds) {
        println(userId)
    }

    val names = arrayOf("Jessy", "Catie", "Brian", "Janet", "Sandra", "April", "Jessy")
    val uniqueNames = names.toSet()
    println(uniqueNames)

    val items = listOf("Notebook", "Pen", "Bottle Water", "Phone", "Bottle Water", "Microphone", "Masking Tape")
    val uniqueItems = items.toMutableSet()
    println(uniqueItems)

    println(uniqueItems.remove("Phone"))
    println(uniqueItems.remove("Masking Tape"))

    for (item in uniqueItems) {
        println(item)
    }
}