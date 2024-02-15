package com.example.is_love_calculator

class Repository  @Inject constructor(private val api: LoveApi) {
    fun getData(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        val love = MutableLiveData<LoveModel>()

        api.getLove(firstName, secondName).enqueue(object : Callback<LoveModel> {
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        love.postValue(it)
                    }
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                Log.e("sagsag", "onFailure:${t.message}")
            }

        })
        return love
    }
}