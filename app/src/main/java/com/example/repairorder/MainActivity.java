package com.example.repairorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    View.OnClickListener submitListener = new View.OnClickListener() {
        public void onClick(View v) {
            Float orderType2 = Float.valueOf(orderType1.getText().toString());
            Float technician2 = Float.valueOf(technician1.getText().toString());
            Float inspection2 = Float.valueOf(inspection1.getText().toString());
            Float paint2 = Float.valueOf(paint1.getText().toString());
            Float parts2 = Float.valueOf(parts1.getText().toString());
            Float labor2 = Float.valueOf(labor1.getText().toString());

            DecimalFormat df = new DecimalFormat("###.##");

            double sub = orderType2 + technician2 + inspection2 + paint2 + parts2 + labor2;
            double taxx = (sub * .07);
            double tot = (taxx + sub);

            subtotal.setText(String.valueOf(df.format(sub)));
            tax.setText(String.valueOf(df.format(taxx)));
            total.setText(String.valueOf(df.format(tot)));
        }
    };
    Button button_id;
    EditText orderType1;
    EditText technician1;
    EditText inspection1;
    EditText paint1;
    EditText parts1;
    EditText labor1;

    TextView subtotal;
    TextView tax;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_id = findViewById(R.id.button_id);
        orderType1 = findViewById(R.id.editTextText);
        technician1 = findViewById(R.id.editTextText2);
        inspection1 = findViewById(R.id.editTextText3);
        paint1 = findViewById(R.id.editTextText4);
        parts1 = findViewById(R.id.editTextText5);
        labor1 = findViewById(R.id.editTextText6);

        subtotal = findViewById(R.id.textView12);
        tax = findViewById(R.id.textView15);
        total = findViewById(R.id.textView14);

        button_id.setOnClickListener(submitListener);

        }

    }