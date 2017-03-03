package com.example.abedurchowdhury.basicphrases;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    MediaPlayer mPlayer;
    Button bathroom, fight, hello, my_name, restaurants, water, what_do, your_name;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bathroom: mPlayer = MediaPlayer.create(this, R.raw.bathroom);
                mPlayer.start();
                break;
            case R.id.fight: mPlayer = MediaPlayer.create(this, R.raw.fight);
                mPlayer.start();
                break;
            case R.id.hello: mPlayer = MediaPlayer.create(this, R.raw.hello);
                mPlayer.start();
                break;
            case R.id.my_name: mPlayer = MediaPlayer.create(this, R.raw.my_name);
                mPlayer.start();
                break;
            case R.id.restaurants: mPlayer = MediaPlayer.create(this, R.raw.restaurants);
                mPlayer.start();
                break;
            case R.id.water: mPlayer = MediaPlayer.create(this, R.raw.water);
                mPlayer.start();
                break;
            case R.id.what_do: mPlayer = MediaPlayer.create(this, R.raw.what_do);
                mPlayer.start();
                break;
            case R.id.your_name: mPlayer = MediaPlayer.create(this, R.raw.your_name);
                mPlayer.start();
                break;
            default: mPlayer = MediaPlayer.create(this, R.raw.hello);
                mPlayer.start();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bathroom = (Button) findViewById(R.id.bathroom);
        bathroom.setOnClickListener(this);

        fight = (Button) findViewById(R.id.fight);
        fight.setOnClickListener(this);

        hello = (Button) findViewById(R.id.hello);
        hello.setOnClickListener(this);

        my_name = (Button) findViewById(R.id.my_name);
        my_name.setOnClickListener(this);

        restaurants = (Button) findViewById(R.id.restaurants);
        restaurants.setOnClickListener(this);

        water = (Button) findViewById(R.id.water);
        water.setOnClickListener(this);

        what_do = (Button) findViewById(R.id.what_do);
        what_do.setOnClickListener(this);

        your_name = (Button) findViewById(R.id.your_name);
        your_name.setOnClickListener(this);
    }
}
