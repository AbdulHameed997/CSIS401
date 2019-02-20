package com.csis401.lab1a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickBtn(View v ) {
        //Text view
        TextView tc = findViewById(R.id.textView);
        //Empty output to call the text in
        String output = "";
        //Declare the checkbox
        CheckBox ch1 = findViewById(R.id.checkBox);
        CheckBox ch2 = findViewById(R.id.checkbox3);
        //Declare the radio group
        RadioGroup radio = findViewById(R.id.radioGroup);
        //Call the is checked for the check box
        if (ch1.isChecked()) {
            output +=   ch1.getText().toString() + " ";
        }
        if (ch2.isChecked()) {
            output += " " + ch2.getText().toString() + " ";
        }
        //Call the radio group, so it's always checked.
        int selectedId = radio.getCheckedRadioButtonId();
        //Call the radio buttons men el group
        RadioButton x = findViewById(selectedId);
        //Get the output from the radio buttons
        output += x.getText().toString();
        //Print the Toaster
        tc.setText(output +   " Pizza");
    }
}
