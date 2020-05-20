package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.animation.AlphaAnimation;
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

import kotlinx.android.synthetic.main.app_bar.*

 class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toggle = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar2,
            R.string.drawer_open,
            R.string.drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        setSupportActionBar(toolbar2)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)

      button.setOnClickListener {
          startActivityForResult(Intent(this,MapsActivity::class.java),1) }


        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navgas -> {
                    startActivity(Intent(this, FuelManagement::class.java))
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
                R.id.navmain -> {
                    startActivity(Intent(this, Maintenance_management::class.java))
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
                R.id.navmore -> {
                    startActivity(Intent(this, More::class.java))
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
                R.id.navreport -> {
                    startActivity(Intent(this, Report::class.java))
                    overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

                }
            }
            true
        }



    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> drawer_layout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }
     override fun onBackPressed() {
         if ( drawer_layout.isDrawerOpen(GravityCompat.START)) {
             drawer_layout.closeDrawer(GravityCompat.START)
         } else {
             super.onBackPressed()
         }
     }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
             R.id.navgas-> {
                 startActivity(Intent(this, FuelManagement::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

             }
             R.id.navmain -> {
                 startActivity(Intent(this, Maintenance_management::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
             }
             R.id.navmore -> {
                 startActivity(Intent(this, More::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
             }
             R.id.navreport -> {
                 startActivity(Intent(this, Report::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

             }
             R.id.navposit -> {
                 startActivity(Intent(this, Posit::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

             }
             R.id.nav-> {
                 startActivity(Intent(this,Garage ::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

             }
             R.id.navnoti -> {
                 startActivity(Intent(this, Notice::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);

             }
             R.id.navitem -> {
                 startActivity(Intent(this, Item::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
             }
             R.id.navset -> {
                 startActivity(Intent(this, Set::class.java))
                 overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
             }
             else->{
             }
         }
         drawer_layout.closeDrawer(GravityCompat.START)
         return true
     }


 }










