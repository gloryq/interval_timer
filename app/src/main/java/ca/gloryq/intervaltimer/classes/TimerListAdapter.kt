package ca.gloryq.intervaltimer.classes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ca.gloryq.intervaltimer.databinding.ListTimerItemBinding

class TimerListAdapter(private val dataSet : ArrayList<IntervalTimer>) : RecyclerView.Adapter<TimerListAdapter.IntervalTimerViewHolder>() {
    class IntervalTimerViewHolder(val viewbinding: ListTimerItemBinding) : RecyclerView.ViewHolder(viewbinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntervalTimerViewHolder {
        val layoutinflater = LayoutInflater.from(parent.context)
        val viewbinding = ListTimerItemBinding.inflate(layoutinflater, parent, false)
        return IntervalTimerViewHolder(viewbinding)
    }

    override fun onBindViewHolder(holder: IntervalTimerViewHolder, position: Int) {
        holder.viewbinding.textViewTime.text = dataSet[position].name
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

}