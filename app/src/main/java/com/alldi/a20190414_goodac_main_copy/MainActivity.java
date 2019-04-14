package com.alldi.a20190414_goodac_main_copy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText searchEdt;
    Button searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchEdt = findViewById(R.id.searchEdt);
        searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String search = searchEdt.getText().toString();
                String response = String.format("[%s]을 검색합니다.",search);


                Toast.makeText(MainActivity.this,response, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
