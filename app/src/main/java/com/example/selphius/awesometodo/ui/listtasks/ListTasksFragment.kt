package com.example.selphius.awesometodo.ui.listtasks

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.selphius.awesometodo.R
import kotlinx.android.synthetic.main.list_tasks_fragment.*

class ListTasksFragment : Fragment() {

    private lateinit var viewModel: ListTasksViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.list_tasks_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ListTasksViewModel::class.java)

        message.setOnClickListener {
            findNavController().navigate(R.id.open_details)
        }

        floating_action_button.setOnClickListener {
            findNavController().navigate(R.id.open_addtask)
        }
    }

}
