package com.example.l15_homework

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

private var web_adress : String = ""
private var phone : String = ""

class MainActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnWeb.setOnClickListener(this)
        btnPhone.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.btnWeb -> {
                showToast("Вы открыли браузер")
                web_adress = webInput.text.toString()
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://$web_adress"))
                startActivity(intent)
            }
            R.id.btnPhone -> {
                showToast("Вы открыли набор номера")
                phone = phoneInput.text.toString()
                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phone"))
                startActivity(intent)
            }
        }
    }
}