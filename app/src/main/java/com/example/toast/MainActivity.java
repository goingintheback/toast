package com.example.toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void buttonClickedFirstMonkey(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали первую обезьянку",Toast.LENGTH_LONG);
        myToast.show();
    }

    public void buttonClickedSecondMonkey(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали вторую обезьянку",Toast.LENGTH_LONG);
        myToast.show();
    }

    public void buttonClickedTherieMonkey(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),"Вы выбрали третью обезьянку",Toast.LENGTH_LONG);
        myToast.show();
    }
}