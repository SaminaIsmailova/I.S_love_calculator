package com.example.is_love_calculator.room

@Dao
interface LoveDao {

    @Insert
    fun insert(loveModel: LoveModel)

    @Query("SELECT * FROM `love-table` ORDER BY fname ASC, sname ASC")
    fun getAllSort(): List<LoveModel>
}