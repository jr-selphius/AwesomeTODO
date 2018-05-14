package com.example.selphius.awesometodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.selphius.awesometodo.ui.listtasks.ListTasksFragment

class MainActivity : AppCompatActivity() {

    private val findNavController: NavController by lazy { findNavController(R.id.nav_host) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_tasks_activity)
        setupActionBarWithNavController(findNavController)
    }

    override fun onSupportNavigateUp(): Boolean = findNavController.navigateUp()
}
