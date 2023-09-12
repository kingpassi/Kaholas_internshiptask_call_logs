package com.example.kaholas_internshiptask_call_logs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kaholas_internshiptask_call_logs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ArrCallLog=ArrayList<CallLogModel>().apply {
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
            add(CallLogModel("7065699632","Tuesday","12 12 2024","12:12","88","7065699632","0008687463(6564236589873)_2646462567275265725725.mp3"))
        }

        binding.rv.layoutManager=LinearLayoutManager(this)

        val adapter=CallLogsAdapter(this,ArrCallLog)
        binding.rv.adapter=adapter


    }
}