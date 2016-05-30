package com.example.mypar.testrepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                //SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
                String nameString =
                        new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA).format(new Date()) +
                        " " + editText.getText().toString();

                Toast.makeText(getApplicationContext(), nameString, Toast.LENGTH_LONG).show();
            }
        });
    }
}