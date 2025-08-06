package com.example.expensetracker.core.data.repository

import com.example.expensetracker.core.domain.model.Expense
import com.example.expensetracker.core.domain.network.ExpenseApi
import com.example.expensetracker.core.domain.repository.ExpenseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ExpenseRepositoryImpl @Inject constructor(
    private val api: ExpenseApi
) : ExpenseRepository {

    override fun getExpenses(): Flow<List<Expense>> = flow {
        try {
            val expenses = api.getExpenses()
            emit(expenses)
        } catch (e: Exception) {
            // In a real app, you'd handle errors and fallback to local storage
            emit(emptyList())
        }
    }

    override suspend fun addExpense(expense: Expense) {
        api.addExpense(expense)
    }

    override suspend fun updateExpense(expense: Expense) {
        api.updateExpense(expense)
    }

    override suspend fun deleteExpense(id: String) {
        api.deleteExpense(id)
    }

    override suspend fun getExpenseById(id: String): Expense? {
        return try {
            api.getExpenseById(id)
        } catch (e: Exception) {
            null
        }
    }
} 