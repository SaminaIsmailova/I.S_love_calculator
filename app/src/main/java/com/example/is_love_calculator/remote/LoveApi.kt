package com.example.is_love_calculator.remote

interface LoveApi {

    @GET("getPercentage")
    fun getLove(
        @Query("sname") secondName: String,
        @Query("fname") firstName: String,
        @Header("X-RapidAPI-Key") key: String = "7753737404msh1de34a18e6f9f85p107731jsne1168a9b8ff3",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com",
    ): Call<LoveModel>
}