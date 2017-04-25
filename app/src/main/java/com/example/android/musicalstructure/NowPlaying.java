package com.example.android.musicalstructure;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import android.widget.Toast;

import static com.example.android.musicalstructure.R.id.podcast_1;


public class NowPlaying extends AppCompatActivity {

    boolean playingStatus = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_now_playing.xml layout file
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the Current Podcast
        View currentPodcast = findViewById(R.id.current_podcast);

        // Set a click listener on that View
        currentPodcast.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Current Podcast View is clicked on.
            @Override
            public void onClick(View view) {
                Intent currentPodcastIntent = new Intent(NowPlaying.this, Episodes.class);
                startActivity(currentPodcastIntent);
            }
        });

        // Find the Previous Button
        View prev = findViewById(R.id.prev);

        // Set a click listener on that Button
        prev.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Previous Button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Go to previous episode", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the Play Button
        View playPause = findViewById(R.id.play_pause);

        // Set a click listener on that Button
        playPause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play Button is clicked on.
            @Override
            public void onClick(View view) {
                if (playingStatus) {
                    Toast.makeText(getApplicationContext(), "Pause the current episode", Toast.LENGTH_SHORT).show();
                    ImageView playPause = (ImageView) findViewById(R.id.play_pause);
                    playPause.setImageResource(R.drawable.ic_play_circle_filled_black_36dp);
                    playingStatus = false;
                } else {
                    Toast.makeText(getApplicationContext(), "Play the current episode", Toast.LENGTH_SHORT).show();
                    ImageView playPause = (ImageView) findViewById(R.id.play_pause);
                    playPause.setImageResource(R.drawable.ic_pause_circle_filled_black_36dp);
                    playingStatus = true;
                }
            }
        });

        // Find the Next Button
        View next = findViewById(R.id.next);

        // Set a click listener on that Button
        next.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Next Button is clicked on.
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Go to next episode", Toast.LENGTH_SHORT).show();
            }
        });


    }
}