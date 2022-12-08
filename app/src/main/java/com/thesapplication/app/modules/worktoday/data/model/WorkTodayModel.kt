package com.thesapplication.app.modules.worktoday.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WorkTodayModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeawishlis: String? = MyApp.getInstance().resources.getString(R.string.lbl_work_today_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeyourjobe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_your_job_e)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_april_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResearchProduc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_research_produc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResearchProducOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_action_p)

)
