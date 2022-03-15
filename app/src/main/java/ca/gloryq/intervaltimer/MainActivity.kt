package ca.gloryq.intervaltimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ca.gloryq.intervaltimer.classes.IntervalTimer
import ca.gloryq.intervaltimer.classes.Timer
import ca.gloryq.intervaltimer.classes.TimerListAdapter
import ca.gloryq.intervaltimer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var rvAdapter: TimerListAdapter
    //private var timers

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var timersList : ArrayList<IntervalTimer> = arrayListOf()
        var timer = IntervalTimer("10 on 30 off")
        timer.list.add(Timer("Go",0,0,10))
        timer.list.add(Timer("Go",0, 0, 30))

        timersList.add(timer)
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        binding.listTimers.layoutManager = layoutManager

        rvAdapter = TimerListAdapter(timersList)
        binding.listTimers.adapter = rvAdapter
    }
}