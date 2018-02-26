package com.example.haryono.lowkost;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {
    public static int SPLASH_TIME_OUT=4000; //Inisiasi splash

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this,"KELOMPOK 8",Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() { //inisiasi handler
            @Override
            public void run() { //inisiasi method run
                Intent homeIntent = new Intent(SplashScreen.this, MainActivity.class); //inisiasi intent
                startActivity(homeIntent);  //memanggil method start
                finish(); //memanggil method finish
            }
        },SPLASH_TIME_OUT); //tag penutup splash
    }
}

