package com.example.ttamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class slide3 extends AppCompatActivity {
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);
        music  = MediaPlayer.create(this, R.raw.behnam);
        music.start();
    }

    public void previous(View view) {
        Intent previous = new Intent(slide3.this, slide2.class);
        startActivity(previous);
        music.stop();
    }

    public void play(View view) {
        if (music.isPlaying())
        music.pause();
        else music.start();
    }

    public void next(View view) {
        Intent next = new Intent(slide3.this, MainActivity.class);
        startActivity(next);
        music.stop();
    }
}
