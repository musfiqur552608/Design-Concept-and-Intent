package org.freedu.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username, email, password, conpass;
    private Button registerbtn;
    private TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.usernameid);
        email = findViewById(R.id.emailid);
        password = findViewById(R.id.passid);
        conpass = findViewById(R.id.conpassid);
        registerbtn = findViewById(R.id.registerbtn);
        login = findViewById(R.id.logintxt);

        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = username.getText().toString();
                String userEmail = email.getText().toString();
                String userPass = password.getText().toString();
                String userConPass = conpass.getText().toString();

                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("username", userName);
                startActivity(intent);

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
//                finish();
            }
        });

    }
}