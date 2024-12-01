package com.wahyuzul.flutter.database

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "reminder")
@Parcelize
data class ReminderEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    // 1 = toothbrush, 2 = medicine, 3 = clinic
    var reminder: Int,
    var date: Long,
    var time: Long,
    // 1 = daily, 2 = weekly, 3 = monthly, 4 = year
    var repeat: Int,
    var description: String,
    // 0 = false, 1 = true
    var isBoolean: Int
) : Parcelable