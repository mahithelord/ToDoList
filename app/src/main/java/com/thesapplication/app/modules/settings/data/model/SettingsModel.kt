package com.thesapplication.app.modules.settings.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoursettingss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)

)
