package com.thesapplication.app.modules.loginorsignup.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginOrSignupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOurcommunityi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_our_community_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetinthrough: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_get_in_through)

)
