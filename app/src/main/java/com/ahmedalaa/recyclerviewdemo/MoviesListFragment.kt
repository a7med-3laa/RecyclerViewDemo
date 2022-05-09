package com.ahmedalaa.recyclerviewdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmedalaa.recyclerviewdemo.databinding.FragmentMoviesListBinding


class MoviesListFragment : Fragment() {

    private var _binding: FragmentMoviesListBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMoviesListBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.moviesList.layoutManager=LinearLayoutManager(view.context)
        binding.moviesList.adapter=MoviesListAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}