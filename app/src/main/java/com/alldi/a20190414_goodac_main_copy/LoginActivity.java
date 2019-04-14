package com.alldi.a20190414_goodac_main_copy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText userIdEdt;
    EditText userPwEdt;
    Button loginBtn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        userIdEdt = findViewById(R.id.userIdEdt);
        userPwEdt = findViewById(R.id.userPwEdt);
        loginBtn = findViewById(R.id.loginBtn);
        
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
//                사용자가 입력한 아이디와 비번을 String 변수에 저장.
                String userId = userIdEdt.getText().toString();
                String userPw = userPwEdt.getText().toString();
                
                if (userId.equals("tjeit") && userPw.equals("qwer1234")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                }else {
                    Toast.makeText(LoginActivity.this, "로그인에 실패했습니다.\nID / PW를 확인해주세요.", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
