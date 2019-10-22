package com.example.applicationassistant;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    String[] names = new String[100];
    EditText input;
    int i =0;
    int j =-1;

//    private static final String TAG="MyMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Help button start
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "This feature is coming soon !", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //help button end
        input = (EditText) findViewById(R.id.addnameinput);
        Button mybutton = (Button) findViewById(R.id.addnamebutton);
        Button nextbutton = (Button) findViewById(R.id.next);
        Button resetbutton = (Button) findViewById(R.id.reset);

        mybutton.setOnClickListener(
                //creating a interface
                new Button.OnClickListener(){
                    public void onClick(View v){
                        names[i] = input.getText().toString();
                        TextView tv=(TextView)findViewById(R.id.editText0);
                        names[i]+="\n";
                        tv.append(names[i]);
                        tv.append(System.getProperty("line.separator"));
                        i++;

                    }

                }


        );
        nextbutton.setOnClickListener(
                //creating a interface
                new Button.OnClickListener(){
                    public void onClick(View v2){
                        j=j+1;
                        TextView mytext = (TextView) findViewById(R.id.change);
                        mytext.setText(names[j]);
                    }

                }


        );
        resetbutton.setOnClickListener(
                //creating a interface
                new Button.OnClickListener(){
                    public void onClick(View v2){
                        j=0;
                        TextView mytext = (TextView) findViewById(R.id.change);
                        mytext.setText(names[j]);

                    }

                }


        );


    }

}