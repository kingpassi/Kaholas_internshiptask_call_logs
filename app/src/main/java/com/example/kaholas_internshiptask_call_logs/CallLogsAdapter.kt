package com.example.kaholas_internshiptask_call_logs


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CallLogsAdapter(val context: Context, val arr:ArrayList<CallLogModel>):RecyclerView.Adapter<CallLogsAdapter.ViewHolder>() {
    class ViewHolder(val view:View):RecyclerView.ViewHolder(view) {
        val tvPhoneNumber=view.findViewById<TextView>(R.id.tvPhoneNumber)
        val tvDay=view.findViewById<TextView>(R.id.tvDay)
        val tvDate=view.findViewById<TextView>(R.id.tvDate)
        val tvTime=view.findViewById<TextView>(R.id.tvTime)
        val tvDuration=view.findViewById<TextView>(R.id.tvDuration)
        val tvFrom=view.findViewById<TextView>(R.id.tvFrom)
        val tvRecording=view.findViewById<TextView>(R.id.tvRecording)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.call_logs_rv_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return arr.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvPhoneNumber.text=arr[position].PhoneNumber
        holder.tvDate.text=arr[position].Date
        holder.tvDay.text=arr[position].Day
        holder.tvTime.text=arr[position].Time
        holder.tvFrom.text=arr[position].From
        holder.tvDuration.text=arr[position].Duration
        holder.tvRecording.text=arr[position].Recording
    }
}