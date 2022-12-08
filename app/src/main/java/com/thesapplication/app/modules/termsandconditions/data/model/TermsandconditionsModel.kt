package com.thesapplication.app.modules.termsandconditions.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TermsandconditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)
