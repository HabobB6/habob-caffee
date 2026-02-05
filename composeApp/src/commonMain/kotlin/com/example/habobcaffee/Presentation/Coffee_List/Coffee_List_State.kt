package com.example.habobcaffee.Presentation.Coffee_List

import com.example.habobcaffee.Domain.CoffeeData

data class Coffee_List_State(
    val Coffee_Error : String? = null,
    val Coffee_Loading : Boolean = false,
    val Coffee_List : List<CoffeeData> = emptyList(),
    val Coffee_Selected : CoffeeData? = null,
    val SearchQuery : String = "Dark Coffee",
    val SearchResults : List<CoffeeData> = emptyList(),
    val FavoriteCoffees : List<CoffeeData> = emptyList(),
    val SelectedTabIndex: Int = 0
)
