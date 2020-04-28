package com.example.smartfridgephone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class InventoryView  extends AppCompatActivity {

    /** Called when the activity is first created. */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_view);

        setAddRemove();
        setWhiteClaw();
        setPepper();
        setMilk();
        setCheese();
        setEggs();
    }

    void setWhiteClaw(){

        Button submit = (Button) findViewById(R.id.invnotifx1);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Edit inventory has not yet been implemented");
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

    void setPepper(){
        Button submit = (Button) findViewById(R.id.invnotifx2);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Edit inventory has not yet been implemented");
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

    void setMilk(){
        Button submit = (Button) findViewById(R.id.invnotifx3);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Edit inventory has not yet been implemented");
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
    void setCheese() {
        Button submit = (Button) findViewById(R.id.invnotifx4);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Edit inventory has not yet been implemented");
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

    void setEggs(){

        Button submit = (Button) findViewById(R.id.invnotifx5);

        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Edit inventory has not yet been implemented");
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

    void setAddRemove(){

            Button submit = (Button) findViewById(R.id.addInvent);

            submit.setOnClickListener(new View.OnClickListener() {

                public void onClick(final View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                    builder.setCancelable(true);
                    builder.setTitle("Not yet implemented");
                    builder.setMessage("Add item to inventory has not yet been implemented");
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
