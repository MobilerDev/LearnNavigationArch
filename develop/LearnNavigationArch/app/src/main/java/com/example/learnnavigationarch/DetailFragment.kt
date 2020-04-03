package com.example.learnnavigationarch


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.fragment_list.*


class DetailFragment : Fragment() {

    private var nameArgs = "deneme"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            nameArgs = DetailFragmentArgs.fromBundle(it).argName
            tvName.text = nameArgs
        }
        buttonDetailToList.setOnClickListener {
            val action = DetailFragmentDirections.actionDetailFragmentToListFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}
