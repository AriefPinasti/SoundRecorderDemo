package com.example.reaper.soundrecorderdemo;

import android.util.Log;

/**
 * Created by Reaper on 1/23/2017.
 */

public class AppLog {

    private static final String APP_TAG = "AudioRecorder";
    public static int logString(String message){
        return Log.i(APP_TAG, message);
    }
}
