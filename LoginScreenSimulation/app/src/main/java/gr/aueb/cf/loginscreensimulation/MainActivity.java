package gr.aueb.cf.loginscreensimulation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText usernameET;
    private  EditText passwordET;
    private Button loginBtn;
    private TextView registerTV;
    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
        loginBtn = findViewById(R.id.loginBtn);
        registerTV = findViewById(R.id.registerTV);



        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = usernameET.getText().toString().trim();
                password = passwordET.getText().toString().trim();

                if (isValidCredentials(username,password)) {
                   displayWelcome(username);
                } else {
                    displayError();
                }
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        return username.equals("admin") && password.equals("aaa");
    }

    private void displayWelcome(String username) {
        String message = "Welcome " + username;
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    private void displayError() {
        String message = "invalid credentials";
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}