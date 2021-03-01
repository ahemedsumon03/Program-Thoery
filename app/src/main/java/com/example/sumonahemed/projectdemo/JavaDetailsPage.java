package com.example.sumonahemed.projectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class JavaDetailsPage extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_details_page);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView = findViewById(R.id.textview2Id);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            String item = bundle.getString("Name");
            ShowDetails(item);
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

    public void ShowDetails(String item)
    {
        if(item.equals("System out"))
        {
           textView.setText(R.string.Systemout);
        }
        else if(item.equals("Scanner"))
        {
            textView.setText(R.string.Scanner);
        }
        else if(item.equals("Class"))
        {
            textView.setText(R.string.Class);
        }
        else if(item.equals("Condition"))
        {
            textView.setText(R.string.Condition);
        }
        else if(item.equals("Loop"))
        {
            textView.setText(R.string.Loop);
        }
        else if(item.equals("Inheritance"))
        {
            textView.setText(R.string.Inheritance);
        }
        else if(item.equals("Polymorphisum"))
        {
            textView.setText(R.string.Polymorphisum);
        }
        else if(item.equals("Encapsulation"))
        {
            textView.setText(R.string.Encapsulation);
        }
        else if(item.equals("Abstraction"))
        {
            textView.setText(R.string.Abatraction);
        }
        else if(item.equals("Interface"))
        {
            textView.setText(R.string.Interface);
        }
        else if(item.equals("File"))
        {
            textView.setText(R.string.file);
        }
        else if(item.equals("ArrayList"))
        {
            textView.setText(R.string.ArrayList);
        }
        else if(item.equals("LinkedList"))
        {
            textView.setText(R.string.Linkedlist);
        }
        else if(item.equals("Hashmap"))
        {
            textView.setText(R.string.Hashmap);
        }
        else if(item.equals("Switch"))
        {
            textView.setText(R.string.switch1);
        }
        else if(item.equals("Operator"))
        {
            textView.setText(R.string.Operator1);
        }
        else if(item.equals("Packege"))
        {
            textView.setText(R.string.Packege);
        }
        else if(item.equals("Static"))
        {
            textView.setText(R.string.Static);
        }
        else if(item.equals("final"))
        {
            textView.setText(R.string.Final);
        }
        else if(item.equals("String"))
        {
            textView.setText(R.string.String1);
        }
        else if(item.equals("StringBuffer"))
        {
            textView.setText(R.string.StringBuffer);
        }
        else if(item.equals("StringBuilder"))
        {
            textView.setText(R.string.StringBuilder);
        }
    }



}
