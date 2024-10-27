fun main() {
    val nameList = listOf(
        "Sarah",
        "James",
        "Jessica",
        "Thelonious"
    )

    val (sara, james, jessica) = nameList
    println("$sara |  $james  | $jessica")
    // sames as this
    val saraIndex = nameList[0]
    val jamesIndex = nameList[1]
    val jessicaIndex = nameList[2]
    // Without using destructuring
    println("$saraIndex | $jamesIndex | $jessicaIndex")
}