package com.example.sumonahemed.projectdemo;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class CsharpDetailspage extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp_detailspage);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView = findViewById(R.id.textview2Id);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            String value1 = bundle.getString("keyname");
            Showdetails(value1);
        }
    }

    public void Showdetails(String value1)
    {
        if(value1.equals("Writeline"))
        {
            textView.setText(R.string.writeline);
        }
        else if(value1.equals("Readline"))
        {
            textView.setText(R.string.readline);
        }
        else if(value1.equals("Inharitance"))
        {
            textView.setText(R.string.inharitance);
        }
        else if(value1.equals("Polimorphisum"))
        {
            textView.setText(R.string.polimorphisum);
        }
        else if(value1.equals("Loop"))
        {
            textView.setText(R.string.loop1);
        }
        else if(value1.equals("Foreach Loop"))
        {
            textView.setText(R.string.foreachloop);
        }
        else if(value1.equals("Namespace"))
        {
            textView.setText(R.string.namespace);
        }
        else if(value1.equals("Static"))
        {
            textView.setText(R.string.static1);
        }
        else if(value1.equals("Method Hiding"))
        {
            textView.setText(R.string.Methodhiding);
        }
        else if(value1.equals("Method Overridding"))
        {
            textView.setText(R.string.MethodOverriding);
        }
        else if(value1.equals("Method Overloading"))
        {
            textView.setText(R.string.MethodOverloading);
        }
        else if(value1.equals("Struct"))
        {
            textView.setText(R.string.Struct);
        }
        else if(value1.equals("Interface"))
        {
            textView.setText(R.string.interface1);
        }
        else if(value1.equals("Abstruct Class"))
        {
            textView.setText(R.string.AbstructClass);
        }
        else if(value1.equals("Delegets"))
        {
            textView.setText(R.string.Delegets);
        }
        else if(value1.equals("Exception Handling"))
        {
            textView.setText(R.string.ExceptionHandling);
        }
        else if(value1.equals("Enums"))
        {
            textView.setText(R.string.Enums);
        }
        else if(value1.equals("Access Modifier"))
        {
            textView.setText(R.string.AccessModifier);
        }
        else if(value1.equals("Thread"))
        {
            textView.setText(R.string.Thread);
        }
        else if(value1.equals("Anonymoas Method"))
        {
            textView.setText(R.string.AnonymoasMethod);
        }
        else if(value1.equals("Lambda Expression"))
        {
            textView.setText(R.string.LambdaExpression);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
           finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
