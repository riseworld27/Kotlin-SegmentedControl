package com.segement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CustomSegement.OnTimePositionChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomSegement customSegement;
        customSegement = (CustomSegement)findViewById(R.id.date_view);
        customSegement.setTime(2);
        customSegement.setTimePositionChangeListener(this);
    }

    @Override
    public void onTimePositionChanged(int timePosition) {
        Toast.makeText(this, String.format("Clicked %d item", timePosition), Toast.LENGTH_SHORT).show();
    }
}
