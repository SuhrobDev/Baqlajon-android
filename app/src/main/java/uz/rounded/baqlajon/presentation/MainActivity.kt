package uz.rounded.baqlajon.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.rounded.baqlajon.R
import uz.rounded.baqlajon.core.extensions.animateToolBarTittle
import uz.rounded.baqlajon.core.extensions.gone
import uz.rounded.baqlajon.core.extensions.visible
import uz.rounded.baqlajon.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    private val isToolBarGone = mutableListOf(
        R.id.homeFragment,
        R.id.myCoursesFragment,
        R.id.balanceFragment,
        R.id.profileFragment
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentMain) as NavHostFragment
        navController = navHostFragment.findNavController()
        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.toolbar.title.text = navController.currentDestination?.label.toString()
            animateToolBarTittle(binding.toolbar.title)
            if (isToolBarGone.contains(destination.id)
            ) {
                binding.toolbar.toolbar.gone()
            } else {
                binding.toolbar.toolbar.visible()
            }
        }
        binding.toolbar.back.setOnClickListener {
            navController.popBackStack()
        }
        setupWithNavController(binding.bottomNav, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}