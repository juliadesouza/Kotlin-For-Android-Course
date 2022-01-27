fun main(args: Array<String>){
    // For loop
    val starters = arrayListOf("Coxinha", "French Fries", "Nuggets")
    val startersMenu = hashMapOf("Coxinha" to 3.0, "French Fries" to 5.8)

    for(starter in starters){
        println("Starter: $starter")
    }

    for((key, value) in startersMenu){
        println("$key.......USD $value")
    }

    // While loop
    var x = 10
    while(x>0){
        println(x)
        x--
    }
}