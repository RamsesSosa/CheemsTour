package mx.itson.cheemstour.utils

import com.google.gson.GsonBuilder
import mx.itson.cheemstour.interfaces.CheemsAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitUtil {
    fun getApi(): CheemsAPI? {
        val gson = GsonBuilder().create()
        val retrofit = Retrofit.Builder().baseUrl("http://192.168.0.114:5000/")
            .addConverterFactory(GsonConverterFactory.create(gson)).build()
        return retrofit.create(CheemsAPI::class.java)

    }

}