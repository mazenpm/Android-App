package com.example.expensetracker.core.data.di

import com.example.expensetracker.core.data.repository.ExpenseRepositoryImpl
import com.example.expensetracker.core.domain.repository.ExpenseRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideExpenseRepository(
        expenseRepositoryImpl: ExpenseRepositoryImpl
    ): ExpenseRepository = expenseRepositoryImpl
}
