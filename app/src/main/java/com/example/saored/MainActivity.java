package com.example.saored;

import java.util.Arrays;
import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.SparseArray;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import java.io.IOException;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    Button btn_capture, btn_copy;
    TextView tv_data;
    private static final int REQUEST_CAMERA_CODE = 300;
    Bitmap bitmap;
    EditText b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80;
    Button btn;
    TextView kq1;
    String gb1, gb2, gtb1, gtb2;
    String[] stg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn_capture = findViewById(R.id.button_capture);
        btn_copy = findViewById(R.id.button_copy);
        tv_data = findViewById(R.id.text_data);

        kq1 = (TextView) findViewById(R.id.kq1);

        b1 = (EditText) findViewById(R.id.bang1);
        b2 = (EditText) findViewById(R.id.bang2);
        b3 = (EditText) findViewById(R.id.bang3);
        b4 = (EditText) findViewById(R.id.bang4);
        b5 = (EditText) findViewById(R.id.bang5);
        b6 = (EditText) findViewById(R.id.bang6);
        b7 = (EditText) findViewById(R.id.bang7);
        b8 = (EditText) findViewById(R.id.bang8);
        b9 = (EditText) findViewById(R.id.bang9);
        b10 = (EditText) findViewById(R.id.bang10);
        b11 = (EditText) findViewById(R.id.bang11);
        b12 = (EditText) findViewById(R.id.bang12);
        b13 = (EditText) findViewById(R.id.bang13);
        b14 = (EditText) findViewById(R.id.bang14);
        b15 = (EditText) findViewById(R.id.bang15);
        b16 = (EditText) findViewById(R.id.bang16);
        b17 = (EditText) findViewById(R.id.bang17);
        b18 = (EditText) findViewById(R.id.bang18);
        b19 = (EditText) findViewById(R.id.bang19);
        b20 = (EditText) findViewById(R.id.bang20);
        b21 = (EditText) findViewById(R.id.bang21);
        b22 = (EditText) findViewById(R.id.bang22);
        b23 = (EditText) findViewById(R.id.bang23);
        b24 = (EditText) findViewById(R.id.bang24);
        b25 = (EditText) findViewById(R.id.bang25);
        b26 = (EditText) findViewById(R.id.bang26);
        b27 = (EditText) findViewById(R.id.bang27);
        b28 = (EditText) findViewById(R.id.bang28);
        b29 = (EditText) findViewById(R.id.bang29);
        b30 = (EditText) findViewById(R.id.bang30);
        b31 = (EditText) findViewById(R.id.bang31);
        b32 = (EditText) findViewById(R.id.bang32);
        b33 = (EditText) findViewById(R.id.bang33);
        b34 = (EditText) findViewById(R.id.bang34);
        b35 = (EditText) findViewById(R.id.bang35);
        b36 = (EditText) findViewById(R.id.bang36);
        b37 = (EditText) findViewById(R.id.bang37);
        b38 = (EditText) findViewById(R.id.bang38);
        b39 = (EditText) findViewById(R.id.bang39);
        b40 = (EditText) findViewById(R.id.bang40);
        b41 = (EditText) findViewById(R.id.bang41);
        b42 = (EditText) findViewById(R.id.bang42);
        b43 = (EditText) findViewById(R.id.bang43);
        b44 = (EditText) findViewById(R.id.bang44);
        b45 = (EditText) findViewById(R.id.bang45);
        b46 = (EditText) findViewById(R.id.bang46);
        b47 = (EditText) findViewById(R.id.bang47);
        b48 = (EditText) findViewById(R.id.bang48);
        b49 = (EditText) findViewById(R.id.bang49);
        b50 = (EditText) findViewById(R.id.bang50);
        b51 = (EditText) findViewById(R.id.bang51);
        b52 = (EditText) findViewById(R.id.bang52);
        b53 = (EditText) findViewById(R.id.bang53);
        b54 = (EditText) findViewById(R.id.bang54);
        b55 = (EditText) findViewById(R.id.bang55);
        b56 = (EditText) findViewById(R.id.bang56);
        b57 = (EditText) findViewById(R.id.bang57);
        b58 = (EditText) findViewById(R.id.bang58);
        b59 = (EditText) findViewById(R.id.bang59);
        b60 = (EditText) findViewById(R.id.bang60);
        b61 = (EditText) findViewById(R.id.bang61);
        b62 = (EditText) findViewById(R.id.bang62);
        b63 = (EditText) findViewById(R.id.bang63);
        b64 = (EditText) findViewById(R.id.bang64);
        b65 = (EditText) findViewById(R.id.bang65);
        b66 = (EditText) findViewById(R.id.bang66);
        b67 = (EditText) findViewById(R.id.bang67);
        b68 = (EditText) findViewById(R.id.bang68);
        b69 = (EditText) findViewById(R.id.bang69);
        b70 = (EditText) findViewById(R.id.bang70);
        b71 = (EditText) findViewById(R.id.bang71);
        b72 = (EditText) findViewById(R.id.bang72);
        b73 = (EditText) findViewById(R.id.bang73);
        b74 = (EditText) findViewById(R.id.bang74);
        b75 = (EditText) findViewById(R.id.bang75);
        b76 = (EditText) findViewById(R.id.bang76);
        b77 = (EditText) findViewById(R.id.bang77);
        b78 = (EditText) findViewById(R.id.bang78);
        b79 = (EditText) findViewById(R.id.bang79);
        b80 = (EditText) findViewById(R.id.bang80);

        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, REQUEST_CAMERA_CODE);
        }
        btn_capture.setOnClickListener(view -> CropImage.activity().setGuidelines(CropImageView.Guidelines.ON).start(MainActivity.this));

        btn_copy.setOnClickListener(view -> {
            String scanned_text = tv_data.getText().toString();
            MainActivity.this.copyToClickBoard(scanned_text);
        });
