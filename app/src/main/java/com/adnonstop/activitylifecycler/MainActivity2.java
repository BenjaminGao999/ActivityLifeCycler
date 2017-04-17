package com.adnonstop.activitylifecycler;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = MainActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "onCreate: 2222222222222222222222222");
        TextView tvSA = (TextView) findViewById(R.id.tv_startActivity);
        tvSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2222222222222222222222222");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 22222222222222222222222222");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 22222222222222222222222222");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 2222222222222222222222222");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 2222222222222222222222222");
    }
}
