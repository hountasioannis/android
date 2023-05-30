package gr.aueb.cf.excercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editTextText;
    private EditText editTextText2;
    private RelativeLayout relative1;
    private RelativeLayout relative2;
    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextText = findViewById(R.id.editTextText);
        editTextText2 = findViewById(R.id.editTextText2);
        relative1 = findViewById(R.id.relative1);
        relative2 = findViewById(R.id.relative2);
        username = relative1.findViewById(R.id.username);
        password = relative2.findViewById(R.id.password);

        editTextText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editTextText.setBackgroundResource(R.drawable.edit_text_border_pink);
                username.setText("username");
                username.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




        editTextText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                editTextText2.setBackgroundResource(R.drawable.edit_text_border_pink);
                password.setText("password");
                password.setBackgroundColor(Color.parseColor("#FFFFFF"));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}