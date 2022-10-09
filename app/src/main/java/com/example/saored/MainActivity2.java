package com.example.saored;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button;
    EditText B1, B2, B3, B4, B5, B6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        B1 = findViewById(R.id.bangone);
        B2 = findViewById(R.id.bangtwo);
        B3 = findViewById(R.id.bangthree);
        B4 = findViewById(R.id.bangfour);
        B5 = findViewById(R.id.bangfive);
        B6 = findViewById(R.id.bangsix);
        button = findViewById(R.id.button);

        button.setOnClickListener(view -> {
            Intent intent1 = new Intent();
            String text1 = B1.getText().toString();
            String text2 = B2.getText().toString();
            String text3 = B3.getText().toString();
            String text4 = B4.getText().toString();
            String text5 = B5.getText().toString();
            String text6 = B6.getText().toString();
            intent1.putExtra("t1", text1);
            intent1.putExtra("t2", text2);
            intent1.putExtra("t3", text3);
            intent1.putExtra("t4", text4);
            intent1.putExtra("t5", text5);
            intent1.putExtra("t6", text6);
            setResult(1, intent1);
            finish();
        });
    }
}

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        String result1 = data.getStringExtra("bg1");
//        B1.setText(result1);
//        String result2 = data.getStringExtra("bg2");
//        B2.setText(result2);
//        String result3 = data.getStringExtra("bg3");
//        B3.setText(result3);
//        String result4 = data.getStringExtra("bg4");
//        B4.setText(result4);
//        String result5 = data.getStringExtra("bg5");
//        B5.setText(result5);
//        String result6 = data.getStringExtra("bg6");
//        B6.setText(result6);
//    }
//}