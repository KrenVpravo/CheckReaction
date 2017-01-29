package com.two_two.checkreaction.models.science

import java.io.Serializable

/**
 * @author Dmitry Borodin on 2017-01-29.
 */
data class FirebaseScienceResult(
        var currectHits: Int = 0, //of 10 attapts
        var average: Long = 0L,
        var username: String = ""
) : Serializable {
    //dtimestamp will fill up only in firebase cloud.
    var timestamp: Long? = 0

    companion object {
        val TAG = "FirebaseScienceResult"
        val HITS = "currectHits"
        val TIMESTAMP = "timestamp"
    }
}