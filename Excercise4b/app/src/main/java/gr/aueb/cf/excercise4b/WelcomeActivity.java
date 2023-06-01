package gr.aueb.cf.excercise4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView welcomeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        welcomeTextView = findViewById(R.id.welcome_textview);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");

        String welcomeMessage = "Welcome " + username + ". Your registration with email " + email + " and password " + password + " completed.";
        welcomeTextView.setText(welcomeMessage);
    }
}