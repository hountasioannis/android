package gr.aueb.cf.excercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText kilograms;
    private TextView button;
    private TextView poundsResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kilograms = findViewById(R.id.kilograms);
        button = findViewById(R.id.button);
        poundsResult = findViewById(R.id.poundsResult);
        String decimalPattern = "(\\d*\\.?\\d+)";

        kilograms.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                kilograms.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("red")));
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kilograms.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("grey")));
                String data = kilograms.getText().toString();

                if (Pattern.matches(decimalPattern, data)) {
                    Double result = Double.parseDouble(data) * 2.205;
                    poundsResult.setText(result.toString());
                } else {
                    poundsResult.setText("insert a number");
                }
            }
        });
    }
}