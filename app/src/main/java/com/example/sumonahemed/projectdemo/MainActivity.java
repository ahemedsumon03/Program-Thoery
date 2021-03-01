package com.example.sumonahemed.projectdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView cimageview,javaimageview,docxiew,quizview,csharpview;
    private RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cimageview = findViewById(R.id.cprogramId);
        javaimageview = findViewById(R.id.javaprogramId);
        docxiew = findViewById(R.id.docId);
        relativeLayout= findViewById(R.id.relativelayoutid);
        quizview = findViewById(R.id.quizviewid);
        csharpview = findViewById(R.id.csharpid);


        cimageview.setOnClickListener(this);
        javaimageview.setOnClickListener(this);
        docxiew.setOnClickListener(this);
        quizview.setOnClickListener(this);
        csharpview.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.feedbackId)
        {
            Intent intent = new Intent(MainActivity.this,FeedBackActivity.class);
            startActivity(intent);

        }
        else if(item.getItemId()==R.id.shareId)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String subject = "Program is creative";
            String text = "This app is very useful for learn programming";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,text);

            startActivity(Intent.createChooser(intent,"Share With"));

        }
        else if(item.getItemId()==R.id.aboutmeId)
        {

            Intent intent = new Intent(getApplicationContext(),AboutMeActivity.class);
            intent.putExtra("Name","About me");
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.cprogramId)
        {
            Intent intent = new Intent(MainActivity.this,CInformationPage.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.javaprogramId)
        {
           Intent intent = new Intent(MainActivity.this,JavaInformationPage.class);
           startActivity(intent);
        }
        else if(v.getId()==android.R.id.home)
        {
            onBackPressed();

        }
        else if(v.getId()==R.id.docId)
        {
            Intent intent = new Intent(MainActivity.this,AbrevationActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.csharpid)
        {
            Intent intent = new Intent(MainActivity.this,CsharpInformationPage.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.quizviewid)
        {
            Intent intent = new Intent(MainActivity.this,QuizActivity.class);
            startActivity(intent);
        }
    }
}
