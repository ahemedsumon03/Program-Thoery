package com.example.sumonahemed.projectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class SpalchScreenActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spalch_screen);


        progressBar = findViewById(R.id.progressbarId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                dowork();
                startapp();
            }
        });

        thread.start();
    }

    public void dowork()
    {
        for(progress= 20;progress<=100;progress=progress+20)
        {
            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void startapp()
    {
        Intent intent = new Intent(SpalchScreenActivity.this,LoginActivity1.class);
        startActivity(intent);
        finish();
    }
}
