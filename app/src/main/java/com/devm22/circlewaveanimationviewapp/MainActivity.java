package com.devm22.circlewaveanimationviewapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.devm22.circlewaveanimationview.CircleWaveView;

public class MainActivity extends AppCompatActivity {

    CircleWaveView waveView;
    Button btnPlay, btnStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        waveView = findViewById(R.id.waveView);



        waveView.setWaveCount(4);
        waveView.setMainWaveColor(Color.BLUE);
        waveView.setAnimationSpeed(400);
        waveView.setCenterText("PLAY");
        waveView.setTextAllCaps(true);
        waveView.setCenterTextColor(Color.WHITE);
        waveView.setCenterTextSize(48f);
        waveView.setCenterTextStyle(android.graphics.Typeface.BOLD);
        waveView.setCenterImageTint(Color.YELLOW);
        waveView.setCenterImagePadding(16f);

        btnPlay.setOnClickListener(view -> {
            waveView.startAnimation();
        });

        btnStop.setOnClickListener(view -> {
            waveView.stopAnimation();
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        waveView.stopAnimation();
    }
}