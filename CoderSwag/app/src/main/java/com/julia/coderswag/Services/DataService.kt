package com.julia.coderswag.Services

import com.julia.coderswag.Model.Category
import com.julia.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$19", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$30", "hoodie3"),
        Product("Devslopes Black Hoodie", "$29", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$18", "shirt1"),
        Product("Devslopes Badge lIGHT Gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4"),
        Product("Kickflip Studios", "$18", "shirt5"),
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String):List<Product>{
        return when(category){
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> hoodies
            else -> return digitalGood
        }
    }
}