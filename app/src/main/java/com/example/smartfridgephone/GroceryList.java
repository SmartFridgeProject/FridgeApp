package com.example.smartfridgephone;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import java.util.ArrayList;


import androidx.appcompat.app.AppCompatActivity;

public class GroceryList extends AppCompatActivity {
    ArrayList<String> groceries = new ArrayList<String>();

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_list);

        //hard-coded demo list
        setDemoList();

        setHomeButton();

        //hard-coded for now for demo purposes
        setButton1();
        setButton2();
        setButton3();
        setButton4();
        setButton5();
        setButton6();
        setAddGroceriesButton();

    }
    public void setDemoList(){
        groceries.add("butter");
        groceries.add("White Claw");
        groceries.add("Milk");
        groceries.add("lettuce");
        groceries.add("grapes");
        groceries.add("carrot");
    }

    public void setAddGroceriesButton(){
        Button addButton = (Button) findViewById(R.id.AddGroceriesButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), GroceryListAdd.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

    public void setHomeButton(){
        Button addButton = (Button) findViewById(R.id.AddGroceriesHomeButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FullscreenActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });
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
                                groceries.remove("butter");
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
                                groceries.remove("White Claw");
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
                                groceries.remove("Milk");
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
                                groceries.remove("lettuce");
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
                                groceries.remove("grapes");
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
                                groceries.remove("carrot");
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
