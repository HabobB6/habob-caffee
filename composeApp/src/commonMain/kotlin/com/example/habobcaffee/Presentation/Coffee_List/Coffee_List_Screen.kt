package com.example.habobcaffee.Presentation.Coffee_List

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CoffeeListScreen(
    state: Coffee_List_State,
    onAction: (Coffee_List_Action) -> Unit
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Search Bar
            TextField(
                value = state.SearchQuery,
                onValueChange = { onAction(Coffee_List_Action.OnSearchQueryChange(it)) },
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                placeholder = { Text("Search for a coffee...") }
            )

            // Tabs
            TabRow(selectedTabIndex = state.SelectedTabIndex) {
                Tab(selected = state.SelectedTabIndex == 0, onClick = { onAction(Coffee_List_Action.OnTabSelected(0)) }) {
                    Text("All Coffees")
                }
                Tab(selected = state.SelectedTabIndex == 1, onClick = { onAction(Coffee_List_Action.OnTabSelected(1)) }) {
                    Text("Favorites")
                }
            }

            // Coffee List
            LazyColumn(modifier = Modifier.fillMaxSize()) {
                items(state.Coffee_List) {
                    Coffee(coffee = it)
                }
            }
        }
    }
}
