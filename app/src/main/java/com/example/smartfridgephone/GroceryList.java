package com.example.smartfridgephone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

import androidx.appcompat.app.AppCompatActivity;


public class GroceryList extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_list);


    //hard-coded for now for demo purposes
        setButton1();
        setButton2();
        setButton3();
        setButton4();
        setButton5();
        setButton6();


    }

    public void setButton1(){
        Button rem = (Button) findViewById(R.id.groceryButton1);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow1);
                                row.setVisibility(View.GONE);
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
    public void setButton2(){
        Button rem = (Button) findViewById(R.id.groceryButton2);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow2);
                                row.setVisibility(View.GONE);
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

    public void setButton3(){
        Button rem = (Button) findViewById(R.id.groceryButton3);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow3);
                                row.setVisibility(View.GONE);
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

    public void setButton4(){
        Button rem = (Button) findViewById(R.id.groceryButton4);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow4);
                                row.setVisibility(View.GONE);
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

    public void setButton5(){
        Button rem = (Button) findViewById(R.id.groceryButton5);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow5);
                                row.setVisibility(View.GONE);
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

    public void setButton6(){
        Button rem = (Button) findViewById(R.id.groceryButton6);
        rem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Confirm Delete");
                builder.setMessage("Are you sure you want to remove this item from your shopping list?");
                builder.setPositiveButton("Confirm",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                View row = findViewById(R.id.groceryrow6);
                                row.setVisibility(View.GONE);
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
