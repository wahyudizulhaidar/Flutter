package com.wahyuzul.flutter.database

import javax.inject.Inject

class ReminderRepository @Inject constructor(
    private val reminderDao: ReminderDao
){
    fun getAllReminder(reminder: ReminderEntity) {
        reminderDao.getAllReminders()
    }

    suspend fun getReminderById(id: Int): ReminderEntity? {
        return reminderDao.getReminderById(id)
    }

    suspend fun deleteReminderById(id: Int) {
        reminderDao.deleteReminderById(id)
    }

    suspend fun insertReminder(reminder: ReminderEntity) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun updateReminder(reminder: ReminderEntity) {
        reminderDao.updateReminder(reminder)
    }
}