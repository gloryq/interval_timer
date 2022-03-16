package ca.gloryq.intervaltimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateIntervalTimer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_interval_timer)
        title = "Create an Interval Timer"
    }
}