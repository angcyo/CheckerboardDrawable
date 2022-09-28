package top.defaults.checkerboarddrawable.view;

import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import top.defaults.checkerboarddrawable.CheckerboardDrawable;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_main);
        CheckerboardDrawable drawable = new CheckerboardDrawable.Builder()
                .colorOdd(Color.LTGRAY)
                .colorEven(Color.DKGRAY)
                .size(20)
                .build();
        findViewById(android.R.id.content).setBackgroundDrawable(drawable);*/
    }
}
