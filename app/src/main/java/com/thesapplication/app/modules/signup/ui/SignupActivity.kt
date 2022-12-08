package com.thesapplication.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivitySignupBinding
import com.thesapplication.app.modules.home.ui.HomeActivity
import com.thesapplication.app.modules.login.ui.LoginActivity
import com.thesapplication.app.modules.signup.`data`.viewmodel.SignupVM
import kotlin.String
import kotlin.Unit

class SignupActivity : BaseActivity<ActivitySignupBinding>(R.layout.activity_signup) {
  private val viewModel: SignupVM by viewModels<SignupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAlreadyhavean.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "SIGNUP_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignupActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
