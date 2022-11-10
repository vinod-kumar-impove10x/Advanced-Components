package com.example.advancedcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().setTitle("Home");
        handleLuckyNumberButton();
        handleLocationButton();
        handleDateOfBirthButton();
        handleTeamButton();
        handleAddMemberButton();
    }

    public void handleLuckyNumberButton(){
        Button luckyNumberBtn = findViewById(R.id.lucky_number_btn);
        luckyNumberBtn.setOnClickListener(view -> {
            Intent luckyNumberIntent = new Intent(this,LuckyNumberActivity.class);
            startActivity(luckyNumberIntent);
        });
    }

    public void handleLocationButton(){
        Button locationBtn = findViewById(R.id.location_btn);
        locationBtn.setOnClickListener(view -> {
            Intent locationIntent = new Intent(this,LocationActivity.class);
            startActivity(locationIntent);
        });
    }

    public void handleDateOfBirthButton(){
        Button dateOfBirthBtn = findViewById(R.id.date_of_birth_btn);
        dateOfBirthBtn.setOnClickListener(view -> {
            Intent dateOfBirthIntent = new Intent(this,DateOfBirthActivity.class);
            startActivity(dateOfBirthIntent);
        });
    }

    public void handleTeamButton(){
        Button teamBtn = findViewById(R.id.team_btn);
        teamBtn.setOnClickListener(view -> {
            Intent teamIntent = new Intent(this,TeamActivity.class);
            startActivity(teamIntent);
        });
    }

    public void handleAddMemberButton(){
        Button addMemberBtn = findViewById(R.id.add_member_btn);
        addMemberBtn.setOnClickListener(view -> {
            Intent addMemberIntent = new Intent(this,AddMemberActivity.class);
            startActivity(addMemberIntent);
        });
    }
}