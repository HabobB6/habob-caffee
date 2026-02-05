package com.example.habobcaffee.Domain

data class CoffeeData(
    val Coffee_ID : Int?= null,
    val Coffee_Name : String="",
    val Coffee_Type : CoffeeType?=null,
    val Coffee_Price : Double=0.0,
    val Coffee_Description : String="",
    val Coffee_Rating : Float=0f,
    val Coffee_ImageURL :  String="",
    val Coffee_Quantity : Int=0,
    val Perches_Count: Long=0
    )




enum class CoffeeType{
    NOIR,CREAM,TEE,SHIH
}

enum class CoffeErrosType{
    NO_CONNECTION,TIMEOUT,ORDER_DIDNT_PASS
}