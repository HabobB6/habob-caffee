package com.example.habobcaffee.Presentation.Coffee_List

import com.example.habobcaffee.Domain.CoffeErrosType
import com.example.habobcaffee.Domain.CoffeeData

data class Coffee_List_State(
    val Coffee_Loading : Boolean = false,
    val Coffee_List : List<CoffeeData> = emptyList(),
    val Coffee_Selected : Int? = null,
    val SearchQuery : String = "",
    val SearchResults : List<CoffeeData> = emptyList(),
    val FavoriteCoffees : List<Int> = emptyList(), // Coffe data Ids

)
