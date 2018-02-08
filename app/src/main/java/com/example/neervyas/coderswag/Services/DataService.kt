package com.example.neervyas.coderswag.Services

import com.example.neervyas.coderswag.Model.Category
import com.example.neervyas.coderswag.Model.Product

/**
 * Created by neervyas on 7/2/18.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie","$18", "hat1"),
            Product("Devslopes Hat Balck","$20", "hat2"),
            Product("Devslopes Hat White","$18", "hat3"),
            Product("Devslopes Hat Snapback","$22", "hat4"),
            Product("Devslopes Graphic Beanie","$18", "hat1"),
            Product("Devslopes Hat Balck","$20", "hat2"),
            Product("Devslopes Hat White","$18", "hat3"),
            Product("Devslopes Hat Snapback","$22", "hat4"),
            Product("Devslopes Graphic Beanie","$18", "hat1"),
            Product("Devslopes Hat Balck","$20", "hat2"),
            Product("Devslopes Hat White","$18", "hat3"),
            Product("Devslopes Hat Snapback","$22", "hat4")


    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray","$28", "hoodie1"),
            Product("Devslopes Hoodie Red","$32", "hoodie2"),
            Product("Devslopes Gray Hoodie","$28", "hoodie3"),
            Product("Devslopes Black Hoodie","$32", "hoodie4"),
            Product("Devslopes Hoodie Gray","$28", "hoodie1"),
            Product("Devslopes Hoodie Red","$32", "hoodie2"),
            Product("Devslopes Gray Hoodie","$28", "hoodie3"),
            Product("Devslopes Black Hoodie","$32", "hoodie4"),
            Product("Devslopes Hoodie Gray","$28", "hoodie1"),
            Product("Devslopes Hoodie Red","$32", "hoodie2"),
            Product("Devslopes Gray Hoodie","$28", "hoodie3"),
            Product("Devslopes Black Hoodie","$32", "hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black","$18", "shirt1"),
            Product("Devslopes Badge Light Gray","$20", "shirt2"),
            Product("Devslopes Logo Shirt Red","$28", "shirt3"),
            Product("Devslopes Hustle","$28", "shirt4"),
            Product("Kickflip Studios","$18", "shirt5"),
            Product("Devslopes Shirt Black","$18", "shirt1"),
            Product("Devslopes Badge Light Gray","$20", "shirt2"),
            Product("Devslopes Logo Shirt Red","$28", "shirt3"),
            Product("Devslopes Hustle","$28", "shirt4"),
            Product("Kickflip Studios","$18", "shirt5"),
            Product("Devslopes Shirt Black","$18", "shirt1"),
            Product("Devslopes Badge Light Gray","$20", "shirt2"),
            Product("Devslopes Logo Shirt Red","$28", "shirt3"),
            Product("Devslopes Hustle","$28", "shirt4"),
            Product("Kickflip Studios","$18", "shirt5")

    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {

        return when(category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> digitalGood
        }

    }
}