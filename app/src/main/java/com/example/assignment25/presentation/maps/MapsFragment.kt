package com.example.assignment25.presentation.maps

import com.example.assignment25.R
import com.example.assignment25.SearchBottomSheetFragment
import com.example.assignment25.databinding.FragmentMapsBinding
import com.example.assignment25.presentation.base.BaseFragment

import com.google.android.gms.maps.SupportMapFragment

class MapsFragment : BaseFragment<FragmentMapsBinding>(FragmentMapsBinding::inflate) {

    private lateinit var bottom: SearchBottomSheetFragment

    override fun bind() {
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun bindViewActionListeners() {
        binding.btnSearch.setOnClickListener {
            bottom = SearchBottomSheetFragment()
            bottom.setSearchListener(this) // Set the fragment as the listener
            bottom.show(parentFragmentManager, "tag")
        }
    }

    override fun bindObserves() {
        TODO("Not yet implemented")
    }

    //ვერ ვასწრებ დაწერას. სხვა დროს გავაგრძელებ იმედია


}