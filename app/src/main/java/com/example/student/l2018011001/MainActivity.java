package com.example.student.l2018011001;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    SeekBar sb;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.textView);
        sb=findViewById(R.id.seekBar);
        handler=new Handler();
        handler.post(r);
    }

    Runnable r=new Runnable() {
        @Override
        public void run() {
            tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
            handler.postDelayed(r,1000);
        }
    };


}
