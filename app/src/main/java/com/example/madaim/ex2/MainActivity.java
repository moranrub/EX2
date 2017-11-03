package com.example.madaim.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    final String MY_TAG = "EX2.MainActivity";
    private int cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        Log.i(MY_TAG, "on Create event");
        Toast.makeText(this, "WELCOME!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MY_TAG, "on Stop event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG, "on Pause event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG, "on Resume event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG, "on Start event");
    }

    public void buttonClicked(View v1)
    {
        EditText edName = (EditText)findViewById(R.id.et_name);
        if(edName.getText().length() == 0)
        {
            Toast.makeText(this, "", Toast.LENGTH_LONG).show();
        }
        else {
            this.cnt++;
            Toast.makeText(this, edName.getText()+" you clicked the button " + cnt + " times", Toast.LENGTH_LONG).show();
        }
    }
}
