fun main(args: Array<String>){

    // Regular function
    fun sayHello(){
        println("Hello!!!");
    }
    sayHello()

    // Function with parameters
    fun sayHelloToSomeone(name: String){
        println("Hello, $name!!!")
    }
    sayHelloToSomeone("Julia");

    // Function with return
    fun calculateIMC(peso: Float, altura: Float):Float{
        return peso/(altura*altura);
    }
    val imc = calculateIMC(60f,1.60f)
    println("Your first imc is $imc")
    println("Your second imc is ${calculateIMC(50f, 1.6f)}")

    // Default values to the argument
    fun isFeeling(mood: String = "happy"){
        println(mood);
    }
    isFeeling("hungry")
    isFeeling()
}