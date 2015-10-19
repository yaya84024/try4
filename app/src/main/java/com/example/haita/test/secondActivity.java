package com.example.haita.test;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by chingya on 2015/10/19.
 */


public class secondActivity extends ActionBarActivity{

    TextView result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        result2 = (TextView)findViewById(R.id.textView2);


        Bundle b = getIntent().getExtras();
        double Answer = b.getDouble("myAnswer");

        result2.setText("" + Answer);
    }

}
