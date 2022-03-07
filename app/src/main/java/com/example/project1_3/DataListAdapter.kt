package com.example.project1_3


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataListAdapter(var allData: List<Data>): RecyclerView.Adapter<DataViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = DataViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.data_item,parent,false))
        return view
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val currentData = allData[position]
        holder.tvName.text = currentData.username
        holder.tvEmail.text = currentData.email
        holder.tvCategory.text = currentData.category
        holder.tvStream.text = currentData.stream
        holder.tvJobStatus.text = currentData.jobStatus
    }

    override fun getItemCount(): Int {
        return allData.size
    }

//    fun updateList(data: ArrayList<Data>){
//        //allData.clear()
//        this.allData = data
//
//        notifyDataSetChanged()
//    }

}

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvName: TextView = itemView.findViewById(R.id.tvName)
    val tvEmail: TextView = itemView.findViewById(R.id.tvEmail)
    val tvCategory: TextView = itemView.findViewById(R.id.tvCategory)
    val tvStream: TextView = itemView.findViewById(R.id.tvStream)
    val tvJobStatus: TextView = itemView.findViewById(R.id.tvJobStatus)
}