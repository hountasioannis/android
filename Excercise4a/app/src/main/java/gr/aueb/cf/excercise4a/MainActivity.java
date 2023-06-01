package gr.aueb.cf.excercise4a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.net.Uri;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText phoneNumberEditText;
    private Button callButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNumberEditText = findViewById(R.id.phone_number_edittext);
        callButton = findViewById(R.id.call_button);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall();
            }
        });

    }

    private void makePhoneCall() {
        String phoneNumber = phoneNumberEditText.getText().toString().trim();

        if (phoneNumber.isEmpty()) {
            Toast.makeText(this, "Παρακαλώ εισάγετε έναν τηλεφωνικό αριθμό", Toast.LENGTH_SHORT).show();
        } else {
                String dial = "tel:" + phoneNumber;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
        }
    }
}