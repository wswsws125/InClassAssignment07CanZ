package com.example.wswsw.inclassassignment07_canz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setTitle("Pokemon Info");

        //find the submit_button and set the onclick listener
        Button submitButton = (Button) findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //get message from 3 EditText views and 1 CheckBox
                EditText name = (EditText) findViewById(R.id.input_name_view);
                String name1 = name.getText().toString();

                EditText type = (EditText) findViewById(R.id.input_type_view);
                String type1 = type.getText().toString();

                EditText cp = (EditText) findViewById(R.id.input_cp_view);
                int cp1 = Integer.parseInt(cp.getText().toString());

                CheckBox shiny = (CheckBox) findViewById(R.id.is_shiny);
                boolean shiny1 = shiny.isChecked();

                //create a Pokemon subject based on the info
                Pokemon p = new Pokemon(name1,type1, cp1,shiny1);

                //start a new return intent names data to send data back
                Intent data = new Intent();
                //put the Pokemon object p into 'data'
                data.putExtra(Keys.POKEMON, p);
                setResult(RESULT_OK, data);
                finish();



            }
        });






    }


}
