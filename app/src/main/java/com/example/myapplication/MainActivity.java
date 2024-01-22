package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editTextName;
Button btnClickHere;
TextView textName;
ImageView imageView;
RadioGroup radioGroup;
RadioButton radioButton;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName=(EditText) findViewById(R.id.editTextName);
        btnClickHere=(Button) findViewById(R.id.btnClickHere);
        textName=(TextView) findViewById(R.id.textName);
        imageView=(ImageView) findViewById(R.id.imageView);
        radioGroup=findViewById(R.id.radioGroup);
        textView=findViewById(R.id.text_view_selected);

        Button buttonApply = findViewById(R.id.apply_button);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                textView.setText("Your choice: "+radioButton.getText());
            }
        });

            {
            int radioId = radioGroup.getCheckedRadioButtonId();
            radioButton = findViewById(radioId);
            Toast.makeText( this, "Selected radio button: "+radioButton.getText(), Toast.LENGTH_SHORT).show();


        }
        btnClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editTextName.getText().toString();
                textName.setText("Hi " +name);
            }
        });
    }
}