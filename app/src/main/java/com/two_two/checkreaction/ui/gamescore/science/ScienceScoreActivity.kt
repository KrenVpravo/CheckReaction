package com.two_two.checkreaction.ui.gamescore.science

import android.app.Activity
import android.app.ProgressDialog
import android.os.Bundle
import com.google.firebase.database.FirebaseDatabase
import com.two_two.checkreaction.BuildConfig
import com.two_two.checkreaction.R
import com.two_two.checkreaction.models.firebase.FirebaseScienceResult
import com.two_two.checkreaction.ui.gamescore.OnLoadListener
import kotlinx.android.synthetic.main.activity_science_score.*

class ScienceScoreActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_science_score)
        init()
    }

    private fun init() {
        val dialog = ProgressDialog.show(this, getString(R.string.loading_title),
                getString(R.string.loading_message))
        val currentResult = intent.getSerializableExtra(FirebaseScienceResult.TAG) as FirebaseScienceResult?
        val firebase = FirebaseDatabase.getInstance().reference
                .child(BuildConfig.SCIENCE_GAMESCORES)
        val adapter = ScienceScoreListAdapter(this, firebase.orderByChild(FirebaseScienceResult.TIMESTAMP),
                currentResult, OnLoadListener { dialog.dismiss() })
        ac_scores_list.adapter = adapter
    }
}
