package com.example.habobcaffee.Presentation.Coffee_List

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class Coffee_List_View_Model : ViewModel() {

    private val _state = MutableStateFlow(Coffee_List_State())
    val state: StateFlow<Coffee_List_State> = _state.asStateFlow()

    fun onAction(action: Coffee_List_Action) {
        when (action) {
            is Coffee_List_Action.OnCoffeeClick -> {
                _state.update {
                    it.copy(
                        Coffee_Selected = action.Coffee
                    )
                }
            }
            is Coffee_List_Action.OnSearchQueryChange -> {
                _state.update {
                    it.copy(
                        SearchQuery = action.Query
                    )
                }
            }
            is Coffee_List_Action.OnTabSelected -> {
                _state.update {
                    it.copy(
                        SelectedTabIndex = action.index
                    )
                }
            }
        }
    }
}
