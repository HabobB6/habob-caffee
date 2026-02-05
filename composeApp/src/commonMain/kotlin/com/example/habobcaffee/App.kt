package com.example.habobcaffee

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.habobcaffee.Presentation.Coffee_List.CoffeeListScreen
import com.example.habobcaffee.Presentation.Coffee_List.Coffee_List_View_Model


@Composable
@Preview
fun App() {
    val viewModel = Coffee_List_View_Model()
    val state by viewModel.state.collectAsState()
    CoffeeListScreen(
        state = state,
        onAction = viewModel::onAction
    )
}