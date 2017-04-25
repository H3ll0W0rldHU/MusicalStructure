package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Episodes extends AppCompatActivity {

    boolean favoriteStatus = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_episodes.xml layout file
        setContentView(R.layout.activity_episodes);

        // Find the View that shows the Episode 1
        View episode_1 = findViewById(R.id.episode_1);

        // Set a click listener on that View
        episode_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Episode 1 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent episode1Intent = new Intent(Episodes.this, NowPlaying.class);
                startActivity(episode1Intent);
            }
        });


        // Find the View that shows the Episode 2
        View episode_2 = findViewById(R.id.episode_2);

        // Set a click listener on that View
        episode_2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Episode 2 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent episode2Intent = new Intent(Episodes.this, NowPlaying.class);
                startActivity(episode2Intent);
            }
        });

        // Find the View that shows the Episode 3
        View episode_3 = findViewById(R.id.episode_3);

        // Set a click listener on that View
        episode_3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Episode 3 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent episode3Intent = new Intent(Episodes.this, NowPlaying.class);
                startActivity(episode3Intent);
            }
        });

        // Find the Set Favorite-status Button
        View setFavoriteStatus = findViewById(R.id.set_favorite_status);

        // Set a click listener on that View
        setFavoriteStatus.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Favorite-status Button is clicked on.
            @Override
            public void onClick(View view) {
                if (favoriteStatus) {
                    Toast.makeText(getApplicationContext(), "Clear current Podcast from favorites", Toast.LENGTH_SHORT).show();
                    ImageView setFavoriteStatus = (ImageView) findViewById(R.id.set_favorite_status);
                    setFavoriteStatus.setImageResource(R.drawable.ic_favorite_border_black_36dp);
                    favoriteStatus = false;
                } else {
                    Toast.makeText(getApplicationContext(), "Set current Podcast as favorite", Toast.LENGTH_SHORT).show();
                    ImageView setFavoriteStatus = (ImageView) findViewById(R.id.set_favorite_status);
                    setFavoriteStatus.setImageResource(R.drawable.ic_favorite_black_36dp);
                    favoriteStatus = true;
                }
            }
        });

    }

}