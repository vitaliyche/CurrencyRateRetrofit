package com.codeliner.retrofit.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.codeliner.retrofit.R
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.rv_start
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewModel.getCashMoney() //получили данные
        viewModel.myMoneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })


        return v
    }
}