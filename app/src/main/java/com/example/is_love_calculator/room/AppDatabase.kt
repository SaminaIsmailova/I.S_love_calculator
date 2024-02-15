package com.example.is_love_calculator.room

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getDao(): LoveDao
}