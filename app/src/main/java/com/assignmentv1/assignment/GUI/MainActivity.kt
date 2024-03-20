package com.assignmentv1.assignment.GUI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.assignmentv1.assignment.R
import com.assignmentv1.assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val nav by lazy {
        supportFragmentManager.findFragmentById(R.id.host)!!.findNavController()
    }

    // TODO: AppBarConfiguration
    private lateinit var abc: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // TODO: AppBarConfiguration
        abc = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.orderFragment,
                R.id.sellFragment,
                R.id.notificationFragment,
                R.id.profileFragment
            ),
            binding.root
        )
        // TODO: Setup action bar, drawer and bottom
        setupActionBarWithNavController(nav, abc)
        binding.bv.setupWithNavController(nav)
        binding.nv.setupWithNavController(nav)

        // TODO: Custom action

        binding.nv.setNavigationItemSelectedListener { menuItem:MenuItem ->
            // Handle navigation item clicks here
            navigateToDestination(menuItem)
            // Close the navigation drawer
            binding.root.close()
            true
        }
        binding.bv.setOnItemSelectedListener { menuItem:MenuItem ->
            // Handle navigation item clicks here
            navigateToDestination(menuItem)
            true
        }
        // TODO: Access to drawer's header
        //change the header's content after login
//        val h = HeaderBinding.bind(binding.nv.getHeaderView(0))
//        h.imageView.setImageResource(R.drawable.jieun)
//        h.userName.text = "LEE JIEUN"
//        h.email.text = "jien@gmail.com"
    }

    override fun onSupportNavigateUp(): Boolean {
        // TODO: AppBarConfiguration
        return nav.navigateUp(abc)
    }
    private fun navigateToDestination(menuItem: MenuItem) {
        when (menuItem.itemId) {
            //Side bar
            R.id.sideHome -> nav.navigate(R.id.homeFragment)
            R.id.sideShare -> nav.navigate(R.id.shareFragment)
            R.id.sideRate -> nav.navigate(R.id.rateFragment)
            // Bottom bar
            R.id.bottomHome -> nav.navigate(R.id.homeFragment)
            R.id.bottom_order -> nav.navigate(R.id.orderFragment)
            R.id.bottom_sell -> nav.navigate(R.id.sellFragment)
            R.id.bottom_notification -> nav.navigate(R.id.notificationFragment)
            R.id.bottom_profile -> nav.navigate(R.id.profileFragment)
        }
    }

}
