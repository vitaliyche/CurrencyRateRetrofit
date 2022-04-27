package com.codeliner.retrofit.screens.root

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.codeliner.retrofit.R
import com.codeliner.retrofit.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*

class RootFragment : Fragment() {

    private var ctxt: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctxt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.root_tab_layout.tabIconTint = null
        view.root_view_pager.adapter = ViewPagerAdapter(ctxt as FragmentActivity)
        TabLayoutMediator(view.root_tab_layout, view.root_view_pager) {
            tab, pos->
            when(pos) {
                0 -> { tab.setIcon(R.drawable.ic_monetization_on) }
                1 -> { tab.setIcon(R.drawable.ic_attach_money) }
            }
        }.attach()
        return view
    }


}