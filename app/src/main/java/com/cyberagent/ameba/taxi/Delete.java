package com.cyberagent.ameba.taxi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.View;


public class Delete extends Activity implements View.OnTouchListener {

    private ImageView TaxiPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        TaxiPicture= (ImageView)findViewById(R.id.imageView);

    }

    @Override
    public boolean onTouch(View arg0, MotionEvent arg1) {
        //Viewの初期化
        TaxiPicture = (ImageView)findViewById(R.id.imageView);
        TaxiPicture.setOnTouchListener(this);
        switch(arg1.getAction()) {
            case MotionEvent.ACTION_DOWN :
                TaxiPicture.setImageResource(R.drawable.ic_action_name);
                return true;
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.delete, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
