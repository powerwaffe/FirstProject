package edu.dtcc.spaol1.firstproject;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText message = (EditText) findViewById(R.id.getName);
        //message.setText("I Like Pie");

        btnClickMe = (Button) findViewById(R.id.buttonClick);

        btnClickMe.setOnClickListener((View.OnClickListener) MainActivity.this);

    }

    public void onClick(View v)
    {
        EditText message = (EditText) findViewById(R.id.getName);
    }
}

