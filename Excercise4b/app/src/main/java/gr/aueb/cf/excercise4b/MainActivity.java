package gr.aueb.cf.excercise4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText usernameTextView;
    private EditText emailTextView;
    private EditText passwordTextView;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameTextView = findViewById(R.id.username_textview);
        emailTextView = findViewById(R.id.email_textview);
        passwordTextView = findViewById(R.id.password_textview);
        registerButton = findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameTextView.getText().toString();
                String email = emailTextView.getText().toString();
                String password = passwordTextView.getText().toString();

                Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });
    }
}