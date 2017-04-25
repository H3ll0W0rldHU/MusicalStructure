package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.android.musicalstructure.R.id.episode_1;

public class Favorites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_favorites.xml layout file
        setContentView(R.layout.activity_favorites);

        // Find the View that shows the Podcast 1
        View podcast_1 = findViewById(R.id.podcast_1);

        // Set a click listener on that View
        podcast_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcast 1 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcast1Intent = new Intent(Favorites.this, Episodes.class);
                startActivity(podcast1Intent);
            }
        });


        // Find the View that shows the Podcast 2
        View podcast_2 = findViewById(R.id.podcast_2);

        // Set a click listener on that View
        podcast_2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcast 2 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcast2Intent = new Intent(Favorites.this, Episodes.class);
                startActivity(podcast2Intent);
            }
        });

        // Find the View that shows the Podcast 3
        View podcast_3 = findViewById(R.id.podcast_3);

        // Set a click listener on that View
        podcast_3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcast 3 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcast3Intent = new Intent(Favorites.this, Episodes.class);
                startActivity(podcast3Intent);
            }
        });

        // Find the Add New Button
        View add_new = findViewById(R.id.add_new);

        // Set a click listener on that View
        add_new.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Add New Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent addNewIntent = new Intent(Favorites.this, FindNew.class);
                startActivity(addNewIntent);
            }
        });

    }

}