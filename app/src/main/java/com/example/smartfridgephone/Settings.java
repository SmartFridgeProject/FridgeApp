package com.example.smartfridgephone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Settings extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        setPass();
        setNotifs();
        setManage();
        setPayment();
        setWireless();
        setOtherServices();

    }

    void setPass(){
        Button submit = (Button) findViewById(R.id.passcode);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Change Passcode has not yet been implemented");
                builder.setPositiveButton("Back",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }

    void setNotifs(){
        Button submit = (Button) findViewById(R.id.buttonNotifC);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Configure Notificatons has not yet been implemented");
                builder.setPositiveButton("Back",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }

    void setManage(){
        Button submit = (Button) findViewById(R.id.buttonManage);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Manage Profile has not yet been implemented");
                builder.setPositiveButton("Back",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }

    void setWireless(){
        Button submit = (Button) findViewById(R.id.buttonWireless);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Manage wireless network has not yet been implemented");
                builder.setPositiveButton("Back",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }

    void setPayment(){
        Button submit = (Button) findViewById(R.id.payment);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("payment methods has not yet been implemented");
                builder.setPositiveButton("Back",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }

    void setOtherServices(){
        Button submit = (Button) findViewById(R.id.otherServices);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Other services have not yet been implemented");
                builder.setPositiveButton("Back to List",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });
    }



}
