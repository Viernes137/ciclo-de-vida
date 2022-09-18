package com.example.ciclo_de_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView carlos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        carlos = findViewById(R.id.textView2);
        carlos.setText("onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
        carlos.append("\nonStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
        carlos.append("\nonResume");
    }
    @Override
    protected void onPause() {
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
        carlos.append("\nonPause");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
        carlos.append("\nonStop");
        super.onStop();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_SHORT).show();
        carlos.append("\nonRestart");
    }
    @Override
    protected void onDestroy() {
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
        carlos.append("\nonDestroy");
        super.onDestroy();
    }

}