package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_addcar.*
import java.util.*

class Addcar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addcar)

        val adapter = ArrayAdapter.createFromResource(this,R.array.oillable,android.R.layout.simple_spinner_dropdown_item)
       oillabels.adapter = adapter
        val adapter1 = ArrayAdapter.createFromResource(this,R.array.oil,android.R.layout.simple_spinner_dropdown_item)
        oil.adapter = adapter1
        val c = Calendar.getInstance()
        val year =c.get(Calendar.YEAR)
        val month =c.get(Calendar.MONTH)
        val day =c.get(Calendar.DAY_OF_MONTH)

        Date.setOnClickListener{
            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                val date = "$year/$month/$dayOfMonth"
                Date.setText(date)
          },year,month,day)
            dpd.show()


        }






    }

}
