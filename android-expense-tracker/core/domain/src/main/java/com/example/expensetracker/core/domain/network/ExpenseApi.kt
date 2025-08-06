package com.example.expensetracker.core.domain.network

import com.example.expensetracker.core.domain.model.Expense

interface ExpenseApi {
    suspend fun getExpenses(): List<Expense>
    suspend fun addExpense(expense: Expense)
    suspend fun updateExpense(expense: Expense)
    suspend fun deleteExpense(id: String)
    suspend fun getExpenseById(id: String): Expense?
} 