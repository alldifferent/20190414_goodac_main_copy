package com.alldi.a20190414_goodac_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText searchEdt;
    Button searchBtn;
    TextView welcomeTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEdt = findViewById(R.id.searchEdt);
        searchBtn = findViewById(R.id.searchBtn);
        welcomeTxt = findViewById(R.id.welcomeTxt);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String search = searchEdt.getText().toString();
                String response = String.format("[%s]을 검색합니다.",search);


                Toast.makeText(MainActivity.this,response, Toast.LENGTH_SHORT).show();

            }
        });

        String loginUserId = getIntent().getStringExtra("사용자아이디");
        Log.d("로그인사용자", loginUserId);
        String welcomeMessage = String.format("%s님 환영합니다!", loginUserId);
        welcomeTxt.setText(welcomeMessage);

    }
}
