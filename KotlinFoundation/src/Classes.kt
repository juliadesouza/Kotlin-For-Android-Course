// You don't have to worry about getters and setter
// In kotlin, all classes are final (it can't be inherited)
// by default --> use keyword 'open'

//class Car (val make: String, val model: String, var color: String){
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details(){
//        println("This is a $color $make $model")
//    }
//}
//
//class Truck(val make:String, val model:String, val towingCapacity: Int){
//    fun tow() {
//        println("Taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("The $make $model has towing capacity of $towingCapacity lbs")
//    }
//}

// Inheritance
open class Vehicle(val make: String, val model: String){
    open fun accelerate(){ // it allow you to override the method
        println("vroom vroom")
    }

    fun park(){
        println("parking the vehicle")
    }

    fun brake(){
        println("STOP")
    }
}

class Car(make: String, model:String, var color: String):Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous mode!")
        super.accelerate()
    }
}

class Truck(make: String, model: String, var towingCapacity:Int):Vehicle(make, model){
    fun tow(){
        println("headed out to the mountains!")
    }
}

fun main() {
//    val car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()

    val tesla = Car( "Tesla", "ModelS", "Red")
    tesla.accelerate()

    val truck = Truck("Ford", "F-150", 10000)
    truck.tow()
}