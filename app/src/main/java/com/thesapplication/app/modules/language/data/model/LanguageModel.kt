package com.thesapplication.app.modules.language.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LanguageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_language)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoursettingss: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_settings_s)

)
