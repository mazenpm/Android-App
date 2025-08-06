package com.example.expensetracker.core.network.di

import com.example.expensetracker.core.domain.network.ExpenseApi
import com.example.expensetracker.core.network.ExpenseApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideExpenseApi(
        expenseApiImpl: ExpenseApiImpl
    ): ExpenseApi = expenseApiImpl
} 