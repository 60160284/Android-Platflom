package com.tksaint.mylinearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int number = 0;
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCount = findViewById(R.id.txtCountDisplay);
    }

    public void showMessage(View v) {
        Toast t = Toast.makeText(this, "Hello Saint", Toast.LENGTH_LONG);
        t.show();
    }

    public void counttUp(View v) {
        String strNumber;
        number++;
        strNumber = Integer.toString(number);
        tvCount.setText(strNumber);

    }

    public void counttDown(View v) {
        String strNumber;
        number--;
        strNumber = Integer.toString(number);
        tvCount.setText(strNumber);
    }
}