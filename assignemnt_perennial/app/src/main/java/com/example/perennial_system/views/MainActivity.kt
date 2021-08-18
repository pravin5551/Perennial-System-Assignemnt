package com.example.perennial_system.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.perennial_system.R
import com.example.perennial_system.adapter.System_Adapter
import com.example.perennial_system.model.Data
import com.example.perennial_system.model.Response_class
import com.example.perennial_system.network.Api_Class
import com.example.perennial_system.network.System_Network
import com.example.perennial_system.viewmodel.System_ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var userViewModel: System_ViewModel
    private lateinit var userAdapter: System_Adapter
    private var dataModelList = emptyList<Data>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData()

    }

    private fun getData() {
        val apiClient = System_Network.getInstance().create(Api_Class::class.java)
        apiClient.getEmployee().enqueue(object :retrofit2.Callback<Response_class>{
            override fun onResponse(
                call: Call<Response_class>,
                response: Response<Response_class>
            ) {
                if (response.body() != null) {
                    val list = response.body()!!.data
                    setRecyclerView(list)
                }
            }

            override fun onFailure(call: Call<Response_class>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Something wrong", Toast.LENGTH_SHORT).show()
            }

        })


    }

    /*
    sets up the recyclerView
     */
    private fun setRecyclerView(list: List<Data?>?) {

        val linearLayout = LinearLayoutManager(this)
        val adapter = System_Adapter(list as List<Data>)
        recyclerview.layoutManager = linearLayout
        recyclerview.adapter = adapter
    }
}