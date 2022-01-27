// Something to be NULL
// We cannot assign null to a variable that is not
// explicitly set to be nullable
fun main() {
    var name: String = "Julia"
    var nullableName:String?="Do I really exist?"
    // nullableName = null

    // Null Check
    var length = 0
    if(nullableName != null){
        length = nullableName.length
    } else {
        length = -1
    }
    val l = if(nullableName!=null) nullableName.length else -1

    // Second method: safe operator ?
    println(nullableName?.length) // it will return null

    // Third method is Elvis operator
    // if there is a null value, return some value
    val len = nullableName?.length?:-1
    val noName = nullableName?:"No one knows me..."
    println(noName)

    // Null pointer exception: !! --> when you know 100%
    // that the value does exist
    println(nullableName!!.length)
}