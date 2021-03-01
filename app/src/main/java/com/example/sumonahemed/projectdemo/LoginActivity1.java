package com.example.sumonahemed.projectdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity1 extends AppCompatActivity {

    private EditText usernameedittext,passwordedittext;
    private Button loginbutton;
    private AlertDialog.Builder builder;
    private TextView textView;
    private int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        usernameedittext = findViewById(R.id.edittext1Id);
        passwordedittext = findViewById(R.id.edittext2Id);
        loginbutton = findViewById(R.id.loginbuttonId);
        textView = findViewById(R.id.textviewId);

        textView.setText("Number of incorrect attemps:3");

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value1 = usernameedittext.getText().toString();
                String value2 = passwordedittext.getText().toString();

                if(value1.equals("admin") && value2.equals("123"))
                {
                    Intent intent = new Intent(LoginActivity1.this,MainActivity.class);
                    startActivity(intent);

                    usernameedittext.setText("");
                    passwordedittext.setText("");
                }
                else{
                    count--;
                    textView.setText("Number of incorrect attemps: "+count);
                }
                if(count==0)
                {
                    loginbutton.setEnabled(false);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want exists");
        builder.setTitle("Warning");
        builder.setIcon(R.drawable.warning);
        builder.setCancelable(false);

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
