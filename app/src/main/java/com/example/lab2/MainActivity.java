package com.example.lab2;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Switch rotateSwitch;
    private Button rotateButton;
    private float currentRotation = 0;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean switchState = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        rotateSwitch = findViewById(R.id.switch1);
        rotateButton = findViewById(R.id.button);



        rotateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle switch change event if needed
            }
        });

        // Start rotating the image every 5 seconds
        startRotatingTask();
    }

    private void startRotatingTask() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Change switch state
                switchState = !switchState;
                rotateSwitch.setChecked(switchState);

                // Rotate the image by 90 degrees clockwise
                currentRotation += 90;
                rotateImage();

                // Schedule the next rotation after 5 seconds
                startRotatingTask();
            }
        }, 5000); // 5000 milliseconds = 5 seconds
    }

    private void rotateImage() {
        imageView.setRotation(currentRotation);
    }


}
