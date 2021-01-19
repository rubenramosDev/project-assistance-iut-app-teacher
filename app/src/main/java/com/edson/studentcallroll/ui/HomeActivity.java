package com.edson.studentcallroll.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.edson.studentcallroll.R;

public class HomeActivity extends AppCompatActivity {

    CardView cardView3;
    TextView txtVNom;
    TextView txtVPrenom;
    private SharedPreferences shPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setupComponents();
    }

    public void setupComponents() {
        cardView3 = findViewById(R.id.cardView3);
        txtVNom = findViewById(R.id.txtVLastName);
        txtVPrenom = findViewById(R.id.txtVPrenom);
        shPref = HomeActivity.this.getSharedPreferences("StudentCallRoll_ShPref", 0);
        txtVNom.setText(shPref.getString("last_name", null));
        txtVPrenom.setText(shPref.getString("first_name", null));
    }

    public void startAssistsActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, AssistanceListActivity.class);
        startActivity(intent);
    }

    public void startGenerateQrCodeActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, GenerateQrCodeActivity.class);
        startActivity(intent);
    }

    public void startReadQrCodeActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, ReadQrCodeActivity.class);
        startActivity(intent);
    }
}