package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the large Play Button
        ImageView playButton = (ImageView) findViewById(R.id.play_button);

        // Set a click listener on that View
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Play Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent playButtonIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(playButtonIntent);
            }
        });


        // Find the Favorites button
        TextView favorites = (TextView) findViewById(R.id.favorites);

        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Favorites Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, Favorites.class);
                startActivity(favoritesIntent);
            }
        });

        // Find the Find New button
        TextView findNew = (TextView) findViewById(R.id.find_new);

        // Set a click listener on that View
        findNew.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Find New Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent findNewIntent = new Intent(MainActivity.this, FindNew.class);
                startActivity(findNewIntent);
            }
        });

    }

}
