/*
* Author: Georgios Kroupis
* */

package com.kroupis.georgios.androidappsportfolio;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

/*
* I decided to implement the listener on my class as a design, in order to achieve code readability.
* */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotifyStreamer = (Button)findViewById(R.id.btnSpotifyStreamer);
        Button btnScoresApp = (Button)findViewById(R.id.btnScoresApp);
        Button btnLibraryApp = (Button)findViewById(R.id.btnLibraryApp);
        Button btnBuildItBigger = (Button)findViewById(R.id.btnBuildItBigger);
        Button btnXYZReader = (Button)findViewById(R.id.btnXYZReader);
        Button btnCapstone = (Button)findViewById(R.id.btnCapstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnXYZReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

        // I am setting a color filter to avoid losing the other style attributes of the button by setting a background, such as rounded corners
        btnCapstone.getBackground().setColorFilter(ContextCompat.getColor(this, android.R.color.holo_red_dark), PorterDuff.Mode.MULTIPLY);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String msg = getResources().getString(R.string.toast_msg);
        msg += " ";
        switch (id)
        {
            case R.id.btnSpotifyStreamer:
                msg += getResources().getString(R.string.btn_spotify_streamer);
                break;
            case R.id.btnScoresApp:
                msg += getResources().getString(R.string.btn_scores_app);
                break;
            case R.id.btnLibraryApp:
                msg += getResources().getString(R.string.btn_library_app);
                break;
            case R.id.btnBuildItBigger:
                msg += getResources().getString(R.string.btn_build_it_bigger);
                break;
            case R.id.btnXYZReader:
                msg += getResources().getString(R.string.btn_xyz_reader);
                break;
            case R.id.btnCapstone:
                msg += getResources().getString(R.string.btn_capstone);
                break;
        }
        msg += "!";
        displayAppropriateToast(msg);
    }

    // I am keeping the logic separate for more agility
    private void displayAppropriateToast(String msg) {
        Toast.makeText(getBaseContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
