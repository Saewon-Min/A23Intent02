package com.kosmo.a23intent02;

import android.app.AppComponentFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OnlyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_only);

        //  부가데이터로 전달된 값을 받아서 변수에 저장
        String user = getIntent().getStringExtra("USER");
        String pass = getIntent().getStringExtra("PASS");

        // 텍스트뷰에 값 출력
        ((TextView)findViewById(R.id.textview_only)).setText(
                String.format("아이디:%s , 패스워드:%s",user,pass)
        );

        // 해당 액티비티의 실행 종료
        ((Button)findViewById(R.id.btn_finish)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );

    }


}
