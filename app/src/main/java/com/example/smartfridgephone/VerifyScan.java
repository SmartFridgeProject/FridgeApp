package com.example.smartfridgephone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;

public class VerifyScan  extends AppCompatActivity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_scan);

        setRescan();
        setConfirm();

    }

    public void setRescan() {
        Button addButton = (Button) findViewById(R.id.rescan);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Scan.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
    public void setConfirm() {
        Button addButton = (Button) findViewById(R.id.confirmScan);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FullscreenActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}