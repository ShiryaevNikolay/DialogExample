package ru.example.dialogexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG_DIALOG = "dialog"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = MyDialog()
        val fragmentManager = supportFragmentManager

        findViewById<Button>(R.id.show_dialog_btn).setOnClickListener {
            dialog.show(fragmentManager, TAG_DIALOG)
        }
    }
}