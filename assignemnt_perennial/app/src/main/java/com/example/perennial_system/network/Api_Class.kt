package com.example.perennial_system.network

import com.example.perennial_system.model.Data
import com.example.perennial_system.model.Response_class
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface Api_Class {

    @GET("api/v1/employees")
    fun getEmployee(): Call<Response_class>


}