package com.example.expensetracker.core.network

import com.example.expensetracker.core.domain.model.Expense
import com.example.expensetracker.core.domain.model.Category
import java.util.Date
import javax.inject.Inject

class ExpenseApiImpl @Inject constructor() : ExpenseApi {
    
    // Sample data for demonstration
    private val sampleExpenses = mutableListOf(
        Expense(
            id = "1",
            title = "Groceries",
            amount = 85.50,
            category = "Food",
            description = "Weekly grocery shopping",
            date = Date(),
            isIncome = false
        ),
        Expense(
            id = "2",
            title = "Salary",
            amount = 3000.00,
            category = "Income",
            description = "Monthly salary",
            date = Date(),
            isIncome = true
        ),
        Expense(
            id = "3",
            title = "Gas",
            amount = 45.00,
            category = "Transportation",
            description = "Fuel for car",
            date = Date(),
            isIncome = false
        )
    )

    override suspend fun getExpenses(): List<Expense> {
        // Simulate network delay
        kotlinx.coroutines.delay(500)
        return sampleExpenses.toList()
    }

    override suspend fun addExpense(expense: Expense) {
        sampleExpenses.add(expense)
    }

    override suspend fun updateExpense(expense: Expense) {
        val index = sampleExpenses.indexOfFirst { it.id == expense.id }
        if (index != -1) {
            sampleExpenses[index] = expense
        }
    }

    override suspend fun deleteExpense(id: String) {
        sampleExpenses.removeAll { it.id == id }
    }

    override suspend fun getExpenseById(id: String): Expense? {
        return sampleExpenses.find { it.id == id }
    }
} 