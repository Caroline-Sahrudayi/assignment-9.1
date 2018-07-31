package com.jkmca.caroline.options_menu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*declaring variables*/
TextView textcolor;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        @Override
        /*instantiating menu xml files to menu objects*/
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return super.onCreateOptionsMenu(menu);
        }


            /*defining the onOptionsItemSelected method*/
            @Override
    public boolean onOptionsItemSelected(MenuItem item)
                {
                    /*typecasting textview in activity_main */
        textcolor=(TextView)findViewById(R.id.text1);

        int id=item.getItemId();
        switch (id)
        {
            /*changing the color of textview to black*/
            case R.id.black:
                textcolor.setTextColor(Color.rgb(0,0,0));
                break;
            /*changing the color of textview to blue*/
            case R.id.blue:
                textcolor.setTextColor(Color.rgb(0, 0, 255));
                break;
            /*changing the color of textview to yellow*/
            case R.id.yellow:
                textcolor.setTextColor(Color.rgb(255, 255, 0));
                break;
            /*changing the color of textview to red*/
            case R.id.red:
                textcolor.setTextColor(Color.rgb(0, 0, 0));
                break;



        }


        return super.onOptionsItemSelected(item);

        }

}
