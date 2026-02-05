package com.example.habobcaffee.Presentation.Coffee_List

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.habobcaffee.Domain.CoffeeData

@Composable
fun Coffee(
    coffee: CoffeeData,
) {

}

@Preview
@Composable
fun CoffeePreview() {
    Coffee(
        coffee = CoffeeData(
            Coffee_ID = "1",
            Coffee_Name = "Espresso",
            Coffee_Type = "Dark",
            Coffee_Price = "3.50",
            Coffee_Description = "A strong, full-bodied coffee.",
            Coffee_Rating = "4.5",
            Coffee_ImageURL = emptyList(),
            Coffee_Quantity = "1"
        )
    )
}
