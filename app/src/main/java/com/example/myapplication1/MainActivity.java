package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button buttonOne;

    @BindView(R.id.img)
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void buttonOneClicked() {
        Toast toast = Toast.makeText(getApplicationContext(), "Hello world.", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0b0, 0);
        toast.show();
        image1.setImageResource(R.drawable.kk);
    }

}
