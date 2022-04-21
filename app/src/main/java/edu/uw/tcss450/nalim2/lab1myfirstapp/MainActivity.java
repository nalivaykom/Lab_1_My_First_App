package edu.uw.tcss450.nalim2.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    
    // Comment Added by Michael


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "Log from onStart, verbose level");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Log from onResume, debug level");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Log from onPause, info level");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w(TAG, "Log from onStop, warning level");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Log from onRestart, error level");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.wtf(TAG, "Log from onDestroy, asserts level");
    }
}