//        btn.setOnClickListener(view -> {
//
//        });
    }


    StringBuilder stringBuilder = new StringBuilder();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String result1 = data.getStringExtra("t1");
        b1.setText(result1);
        String result2 = data.getStringExtra("t2");
        b2.setText(result2);
        String result3 = data.getStringExtra("t3");
        b3.setText(result3);
        String result4 = data.getStringExtra("t4");
        b4.setText(result4);
        String result5 = data.getStringExtra("t5");
        b5.setText(result5);
        String result6 = data.getStringExtra("t6");
        b6.setText(result6);
        //lấy hình ảnh từ máy ảnh
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                assert result != null;
                Uri resultUri = result.getUri();
                try {
                    bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), resultUri);
                    getTextFromImage(bitmap);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void getTextFromImage(Bitmap bitmap) {
        TextRecognizer recognizer = new TextRecognizer.Builder(this).build();
        if (!recognizer.isOperational()) {
            Toast.makeText(MainActivity.this, "Error Occurred!!!", Toast.LENGTH_SHORT).show();
        } else {
            Frame frame = new Frame.Builder().setBitmap(bitmap).build();
            SparseArray<TextBlock> textBlockSparseArray = recognizer.detect(frame);
            for (int i = 0; i < textBlockSparseArray.size(); i++) {
                TextBlock textBlock = textBlockSparseArray.valueAt(i);
                stringBuilder.append(textBlock.getValue());
            }
            String s = stringBuilder.toString();
            String luuketquadatach = "";
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '1' && chars[i + 1] == '0') {
                    luuketquadatach = luuketquadatach + "10 ";
                    i++;
                } else if (chars[i] != ' ') {
                    luuketquadatach = luuketquadatach + chars[i] + " ";
                }
            }
            stg = luuketquadatach.split(" ");

            for (int i = 0; i < stg.length; i++) {
                if (i == 0) {
                    b1.setText(stg[0]);
                } else if (i == 1) {
                    b2.setText(stg[1]);
                } else if (i == 2) {
                    b3.setText(stg[2]);
                } else if (i == 3) {
                    b4.setText(stg[3]);
                } else if (i == 4) {
                    b5.setText(stg[4]);
                } else if (i == 5) {
                    b6.setText(stg[5]);
                } else if (i == 6) {
                    b7.setText(stg[6]);
                } else if (i == 7) {
                    b8.setText(stg[7]);
                } else if (i == 8) {
                    b9.setText(stg[8]);
                } else if (i == 9) {
                    b10.setText(stg[9]);
                } else if (i == 10) {
                    b11.setText(stg[10]);
                } else if (i == 11) {
                    b12.setText(stg[11]);
                } else if (i == 12) {
                    b13.setText(stg[12]);
                } else if (i == 13) {
                    b14.setText(stg[13]);
                } else if (i == 14) {
                    b15.setText(stg[15]);
                } else if (i == 15) {
                    b16.setText(stg[15]);
                } else if (i == 16) {
                    b17.setText(stg[16]);
                } else if (i == 17) {
                    b18.setText(stg[17]);
                } else if (i == 18) {
                    b19.setText(stg[18]);
                } else if (i == 19) {
                    b20.setText(stg[19]);
                } else if (i == 20) {
                    b21.setText(stg[20]);
                } else if (i == 21) {
                    b22.setText(stg[21]);
                } else if (i == 22) {
                    b23.setText(stg[22]);
                } else if (i == 23) {
                    b24.setText(stg[23]);
                } else if (i == 24) {
                    b25.setText(stg[24]);
                } else if (i == 25) {
                    b26.setText(stg[25]);
                } else if (i == 26) {
                    b27.setText(stg[26]);
                } else if (i == 27) {
                    b28.setText(stg[27]);
                } else if (i == 28) {
                    b29.setText(stg[28]);
                } else if (i == 29) {
                    b30.setText(stg[29]);
                } else if (i == 30) {
                    b31.setText(stg[30]);
                } else if (i == 31) {
                    b32.setText(stg[31]);
                } else if (i == 32) {
                    b33.setText(stg[32]);
                } else if (i == 33) {
                    b34.setText(stg[33]);
                } else if (i == 34) {
                    b35.setText(stg[34]);
                } else if (i == 35) {
                    b36.setText(stg[35]);
                } else if (i == 36) {
                    b37.setText(stg[36]);
                } else if (i == 37) {
                    b38.setText(stg[37]);
                } else if (i == 38) {
                    b39.setText(stg[38]);
                } else if (i == 39) {
                    b40.setText(stg[39]);
                } else if (i == 40) {
                    b41.setText(stg[40]);
                } else if (i == 41) {
                    b42.setText(stg[41]);
                } else if (i == 42) {
                    b43.setText(stg[42]);
                } else if (i == 43) {
                    b44.setText(stg[43]);
                } else if (i == 44) {
                    b45.setText(stg[44]);
                } else if (i == 45) {
                    b46.setText(stg[45]);
                } else if (i == 46) {
                    b47.setText(stg[46]);
                } else if (i == 47) {
                    b48.setText(stg[47]);
                } else if (i == 48) {
                    b49.setText(stg[48]);
                } else if (i == 49) {
                    b50.setText(stg[49]);
                } else if (i == 50) {
                    b51.setText(stg[50]);
                } else if (i == 51) {
                    b52.setText(stg[51]);
                } else if (i == 52) {
                    b53.setText(stg[52]);
                } else if (i == 53) {
                    b54.setText(stg[53]);
                } else if (i == 54) {
                    b55.setText(stg[54]);
                } else if (i == 55) {
                    b56.setText(stg[55]);
                } else if (i == 56) {
                    b57.setText(stg[56]);
                } else if (i == 57) {
                    b58.setText(stg[57]);
                } else if (i == 58) {
                    b59.setText(stg[58]);
                } else if (i == 59) {
                    b60.setText(stg[59]);
                } else if (i == 60) {
                    b61.setText(stg[60]);
                } else if (i == 61) {
                    b62.setText(stg[61]);
                } else if (i == 62) {
                    b63.setText(stg[62]);
                } else if (i == 63) {
                    b64.setText(stg[63]);
                } else if (i == 64) {
                    b65.setText(stg[64]);
                } else if (i == 65) {
                    b66.setText(stg[65]);
                } else if (i == 66) {
                    b67.setText(stg[66]);
                } else if (i == 67) {
                    b68.setText(stg[67]);
                } else if (i == 68) {
                    b69.setText(stg[68]);
                } else if (i == 69) {
                    b70.setText(stg[69]);
                } else if (i == 70) {
                    b71.setText(stg[70]);
                } else if (i == 71) {
                    b72.setText(stg[71]);
                } else if (i == 72) {
                    b73.setText(stg[72]);
                } else if (i == 73) {
                    b74.setText(stg[73]);
                } else if (i == 74) {
                    b75.setText(stg[74]);
                } else if (i == 75) {
                    b76.setText(stg[75]);
                } else if (i == 76) {
                    b77.setText(stg[76]);
                } else if (i == 77) {
                    b78.setText(stg[77]);
                } else if (i == 78) {
                    b79.setText(stg[78]);
                } else if (i == 79) {
                    b80.setText(stg[79]);
                }
            }
            tv_data.setText(stringBuilder.toString());
            btn_capture.setText("Retake");
            btn_copy.setVisibility(View.VISIBLE);
        }
    }


    private void copyToClickBoard(String text) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("Copied data", text);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(MainActivity.this, "Copied to clipboard!", Toast.LENGTH_SHORT).show();
    }


    private void ketqua(View view){
        int bang1 = 0;
        int bang2 = 0;
        for(int i=0;i<stg.length;i++){
            if(i==0){
                gtb1 = stg[0];
                bang1 = Integer.parseInt(gtb1);
            }
            if(i==1){
                gtb2 = stg[1];
                bang2 = Integer.parseInt(gtb2);
            }
        }
        int kq = bang1 + bang2;
        kq1.setText(kq);
    }
}
//    public void btnNext(View view) {
//        Intent intent1 = new Intent(MainActivity.this, MainActivity2.class);
////        String bg1 = b1.getText().toString();
////        String bg2 = b2.getText().toString();
////        String bg3 = b3.getText().toString();
////        String bg4 = b4.getText().toString();
////        String bg5 = b5.getText().toString();
////        String bg6 = b6.getText().toString();
////        intent1.putExtra("bg1", bg1);
////        intent1.putExtra("bg2", bg2);
////        intent1.putExtra("bg3", bg3);
////        intent1.putExtra("bg4", bg4);
////        intent1.putExtra("bg5", bg5);
////        intent1.putExtra("bg6", bg6);
//        setResult(2, intent1);
//        startActivityForResult(intent1, 1);
//
//    }
//}