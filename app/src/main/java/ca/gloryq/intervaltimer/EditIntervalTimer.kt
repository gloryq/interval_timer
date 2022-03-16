package ca.gloryq.intervaltimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ca.gloryq.intervaltimer.databinding.ActivityEditIntervalTimerBinding

class EditIntervalTimer : AppCompatActivity() {
    private lateinit var binding: ActivityEditIntervalTimerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditIntervalTimerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val index = intent.getIntExtra("index",0)
        val name = intent.getStringExtra("name")

        title = name
    }
}