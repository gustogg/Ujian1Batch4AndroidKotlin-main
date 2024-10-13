package com.juaracoding.ujian1batch4androidkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
//import androidx.compose.ui.semantics.text


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setTitle("10 Model Indonesia");
        supportActionBar?.setSubtitle("Daftar Artis Populer");
        //set R.id.titleMain = title
        val title = "10 Model Indonesia" // Or get it from elsewhere
        val titleTextView = findViewById<TextView>(R.id.titleMain)
        titleTextView.text = title



        val orientation = resources.configuration.orientation

        if(orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.sideList, ListArtisFragment.newInstance("",""))
                .commit()

            supportFragmentManager.beginTransaction()
                .replace(R.id.sideDetail, ListDetailFragment.newInstance(Article(R.drawable.chelsea,"Chelsea Islan","",""),""))
                .commit()
        }else{
            supportFragmentManager.beginTransaction()
                .replace(R.id.frmFragment, ListArtisFragment.newInstance("",""))

                .commit()


        }




    }

    // Tombol untuk membuka halaman About
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menu.add(0, 1, 0, "About").apply {
            setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
            setOnMenuItemClickListener {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
                true
            }

        }
        return super.onCreateOptionsMenu(menu)
    }

}
