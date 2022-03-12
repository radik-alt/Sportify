package com.example.pet.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity (
    tableName = "accounts",
    indices = [
        Index("email", unique = true)
    ]
)

data class AccountDbEntity(
    @PrimaryKey (autoGenerate = true) val id: Long,
    @ColumnInfo (collate = ColumnInfo.NOCASE) val email: String,
    val userName: String,
    val password: String,
    @ColumnInfo (name = "create_at") val createAt : Long
)
