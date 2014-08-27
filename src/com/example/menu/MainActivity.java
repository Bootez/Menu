package com.example.menu;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView testTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testTextView = (TextView)findViewById(R.id.tv_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        SubMenu fontMenu = menu.addSubMenu("Font Settings");
        fontMenu.setIcon(R.drawable.ic_launcher);
        fontMenu.add(0, R.id.FONT_SIZE_10, 0, "10 pt");
        fontMenu.add(0, R.id.FONT_SIZE_12, 0, "12 pt");
        fontMenu.add(0, R.id.FONT_SIZE_14, 0, "14 pt");
        fontMenu.add(0, R.id.FONT_SIZE_16, 0, "16 pt");
        
        SubMenu colorMenu = menu.addSubMenu("Color Settings");
        colorMenu.add(0, R.id.COLOR_RED, 0, "Red");
        colorMenu.add(0, R.id.COLOR_GREEN, 0, "Green");
        colorMenu.add(0, R.id.COLOR_BLUE, 0, "Blue");
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.FONT_SIZE_10:
            testTextView.setTextSize(10);
            break;
        case R.id.FONT_SIZE_12:
            testTextView.setTextSize(12);
            break;
        case R.id.FONT_SIZE_14:
            testTextView.setTextSize(14);
            break;
        case R.id.FONT_SIZE_16:
            testTextView.setTextSize(16);
            break;
            
        case R.id.COLOR_RED:
            testTextView.setTextColor(Color.RED);
            break;
        case R.id.COLOR_GREEN:
            testTextView.setTextColor(Color.GREEN);
            break;
        case R.id.COLOR_BLUE:
            testTextView.setTextColor(Color.BLUE);
            break;

        default:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

}
