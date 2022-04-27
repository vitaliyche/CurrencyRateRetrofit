package com.codeliner.retrofit.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codeliner.retrofit.R
import com.codeliner.retrofit.model.cash.CashItem
import com.codeliner.retrofit.model.online.OnlineItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    var listSecond = emptyList<OnlineItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_buy.text = listSecond[position].buy
        holder.itemView.item_sale.text = listSecond[position].sale
    }

    override fun getItemCount(): Int {
        return listSecond.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<OnlineItem>) {
        listSecond = list
        notifyDataSetChanged()
    }
}