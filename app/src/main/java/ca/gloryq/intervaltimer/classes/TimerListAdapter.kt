package ca.gloryq.intervaltimer.classes

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ca.gloryq.intervaltimer.EditIntervalTimer
import ca.gloryq.intervaltimer.databinding.ListTimerItemBinding

class TimerListAdapter(private val dataSet : ArrayList<IntervalTimer>, private val context: Context) : RecyclerView.Adapter<TimerListAdapter.IntervalTimerViewHolder>() {
    class IntervalTimerViewHolder(val viewbinding: ListTimerItemBinding) : RecyclerView.ViewHolder(viewbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntervalTimerViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val viewbinding = ListTimerItemBinding.inflate(layoutinflater, parent, false)
        return IntervalTimerViewHolder(viewbinding)
    }

    override fun onBindViewHolder(holder: IntervalTimerViewHolder, position: Int) {
        holder.viewbinding.textViewTime.text = dataSet[position].name
        holder.viewbinding.listTimerItem.setOnClickListener {
            val intent = Intent(context, EditIntervalTimer::class.java).apply {
                putExtra("index", position)
                putExtra("name", dataSet[position].name)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}