package com.wahyuzul.flutter.di

import android.content.Context
import androidx.room.Room
import com.wahyuzul.flutter.database.ReminderDao
import com.wahyuzul.flutter.database.ReminderDatabase
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

class Injection {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): ReminderDatabase {
        return Room.databaseBuilder(
            context,
            ReminderDatabase::class.java,
            "reminder_database"
        ).build()
    }

    @Provides
    fun provideReminderDao(database: ReminderDatabase): ReminderDao {
        return database.reminderDao()
    }
}