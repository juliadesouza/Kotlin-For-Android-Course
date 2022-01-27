fun main(args: Array<String>){
    // Exemplo 1
    val a = 2
    val b = 3

    if(a==b){
        println("EQUALS")
    }

    if(a!=b){
        println("NOT EQUALS")
    }

    // Exemplo 2
    val x = -30
    val y = -30

    if(x>y){
        println("X IS GREATER THAN Y")
    } else if (x<y){
        println("X IS LESS THAN Y")
    } else {
        println("X AND Y ARE EQUALS")
    }

    // Exemplo 3
    val isHungry = false
    val isBored = true

    if(isHungry || isBored){
        println("Lets get pizza")
    }
    if(isHungry && !isBored){
        println("Lets get salad")
    }

    // Exemplo 4 - Using WHEN -> its similar to 'switch'
    val num = 4
    when(num){
        1 -> println("num == 1")
        2 -> println("num == 2")
        else -> println("num does not equal 1 or 2")
    }
}