package com.julia.swoosh.Controler

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julia.swoosh.EXTRA_PLAYER
import com.julia.swoosh.Model.Player
import com.julia.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        idSearchLeaguesTxt.text = "Looking for ${player?.league} ${player?.skill} league near you..."
    }
}