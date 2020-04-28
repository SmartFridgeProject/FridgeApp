package com.example.smartfridgephone;

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
                TableLayout tl = (TableLayout) findViewById(R.id.gListTable);
                TableRow tr = new TableRow(view.getContext());
                tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));
                TextView text1 = new TextView(view.getContext());
                EditText quant = (EditText)findViewById(R.id.ItemQuantityGList);
                text1.setText(quant.getText().toString());
                text1.setGravity(1);
                text1.setLayoutParams(new TableRow.LayoutParams(1));

                TextView text2 = new TextView(view.getContext());
                EditText item = (EditText)findViewById(R.id.ItemNameGList);
                text2.setText(item.getText().toString());
                text2.setGravity(1);
                text2.setLayoutParams(new TableRow.LayoutParams(2));

                Button b = new Button(view.getContext());
                b.setText("Remove");
                b.setGravity(1);
                b.setLayoutParams(new TableRow.LayoutParams(3));

                tr.addView(text1);
                tr.addView(text2);
                tr.addView(b);
                tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));
                System.out.println("HERE");
                setContentView(R.layout.grocery_list);
            }
        });
    }
}
