package com.example.is_love_calculator.remote

@Entity("love-table")
data class LoveModel(

    val fname: String,
    val sname: String,
    val percentage: String,
    val title: String,

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
) {
    override fun toString(): String {
        return "\n$percentage \n$fname \n$sname \n$title\n"
    }
}