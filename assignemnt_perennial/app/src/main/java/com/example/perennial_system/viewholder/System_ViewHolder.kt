package com.example.perennial_system.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.perennial_system.model.Data
import com.example.perennial_system.model.Response_class
import kotlinx.android.synthetic.main.item_layout.view.*

class System_ViewHolder(private val view: View):RecyclerView.ViewHolder(view) {

    fun setData(showClass: Data) {
        view.apply {
            user_age.text = showClass.employee_age.toString()
            user_id.text = showClass.id.toString()
            user_salary.text = showClass.employee_salary.toString()
            user_name.text = showClass.employee_name.toString()
        }
    }
}