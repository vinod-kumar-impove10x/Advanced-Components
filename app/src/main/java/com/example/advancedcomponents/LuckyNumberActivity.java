package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class LuckyNumberActivity extends AppCompatActivity {

    public Integer[] luckyNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lucky_number);
        getSupportActionBar().setTitle("Lucky Number");
        setLuckyNumbers();
    }

    public void setLuckyNumbers() {
        Spinner luckyNumbersSp = findViewById(R.id.lucky_number_sp);

        ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(this, R.layout.drop_down_item, luckyNumbers);
        luckyNumbersSp.setAdapter(arrayAdapter);
        luckyNumbersSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(LuckyNumberActivity.this, "Lucky Number : " + luckyNumbers[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}