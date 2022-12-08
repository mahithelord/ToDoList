package com.thesapplication.app.modules.personality.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PersonalityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPersonality: String? = MyApp.getInstance().resources.getString(R.string.lbl_personality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEditPhoto: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_photo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_username)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFirstname: String? = MyApp.getInstance().resources.getString(R.string.lbl_first_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLastname: String? = MyApp.getInstance().resources.getString(R.string.lbl_last_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHobby: String? = MyApp.getInstance().resources.getString(R.string.lbl_hobby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateofbirth: String? = MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_country)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etUsernameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFirstnameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etLastnameOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etHobbyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPriceValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCountryOneValue: String? = null
)
