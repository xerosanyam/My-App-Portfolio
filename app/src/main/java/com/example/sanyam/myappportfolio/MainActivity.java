package com.example.sanyam.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
    }

    public void raiseToast(View view) {
        Button b = (Button) view;
        String result = b.getText().toString();
        Toast.makeText(getApplicationContext(), result.contains("App") ? "This button will launch my " + result + "!" : "This button will launch my " + result + " App!", Toast.LENGTH_SHORT).show();
    }
}
