package org.freedu.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    private TextView welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome = findViewById(R.id.welcometxt);
        Intent intent = getIntent();

        String name = intent.getStringExtra("username");

        welcome.setText("Welcome, "+name+", to our food khaw app.");

    }
}