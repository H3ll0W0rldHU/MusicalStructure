package com.example.android.musicalstructure;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Toast;

import static com.example.android.musicalstructure.R.id.textView;

public class FindNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_find_new.xml layout file
        setContentView(R.layout.activity_find_new);

        // Find the View that shows the Podcast 1
        View podcast_1 = findViewById(R.id.podcast_1);

        // Set a click listener on that View
        podcast_1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Podcast 1 View is clicked on.
            @Override
            public void onClick(View view) {
                Intent podcast1Intent = new Intent(FindNew.this, Episodes.class);
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
                Intent podcast2Intent = new Intent(FindNew.this, Episodes.class);
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
                Intent podcast3Intent = new Intent(FindNew.this, Episodes.class);
                startActivity(podcast3Intent);
            }
        });


    }
}