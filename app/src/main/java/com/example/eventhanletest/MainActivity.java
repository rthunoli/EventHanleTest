package com.example.eventhanletest;

/*
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
*/

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//public class MainActivity extends Activity implements OnClickListener {
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        Button listenerBtn = (Button) findViewById(R.id.buttonMain);
        listenerBtn.setOnClickListener(this);

        Button nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonMain:
                text.setText("Listener implementation in the Activity!");
                Toast.makeText(this, "Implements onClickListener", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nextBtn:
                try{
                    Intent intent = new Intent(this, ListenerActivity.class);
                    startActivity(intent);
                }catch(Exception ex) {
                    ex.printStackTrace();
                }
                break;

            default:
                break;
        }
    }

}