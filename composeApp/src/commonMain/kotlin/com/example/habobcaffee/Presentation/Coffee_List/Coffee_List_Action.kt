package com.example.habobcaffee.Presentation.Coffee_List
import com.example.habobcaffee.Domain.CoffeeData
import com.example.habobcaffee.Presentation.Coffee_List.Coffee_List_State

sealed interface Coffee_List_Action {
    data class OnSearchQueryChange(val Query: String) : Coffee_List_Action
    data class OnCoffeeClick(val Coffee: CoffeeData) : Coffee_List_Action
    data class OnTabSelected(val index: Int) : Coffee_List_Action

}