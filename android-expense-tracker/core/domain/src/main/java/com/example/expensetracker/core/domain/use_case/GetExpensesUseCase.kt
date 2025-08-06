package com.example.expensetracker.core.domain.use_case

import com.example.expensetracker.core.domain.model.Expense
import com.example.expensetracker.core.domain.repository.ExpenseRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetExpensesUseCase @Inject constructor(
    private val repository: ExpenseRepository
) {
    operator fun invoke(): Flow<List<Expense>> {
        return repository.getExpenses()
    }
} 