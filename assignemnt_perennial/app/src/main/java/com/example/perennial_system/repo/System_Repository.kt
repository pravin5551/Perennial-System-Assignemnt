package com.example.perennial_system.repo

import com.example.perennial_system.model.Data
import com.example.perennial_system.network.Api_Class
import com.example.perennial_system.network.Resource
import com.example.perennial_system.network.ResponseHandler
import com.example.perennial_system.network.System_Network

class System_Repository {

    private val CONTENT_TYPE = "application/json"
    val apiClient = System_Network.getInstance().create(Api_Class::class.java)
    val responseHandler = ResponseHandler()

//    suspend fun getEmplyeeData(): Resource<List<Data>> {
//        val call = apiClient.getEmplyeeData(CONTENT_TYPE)
//        /*
//       Once the response is fetched, navigate the user back to view model as this callback is being implemented
//       in the ViewModel class
//        */
//        return responseHandler.handleSuccess(call)
//    }

}