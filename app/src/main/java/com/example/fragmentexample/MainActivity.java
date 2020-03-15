package com.example.fragmentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExampleFragment fragment = ExampleFragment.newInstance("Asif Parvez ", 26);
        getSupportFragmentManager().beginTransaction().replace(R.id.main_activity_container, fragment).commit();


    }
}
