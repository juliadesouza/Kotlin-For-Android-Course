package com.julia.swoosh.Controler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.julia.swoosh.EXTRA_LEAGUE
import com.julia.swoosh.EXTRA_SKILL
import com.julia.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        idSearchLeaguesTxt.text = "Looking for $league $skill league near you..."
    }
}