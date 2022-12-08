package com.thesapplication.app.modules.personality.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivityPersonalityBinding
import com.thesapplication.app.modules.personality.`data`.viewmodel.PersonalityVM
import com.thesapplication.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

class PersonalityActivity : BaseActivity<ActivityPersonalityBinding>(R.layout.activity_personality)
    {
  private val viewModel: PersonalityVM by viewModels<PersonalityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.personalityVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
    binding.btnChangeSave.setOnClickListener {
      val destIntent = WorkTodayActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PERSONALITY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PersonalityActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
