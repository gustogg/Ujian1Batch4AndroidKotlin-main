package com.juaracoding.ujian1batch4androidkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.juaracoding.ujian1batch4androidkotlin.model.Article

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.title = "10 Model Indonesia"

        val orientation = resources.configuration.orientation

        if(orientation == android.content.res.Configuration.ORIENTATION_LANDSCAPE) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.sideList, ListArtisFragment.newInstance("",""))
                .commit()

            supportFragmentManager.beginTransaction()
                .replace(R.id.sideDetail, ListDetailFragment.newInstance(Article(R.drawable.chelsea,"Chelsea Islan","Tak hanya memiliki paras yang cantik, Chelsea Islan juga mempunyai segudang prestasi",
                    "Aktris muda cantik yang berprestasi serta baru saja dilamar oleh Rob Clinton ini merupakan seorang wanita keturunan Amerika Serikat. Memiliki wajah blasteran yang begitu cantik, tidak heran jika Chelsea Islan kemudian sukses masuk sebagai salah satu nominasi perempuan tercantik versi TC Candler selama tiga tahun berturut-turut, yaitu pada tahun 2018, 2019, dan 2020."),""))
                .commit()
        }else{
            supportFragmentManager.beginTransaction()
                .replace(R.id.frmFragment, ListArtisFragment.newInstance("",""))

                .commit()


        }
    }}