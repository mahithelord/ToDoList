package com.thesapplication.app.modules.home.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivityHomeBinding
import com.thesapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.thesapplication.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = WorkTodayActivity.getIntent(this, null)
      startActivity(destIntent)
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "HOME_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, HomeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
