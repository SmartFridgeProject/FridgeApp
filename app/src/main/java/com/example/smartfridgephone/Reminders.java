package com.example.smartfridgephone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Reminders extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reminders);

        setReminder1();
        setReminder2();
        setReminder3();
        setReminder4();
        setAddRem();

    }

    void setReminder1(){
        Button submit = (Button) findViewById(R.id.notifx1);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("view recipes has not yet been implemented");
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

    void setReminder2(){
        Button submit = (Button) findViewById(R.id.notifx2);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("view recipes has not yet been implemented");
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

    void setReminder3(){
        Button submit = (Button) findViewById(R.id.notifx3);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("view recipes has not yet been implemented");
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

    void setReminder4(){
        Button submit = (Button) findViewById(R.id.notifx4);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("view recipes has not yet been implemented");
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

    void setAddRem(){
        Button submit = (Button) findViewById(R.id.addRemind);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("add reminders has not yet been implemented");
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
