package com.musicmuni.practiceview

import android.content.Context
import android.widget.Toast

/**
 * Created by Jithin on 24/04/22.
 * MusicMuni Labs Pvt Ltd.
 * jithin@riyazapp.com
 */
class PitchView {

    companion object {
        fun showPitchViewToast(context: Context, msg: String?){
            Toast.makeText(context, "TOAST FROM PRACTICE_VIEW LIB: $msg", Toast.LENGTH_LONG).show()
        }
    }
}