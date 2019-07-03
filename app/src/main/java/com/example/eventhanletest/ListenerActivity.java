package com.example.eventhanletest;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//public class ListenerActivity extends Activity {
public class ListenerActivity extends AppCompatActivity {
    private TextView text;
    private Button button1, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listener_view);

        text = (TextView) findViewById(R.id.text2);

        // anonymous inner Listener Class
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                text.setText("Inner Listener Class Way!");
                Toast.makeText(getApplicationContext(), "Into the ListenerActivity Class",
                        Toast.LENGTH_SHORT).show();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new ListenerImplement(this));

    }

    public void clickButton2(View view) {
        text.setText("onClick - XML Way!");
        Toast.makeText(getApplicationContext(), "Function that was declared in XML",
                Toast.LENGTH_SHORT).show();
    }

    public void setTheText(String myText) {
        text.setText(myText);
        Toast.makeText(getApplicationContext(), "Calls ListenerImplement Class",
                Toast.LENGTH_SHORT).show();
    }

}