fun main(args: Array<String>){
    // Declaring strings
    val str = "May the force be with you."
    println(str)

    // Escaped characters
    val str2 = "She said \"Hello Dude!\""
    val str3 = "Here comes a new line.\n Did you see it"

    // Concatenating strings
    val name = "Julia"
    val num = 2
    val obj = "laptops"
    val food = "desserts"
    val drink = "coconut water"
    println("$name has $num $obj and loves eating ${food.uppercase()} and $drink")

    // Multi-line string
    val str4 = """a long time ago,
        in a galaxy
        far, far, away..."""
    println(str4)

    // Comparing strings, contains, uppercase
    val contentEquals = str.contentEquals("May the force be with you.")
    println(contentEquals)

    val contains = str.contains("Force", false)
    println(contains)

    val uppercase = str.uppercase()
    val lowercase = str.lowercase()
    println(uppercase+" : "+lowercase)

    val subsequence = str.subSequence(4, 13)
    println(subsequence)

}