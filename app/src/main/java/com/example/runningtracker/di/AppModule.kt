package com.example.runningtracker.di

import android.content.Context
import androidx.room.Room
import com.example.runningtracker.db.RunningDatabase
import com.example.runningtracker.other.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app, RunningDatabase::class.java, Constants.RUNNING_DATABASE_NAME

    ).build()

    @Singleton
    @Provides
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()
}