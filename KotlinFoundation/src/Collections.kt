// kotlin doesn't have its own collection classes
fun main(args: Array<String>){
    // Immutable array type
    val desserts = listOf("Chocolate", "Macaron", "Cheesecake", "Ice Cream", "Donuts")
    println(desserts.sorted())
    println(desserts)
    println(desserts[3])
    println(desserts.last())
    println(desserts.contains("Cupcake"))

    // Mutable array type
    val starters = arrayListOf("Coxinha", "French Fries", "Nuggets")
    println(starters.size)
    starters.add("Cesar Salad")
    println(starters)
    starters.add(1, "Cheese ball")
    println(starters)
    println(starters.indexOf("French Fries"))
    starters.remove("Cesar Salad")
    println(starters)

    // Maps --> (key, value) --> unordered (duplicate keys)
    // Immutable map
    val dessertsMenu = mapOf("Chocolate" to 5.90, "Cupcake" to 8.50)
    println(dessertsMenu["Chocolate"])
    println(dessertsMenu.get("Cupcake"))
    println(dessertsMenu.getOrDefault("Macaron", -1.0))
    println(dessertsMenu.values)

    // Mutable map
    val startersMenu = hashMapOf("Coxinha" to 3.0, "French Fries" to 5.8)
    startersMenu["Coxinha"] = 5.0
    startersMenu.put("Nuggets", 9.0)
    println(startersMenu)
    startersMenu.remove("Nuggets")
    println(startersMenu)
    println(startersMenu.isEmpty())
}
