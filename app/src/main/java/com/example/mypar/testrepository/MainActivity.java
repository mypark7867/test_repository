package com.example.mypar.testrepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    InputMethodManager inputManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button = (Button) findViewById(R.id.button);
        View outButton = (Button) findViewById(R.id.outButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View inputLayout = findViewById(R.id.inputLayout);
                final View resultLayout = findViewById(R.id.resultLayout);
                final View resultImageView = findViewById(R.id.resultImageView);
                TextView inTextView = (TextView) findViewById(R.id.resultTextView);
                EditText editText = (EditText) findViewById(R.id.editText);
                String guest = editText.getText().toString();
                inputManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

                inputLayout.setVisibility(View.GONE);
                resultLayout.setVisibility(View.VISIBLE);
                inputManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);


                if (guest.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "이름을 입력하세요", Toast.LENGTH_LONG).show();
                    inputLayout.setVisibility(View.VISIBLE);
                    resultLayout.setVisibility(View.GONE);

                } else if (guest.contentEquals("노적") || guest.contentEquals("김노적")) {
                    resultImageView.setBackgroundResource(R.drawable.attack_room);
                    inTextView.setText(guest + "님, " + "빨리와봐요.\n제가 공격입니다. 앙~!");
                } else if (guest.contentEquals("손광락")) {
                    resultImageView.setBackgroundResource(R.drawable.son_whip);
                    inTextView.setText(guest + "님, " + "엎드리락~!");
                } else if (guest.contentEquals("조동묵")) {
                    resultImageView.setBackgroundResource(R.drawable.angeles);
                    inTextView.setText(guest + "님, " + "맘에 드는 번호를 골라보세요");
                } else if (guest.contentEquals("한규진") || guest.contentEquals("최진일")) {
                    resultImageView.setBackgroundResource(R.drawable.thailand);
                    inTextView.setText(guest + "님, " + "광란의 밤을 보내볼까요?");
                } else if (guest.contentEquals("김인표")) {
                    resultImageView.setBackgroundResource(R.drawable.inpyo_trust);
                    inTextView.setText(guest + "님, " + "시험에 들지 말고 저와 함께해요.");
                } else {
                    resultImageView.setBackgroundResource(R.drawable.lovely_room);
                    inTextView.setText(guest + "님, " + "어서오세요.");
                }
            }
        });

        outButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final View inputLayout = findViewById(R.id.inputLayout);
                inputLayout.setVisibility(View.VISIBLE);
                final View resultLayout = findViewById(R.id.resultLayout);
                resultLayout.setVisibility(View.GONE);
            }
        });
    }
}