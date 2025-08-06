package com.example.expensetracker.core.network.di

import com.example.expensetracker.core.domain.repository.ExpenseRepository
import com.example.expensetracker.core.data.repository.ExpenseRepositoryImpl
import com.example.expensetracker.core.network.ExpenseApi
import com.example.expensetracker.core.network.ExpenseApiImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {

    @Binds
    @Singleton
    abstract fun bindExpenseApi(
        expenseApiImpl: ExpenseApiImpl
    ): ExpenseApi

    @Binds
    @Singleton
    abstract fun bindExpenseRepository(
        expenseRepositoryImpl: ExpenseRepositoryImpl
    ): ExpenseRepository
} 