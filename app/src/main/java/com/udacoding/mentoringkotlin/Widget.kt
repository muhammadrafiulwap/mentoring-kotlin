package com.udacoding.mentoringkotlin

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_widget.*

class Widget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_widget)

        buttonToast.setOnClickListener {
            Toast.makeText(this, "Ini adalah Toast",Toast.LENGTH_LONG).show()
        }

        buttonSnackbar.setOnClickListener {
            Snackbar.make(it, "Ini adalah Snackbar",Snackbar.LENGTH_LONG).show()
        }

        buttonAlert.setOnClickListener {
            AlertDialog.Builder(this).apply {
                setTitle("Message")
                setMessage("Ini adalah Alert")
                setPositiveButton("OK"){ dialog, _ ->
                    Toast.makeText(applicationContext, "Anda klik OK",Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }
                setNegativeButton("Back"){ dialog, _ ->
                    Toast.makeText(applicationContext, "Anda klik Back",Toast.LENGTH_SHORT).show()
                    dialog.dismiss()
                }.show()
            }
        }

        buttonCustom.setOnClickListener {
            Dialog(this).apply {
                requestWindowFeature(Window.FEATURE_NO_TITLE)
                setCancelable(false)
                setContentView(R.layout.custom_dialog)

                val btnCancel = this.findViewById<Button>(R.id.buttonCancel)
                val btnContinue = this.findViewById<Button>(R.id.buttonContinue)

                btnCancel.setOnClickListener {
                    Toast.makeText(applicationContext, "Anda klik Cancel",Toast.LENGTH_SHORT).show()
                    this.dismiss()
                }

                btnContinue.setOnClickListener {
                    Toast.makeText(applicationContext, "Anda klik Continue",Toast.LENGTH_SHORT).show()
                    this.dismiss()
                }
            }.show()

        }

    }
}
