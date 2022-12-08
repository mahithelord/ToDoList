package com.thesapplication.app.modules.settings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivitySettingsBinding
import com.thesapplication.app.modules.language.ui.LanguageActivity
import com.thesapplication.app.modules.personality.ui.PersonalityActivity
import com.thesapplication.app.modules.settings.`data`.viewmodel.SettingsVM
import com.thesapplication.app.modules.termsandconditions.ui.TermsandconditionsActivity
import kotlin.String
import kotlin.Unit

class SettingsActivity : BaseActivity<ActivitySettingsBinding>(R.layout.activity_settings) {
  private val viewModel: SettingsVM by viewModels<SettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.settingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearPersonality.setOnClickListener {
      val destIntent = PersonalityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLanguage1.setOnClickListener {
      val destIntent = LanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.linearTermandcondit.setOnClickListener {
      val destIntent = TermsandconditionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
