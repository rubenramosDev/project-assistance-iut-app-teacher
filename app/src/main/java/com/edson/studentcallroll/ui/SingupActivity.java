package com.edson.studentcallroll.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.edson.studentcallroll.R;

public class SingupActivity extends AppCompatActivity {

    private EditText etxtLastName;
    private EditText etxtFirstName;
    private EditText etxtStudentNum;
    private EditText etxtUser;
    private EditText etxtPassword;
    private Button btnLogin;
    private TextView txtvSingup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        setupComponents();
    }

    public void setupComponents(){
        etxtLastName = findViewById(R.id.etxtLastName);
        etxtFirstName = findViewById(R.id.etxtFirstName);
        etxtStudentNum = findViewById(R.id.etxtStudentNum);
        etxtUser = findViewById(R.id.etxtUser);
        etxtPassword = findViewById(R.id.etxtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtvSingup = findViewById(R.id.txtvSingup);
    }

    public void startLoginActivity(View view){
        Intent intent = new Intent(view.getContext(), LoginActivity.class);
        startActivity(intent);
    }
}