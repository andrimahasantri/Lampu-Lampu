package com.example.lampu_lampu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    SwitchCompat switchCompat;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat = findViewById(R.id.switchbutton);
        imageView = findViewById(R.id.imageview);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.lampfff));

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchCompat.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.lampnn));
                }
                else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.lampfff));
                }
            }
        });
    }
}