package com.example.haita.test;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText height;
    EditText weight;

    Button submit;

    //TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText)findViewById(R.id.editText);
        weight = (EditText)findViewById(R.id.editText2);

        submit = (Button)findViewById(R.id.button);

//        result = (TextView)findViewById(R.id.textView);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double myHeight = Double.parseDouble(height.getText().toString());
                double myWeight = Double.parseDouble(weight.getText().toString());
                double answer = myWeight / (myHeight * myHeight);
//              result.setText("" + answer);

                Intent i = new Intent();
                Bundle b = new Bundle();
//                把你的值捆綁在Intent上
                b.putDouble("myAnswer", answer);
                i.setClass(MainActivity.this, secondActivity.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
