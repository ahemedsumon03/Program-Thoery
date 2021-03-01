package com.example.sumonahemed.projectdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ExpandableListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AbrevationActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private List<String> listdataheader;
    private HashMap<String,List<String>>listdatachild;
    private CustomAdapter customAdapter;
    private int lastexpandPosition =-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abrevation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        prepareListData();

        expandableListView = findViewById(R.id.expandablelistviewId);
        customAdapter = new CustomAdapter(this,listdataheader,listdatachild);
        expandableListView.setAdapter(customAdapter);

        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

                if(lastexpandPosition!=-1 && lastexpandPosition!=groupPosition)
                {
                    expandableListView.collapseGroup(lastexpandPosition);
                }
                lastexpandPosition = groupPosition;
            }
        });

    }

    public void prepareListData()
    {
        String [] headerstring = getResources().getStringArray(R.array.shortcut);
        String [] childstring = getResources().getStringArray(R.array.FullMeaning);

        listdataheader = new ArrayList<>();
        listdatachild = new HashMap<>();

        for(int i=0;i<headerstring.length;i++)
        {
            //adding value with listDataheader

            listdataheader.add(headerstring[i]);

            List<String> child = new ArrayList<>();
            child.add(childstring[i]);

            listdatachild.put(listdataheader.get(i),child);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_layout2,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {
            this.finish();
        }

        if(item.getItemId()==R.id.share2Id)
        {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String text = "Programming concept";
            String subject = "This is very usefull";

            intent.putExtra(Intent.EXTRA_TEXT,text);
            intent.putExtra(Intent.EXTRA_SUBJECT,subject);

            startActivity(Intent.createChooser(intent,"Share with"));
        }



        return super.onOptionsItemSelected(item);
    }


}
