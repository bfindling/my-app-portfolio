package com.mightycircuit.www.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;



// Brian Findling
// June 9, 2015
// Udacity Android Developer NanoDegree

// Project 0: My App Portfolio



public class MainActivity extends ActionBarActivity implements OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        button1.setTag("1");
        button2.setTag("2");
        button3.setTag("3");
        button4.setTag("4");
        button5.setTag("5");
        button6.setTag("6");

    }
    @Override
    public void onClick(View v) {

        String tag=(String)v.getTag();

        switch (tag) {

            case "1" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Spotify Streamer app!", Toast.LENGTH_LONG).show();
            break;

            case "2" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Scores app!", Toast.LENGTH_LONG).show();
                break;
            case "3" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Library app!", Toast.LENGTH_LONG).show();
                break;
            case "4" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Build it bigger app!", Toast.LENGTH_LONG).show();
                break;
            case "5" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my XYZ Reader app!", Toast.LENGTH_LONG).show();
                break;
            case "6" :
                Toast.makeText(getApplicationContext(),
                        "This button will launch my Capstone: My own app!", Toast.LENGTH_LONG).show();
                break;

        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
