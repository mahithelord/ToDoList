package com.thesapplication.app.modules.worktoday.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.base.BaseActivity
import com.thesapplication.app.databinding.ActivityWorkTodayBinding
import com.thesapplication.app.modules.wishlist.ui.WishListActivity
import com.thesapplication.app.modules.worktoday.`data`.viewmodel.WorkTodayVM
import kotlin.String
import kotlin.Unit

class WorkTodayActivity : BaseActivity<ActivityWorkTodayBinding>(R.layout.activity_work_today) {
  private val viewModel: WorkTodayVM by viewModels<WorkTodayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.workTodayVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnMakeAWishListOne.setOnClickListener {
      val destIntent = WishListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      // TODO please, add your navigation code here
      finish()
    }
  }

  companion object {
    const val TAG: String = "WORK_TODAY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, WorkTodayActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
