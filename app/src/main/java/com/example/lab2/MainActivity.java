package com.example.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lab2.R;



public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button rotateSwitch;
    private float currentRotation = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        rotateSwitch = findViewById(R.id.button);

        rotateSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Rotate the image by 90 degrees clockwise
                currentRotation += 90;
                rotateImage();
            }
        });
    }

    private void rotateImage() {
        imageView.setRotation(currentRotation);
    }
}
