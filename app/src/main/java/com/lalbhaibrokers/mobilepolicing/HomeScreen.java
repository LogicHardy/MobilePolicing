package com.lalbhaibrokers.mobilepolicing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void goToComplaintRegistration(View view) {
        Intent intent = new Intent(getApplicationContext(), ComplaintRegistration.class);
        startActivity(intent);
    }

    public void goToDocumentVerification(View view) {
        Intent intent = new Intent(getApplicationContext(), DocumentVerification.class);
        startActivity(intent);
    }

    public void goToSoSButton(View view) {
        Intent intent = new Intent(getApplicationContext(), SoSButton.class);
        startActivity(intent);
    }

    public void goToTravelGuidebook(View view) {
        Intent intent = new Intent(getApplicationContext(), ComplaintRegistration.class);
        startActivity(intent);
    }
}