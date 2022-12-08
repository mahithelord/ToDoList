package com.thesapplication.app.modules.adacana.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivityAdacanaBinding
import com.thesapplication.app.modules.adacana.`data`.viewmodel.AdacanaVM
import com.thesapplication.app.modules.loginorsignup.ui.LoginOrSignupActivity
import kotlin.String
import kotlin.Unit

class AdacanaActivity : BaseActivity<ActivityAdacanaBinding>(R.layout.activity_adacana) {
  private val viewModel: AdacanaVM by viewModels<AdacanaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adacanaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageLogo.setOnClickListener {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "ADACANA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdacanaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
