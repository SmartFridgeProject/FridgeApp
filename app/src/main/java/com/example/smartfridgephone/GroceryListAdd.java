package com.example.smartfridgephone;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GroceryListAdd extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grocery_list_add);
        setSubmitButton();

    }

    public void setSubmitButton(){
        Button submit = (Button) findViewById(R.id.grocerySubmitButton);
        submit.setOnClickListener(new View.OnClickListener() {

            public void onClick(final View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setCancelable(true);
                builder.setTitle("Not yet implemented");
                builder.setMessage("Add item to grocery list has not yet been implemented");
                builder.setPositiveButton("Back to List",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent myIntent = new Intent(view.getContext(), GroceryList.class);
                                startActivityForResult(myIntent, 0);
                            }
                        });
                builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent myIntent = new Intent(view.getContext(), Settings.class);
                        startActivityForResult(myIntent, 0);
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }

        });

    }
}
