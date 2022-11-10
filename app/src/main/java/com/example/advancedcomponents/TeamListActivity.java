package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TeamListActivity extends AppCompatActivity {
    public ArrayList<String> namesList;
    public ListView teamListLv;
    public ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_list);
        handleAddButton();
        setupData();
        setUpTeamList();
    }

    private void handleAddButton() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            EditText memberNameTxt = findViewById(R.id.member_name_txt);
            String memberName = memberNameTxt.getText().toString();
            if(memberName.equals("")== false) {
                arrayAdapter.add(memberName);
                arrayAdapter.notifyDataSetChanged();
            }
                memberNameTxt.setText("");
        });
    }

    private void setupData() {
        namesList = new ArrayList<>();
        namesList.add("Viswanath");
        namesList.add("Renuka");
    }

    public void setUpTeamList() {
        teamListLv = findViewById(R.id.name_list_lv);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, namesList);
        teamListLv.setAdapter(arrayAdapter);
        teamListLv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(TeamListActivity.this, "Name List : " + namesList, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}