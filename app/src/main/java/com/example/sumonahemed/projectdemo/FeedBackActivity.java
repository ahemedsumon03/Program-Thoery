package com.example.sumonahemed.projectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FeedBackActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText NameEditText,CommentEditText;
    private Button SendButton,ClearButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        NameEditText = findViewById(R.id.nameEditTextId);
        CommentEditText = findViewById(R.id.commentEditTextId);
        SendButton = findViewById(R.id.sendButtonId);
        ClearButton = findViewById(R.id.clearButtonId);

        SendButton.setOnClickListener(this);
        ClearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String name = NameEditText.getText().toString();
        String information = CommentEditText.getText().toString();

        if(name.equals("")&& (information.equals("")))
        {
            Toast.makeText(getApplicationContext(),"You did't write anything",Toast.LENGTH_LONG).show();
        }
        else
        {
            if(v.getId()==R.id.sendButtonId)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");
                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"mamunbubt196@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from App");
                intent.putExtra(Intent.EXTRA_TEXT,name+"\n"+information);
                startActivity(Intent.createChooser(intent,"Feedback with"));

            }
        }

        if(v.getId()==R.id.clearButtonId)
        {
            NameEditText.setText("");
            CommentEditText.setText("");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
