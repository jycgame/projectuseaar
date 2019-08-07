package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myaar.BlueToothServer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button startButton;
    Button stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.button);
        startButton.setOnClickListener(this);
        startButton.setText("start");

        stopButton = (Button)findViewById(R.id.button2);
        stopButton.setOnClickListener(this);
        stopButton.setText("stop");

        BlueToothServer.setContext(this);
    }

    @Override
    public void onClick(View view) {
        if (view == startButton) {
            BlueToothServer.startServer();
        }
        else if (view == stopButton) {
            BlueToothServer.stopServer();
        }
    }
}
