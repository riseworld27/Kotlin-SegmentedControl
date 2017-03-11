package com.segement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomSegement customSegement;
        customSegement = (CustomSegement)findViewById(R.id.date_view);
        customSegement.setTime(0);
    }
}
