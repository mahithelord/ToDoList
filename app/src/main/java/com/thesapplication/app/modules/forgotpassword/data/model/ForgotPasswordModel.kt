package com.thesapplication.app.modules.forgotpassword.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_helping_others)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIfyouarealwa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_if_you_are_alwa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etYourEmailValue: String? = null
)
