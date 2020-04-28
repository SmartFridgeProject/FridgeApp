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
        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){

                //add not implemented, show dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("Not implemented");
                builder.setMessage("Add Item is not fully implemented");
                builder.setPositiveButton("Back to Grocery List", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        setContentView(R.layout.grocery_list);
                    }
                });


                AlertDialog dialog = builder.create();
                dialog.show();
                //setContentView(R.layout.grocery_list);
            }
        });
    }
}
