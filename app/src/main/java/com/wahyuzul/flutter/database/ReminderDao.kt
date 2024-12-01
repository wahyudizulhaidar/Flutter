package com.wahyuzul.flutter.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ReminderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReminder(reminder: ReminderEntity)

    @Query("SELECT * FROM reminder WHERE id = :id")
    suspend fun getReminderById(id: Int): ReminderEntity?

    @Query("SELECT * FROM reminder")
    fun getAllReminders(): LiveData<List<ReminderEntity>>

    @Query("DELETE FROM reminder WHERE id = :id")
    suspend fun deleteReminderById(id: Int)

    @Update
    suspend fun updateReminder(reminder: ReminderEntity)
}