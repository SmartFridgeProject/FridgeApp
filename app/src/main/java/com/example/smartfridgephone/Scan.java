package com.example.smartfridgephone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;


public class Scan extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan);

        Button sc = (Button) findViewById(R.id.ScanButton);
        sc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);
                setResult(RESULT_OK, intent);
            }

        });

    }
}
