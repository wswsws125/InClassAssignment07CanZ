package com.example.wswsw.inclassassignment07_canz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Pokemon Info");

        //find the add_info_button and set the onclick listener
        Button launchActivity = (Button) findViewById(R.id.add_info_button);

        launchActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //start a new intent
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                //start the second activity for result
                startActivityForResult(intent, RequestCodes.ADD_POKEMON);


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode ==  RequestCodes.ADD_POKEMON && resultCode == RESULT_OK) {
            Pokemon p = (Pokemon) data.getSerializableExtra(Keys.POKEMON);
            //find the info_display_view by id
            TextView displayText = (TextView) findViewById(R.id.info_display_view);
            displayText.setText(p.toString());
        }
    }



}
