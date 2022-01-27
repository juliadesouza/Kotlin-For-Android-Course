// A lambda expression is a function literal
// it's not declared, doesn't have a name.
fun main() {
    val printMessage = {message:String -> println(message)}
    printMessage("Hello")

    val sumA = {x:Int, y:Int -> x+y}
    println(sumA(5,2))

    val sumB:(Int,Int) -> Int={x,y->x+y}

    // CALLBACKS - EX 01
    fun downloadData(url:String, completion: ()->Unit){ // unit is equivalent to 'void'
        // sent a download request
        // we got back data
        // there were no network errors
        completion()
    }
    // call downloadDataFunction
    downloadData("fakeUrl.com", {
        println("The code in this block will only run after the completition()")
    })

    // CALLBACKS - EX 02
    // If the last argument of the function is a lambda,
    // the function literal is written outside -- look at downloadCarData
    fun downloadCarData(url: String, completion: (Car) -> Unit){
        // send a download request
        // we got back a car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }
    downloadCarData("fakeUrl.com"){ car ->
        println(car.color)
        println(car.make)
    }
    // if we have just one parameter, we can also do
    // downloadCarData("fakeUrl.com"){
    //     println(it.color)
    //     println(it.make)
    // }

    // CALLBACKS - EX 03 -> with nullable
    fun downloadTruckData(url:String, completion: (Truck?, Boolean) -> Unit){
        // make the web request
        // we get the results back
        val webRequestSuccess = true
        if(webRequestSuccess){
            // received truck data
            val truck = Truck("Ford", "F-150",  10000 )
            completion(truck, true)
        } else {
            completion(null, false)
        }
    }

    downloadTruckData("fakeUrl.com"){
        truck, success ->
        if(success){
            truck?.tow()
        } else {
            println("Something went wrong!")
        }
    }


}