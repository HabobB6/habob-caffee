package com.example.habobcaffee.Domain

data class CoffeeData(
    val Coffee_ID : String,
    val Coffee_Name : String,
    val Coffee_Type : String,
    val Coffee_Price : String,
    val Coffee_Description : String?,
    val Coffee_Rating : String?,
    val Coffee_ImageURL : List<String>,
    val Coffee_Quantity : String?
    )
