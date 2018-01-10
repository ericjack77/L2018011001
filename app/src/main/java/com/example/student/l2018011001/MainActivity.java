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
        MyThread myThread=new MyThread();
        myThread.start();


    }

    public class MyThread extends Thread
    {
        @Override
        public void run() {
            super.run();
            while (true)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(String.valueOf(Integer.valueOf(tv.getText().toString())+1));
                    }
                });
            }
        }

    }
}
