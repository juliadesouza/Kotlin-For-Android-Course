// When you create a variable, you need to set a value
fun main(args: Array<String>) {
    // Declaring Mutable Variables
    var isAwesome = true
    var a = 3
    var b = 6

    // Declaring Immutable Variables
    val name = "Julia"

    // "Declaring" type
    var x: Int = 5
    var hero: String = "Batman"
    var month: String
    month = "January"

    // Printing variables
    println("Is " + name + " awesome? The answer is: " + isAwesome)
    println(a+b)

    // Doubles, floats and longs
    val doubleNum = 123.45 // 64 bit number
    val floatnUM = 123.45f // 32 bit
    val longNum = 123456789123L // 64 bit

    // Converting types
    val aString = a.toString()
}