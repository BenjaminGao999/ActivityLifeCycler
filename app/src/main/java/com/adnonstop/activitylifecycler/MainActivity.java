package com.adnonstop.activitylifecycler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: 1111111111111111111111");
        initView();
    }

    private void initView() {
        Button btnNA = (Button) findViewById(R.id.btn_newac);
        btnNA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
                finish();
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 111111111111111");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 11111111111111111111111111");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 1111111111111111111111");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 111111111111111111111111");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 1111111111111111111111111");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 11111111111111111111111");
    }
}
