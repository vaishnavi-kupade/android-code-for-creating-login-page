package com.example.login_pg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity  {
    Button b1,b2;
    EditText ed1,ed2;
    TextView tx1;
    int counter = 3;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.btn_login);
        ed1 = (EditText)findViewById(R.id.EmailAddress);
        ed2 = (EditText)findViewById(R.id.Password);
        b2 = (Button)findViewById(R.id.btn_cancel);
        tx1 = (TextView)findViewById(R.id.textView);
        tx1.setVisibility(View.VISIBLE);
        b1.setOnClickListener(v -> {
            if(ed1.getText().toString().equals("admin@gmail.com") &&
                    ed2.getText().toString().equals("admin@123")) {
                Toast.makeText(getApplicationContext(),
                        "Redirecting...",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
                //tx1.setVisibility(View.VISIBLE);
                //tx1.setBackgroundColor(Color.RED);
                //counter--;
                //tx1.setText(Integer.toString(counter));
                if (counter == 0) {
                    b1.setEnabled(false);
                }
            }
        });
        b2.setOnClickListener(v -> finish());
    }
}