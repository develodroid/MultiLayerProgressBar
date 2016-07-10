package com.develodroid.multilayerprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.develodroid.multilayerprogressbar.view.MultiLayerProgressView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MultiLayerProgressView mProgress = (MultiLayerProgressView) findViewById(R.id.progress_bar);

    }
}
