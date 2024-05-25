package com.example.ttamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        music = MediaPlayer.create(this, R.raw.hamim);


    }

    public void play(View view) {
        if (music.isPlaying())
        music.pause();
        else music.start();
    }

    public void previous(View view) {
        Intent previous = new Intent(MainActivity.this, slide3.class);
        startActivity(previous);
        music.stop();
    }

    public void next(View view) {
        Intent next = new Intent(MainActivity.this, slide2.class);
        startActivity(next);
        music.stop();
    }
}