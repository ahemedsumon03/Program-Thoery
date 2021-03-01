package com.example.sumonahemed.projectdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailsPage extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView = findViewById(R.id.textviewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null)
        {
            String value1 = bundle.getString("keyname");
            Showdetails(value1);
        }
    }


    public void Showdetails(String value1)
    {
        if(value1.equals("Printf"))
        {
           textView.setText(R.string.printf);
        }
        else if(value1.equals("Scanf"))
        {
           textView.setText(R.string.scanf);
        }
        else if(value1.equals("Loop"))
        {
           textView.setText(R.string.loop);
        }
        else if(value1.equals("Condition"))
        {
            textView.setText(R.string.condition);
        }
        else if(value1.equals("Operator"))
        {
            textView.setText(R.string.Operator);
        }
        else if(value1.equals("file"))
        {
            textView.setText(R.string.File);
        }
        else if(value1.equals("Structure"))
        {
            textView.setText(R.string.Structure);
        }
        else if(value1.equals("Nested Loop"))
        {
            textView.setText(R.string.NestedLoop);
        }
        else if(value1.equals("Array"))
        {
            textView.setText(R.string.Array);
        }
        else if(value1.equals("String"))
        {
            textView.setText(R.string.String);
        }
        else if(value1.equals("Switch"))
        {
            textView.setText(R.string.Switch);
        }
        else if(value1.equals("Nested if"))
        {
            textView.setText(R.string.NestedIf);
        }
        else if(value1.equals("HeaderFile"))
        {
            textView.setText(R.string.HeaderFile);
        }
        else if(value1.equals("For Loop"))
        {
            textView.setText(R.string.ForLoop);
        }
        else if(value1.equals("While Loop"))
        {
            textView.setText(R.string.WhileLoop);
        }
        else if(value1.equals("Pointer"))
        {
            textView.setText(R.string.Pointer);
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
