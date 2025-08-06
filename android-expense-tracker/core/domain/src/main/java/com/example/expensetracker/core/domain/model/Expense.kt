package com.example.expensetracker.core.domain.model

import java.util.Date

data class Expense(
    val id: String,
    val title: String,
    val amount: Double,
    val category: String,
    val description: String?,
    val date: Date,
    val isIncome: Boolean = false
) 