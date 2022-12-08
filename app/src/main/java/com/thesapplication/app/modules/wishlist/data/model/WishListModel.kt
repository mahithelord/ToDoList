package com.thesapplication.app.modules.wishlist.`data`.model

import com.thesapplication.app.R
import com.thesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WishListModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMakeawishlis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_make_a_wish_lis)
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
  var txtTasktodo: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_todo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateactionm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_action_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTtmmyy: String? = MyApp.getInstance().resources.getString(R.string.lbl_tt_mm_yy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAttachments: String? = MyApp.getInstance().resources.getString(R.string.lbl_attachments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFilesizeValue: String? = null
)
