package com.thesapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivityAppNavigationBinding
import com.thesapplication.app.modules.adacana.ui.AdacanaActivity
import com.thesapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.thesapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.thesapplication.app.modules.home.ui.HomeActivity
import com.thesapplication.app.modules.language.ui.LanguageActivity
import com.thesapplication.app.modules.login.ui.LoginActivity
import com.thesapplication.app.modules.loginorsignup.ui.LoginOrSignupActivity
import com.thesapplication.app.modules.personality.ui.PersonalityActivity
import com.thesapplication.app.modules.settings.ui.SettingsActivity
import com.thesapplication.app.modules.signup.ui.SignupActivity
import com.thesapplication.app.modules.termsandconditions.ui.TermsandconditionsActivity
import com.thesapplication.app.modules.wishlist.ui.WishListActivity
import com.thesapplication.app.modules.worktoday.ui.WorkTodayActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginOrSignUp.setOnClickListener {
      val destIntent = LoginOrSignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdacana.setOnClickListener {
      val destIntent = AdacanaActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignupActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPersonality.setOnClickListener {
      val destIntent = PersonalityActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLanguage.setOnClickListener {
      val destIntent = LanguageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWishList.setOnClickListener {
      val destIntent = WishListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearWorkToday.setOnClickListener {
      val destIntent = WorkTodayActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsAndConditions.setOnClickListener {
      val destIntent = TermsandconditionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
