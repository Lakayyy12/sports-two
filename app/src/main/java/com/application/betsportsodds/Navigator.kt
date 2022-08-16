package com.application.betsportsodds

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class Navigator {
    companion object {
        fun showContent(context: Context?, title: String) {
            val dialog = Dialog(context!!)
            dialog.setContentView(R.layout.custom_dialog_content)
            dialog.setCancelable(true)
            dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val content = dialog.findViewById(R.id.content) as TextView
            val closeDialog = dialog.findViewById(R.id.closeDialog) as ImageView

            closeDialog.setOnClickListener { dialog.dismiss() }
            content.text = title

            dialog.show()

        }

        fun showInfoDialog(context: Context?, textTitle: String) {
            val dialog = Dialog(context!!)
            dialog.setContentView(R.layout.custom_dialog_content)
            dialog.setCancelable(true)
            dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            val closeDialog = dialog.findViewById(R.id.closeDialog) as ImageView
            val content = dialog.findViewById(R.id.content) as TextView
            val textContent = null
            content.text = textContent

            closeDialog?.setOnClickListener { dialog.dismiss() }

            dialog.show()

        }
    }
}
