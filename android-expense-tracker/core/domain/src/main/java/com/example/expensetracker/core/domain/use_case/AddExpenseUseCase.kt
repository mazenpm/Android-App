package com.example.expensetracker.core.domain.use_case

import com.example.expensetracker.core.domain.model.Expense
import com.example.expensetracker.core.domain.repository.ExpenseRepository
import javax.inject.Inject

class AddExpenseUseCase @Inject constructor(
    private val repository: ExpenseRepository
) {
    suspend operator fun invoke(expense: Expense) {
        repository.addExpense(expense)
    }
} 