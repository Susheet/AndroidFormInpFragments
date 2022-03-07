package com.example.project1_3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_view_all_data.*

class ViewAllData : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_data)

        val dao = DataDatabase.getDatabase(application).getDataDao()
        val datalist = dao.getAllData()

        rvDetails.layoutManager = LinearLayoutManager(this)
        val adapter = DataListAdapter(datalist)
        rvDetails.adapter = adapter



//        adapter.updateList(datalist)



        fbtn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}