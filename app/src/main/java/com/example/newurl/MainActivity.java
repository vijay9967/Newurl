package com.example.newurl;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void broadcastIntent(View view){
        EditText e1=(EditText)findViewById(R.id.editText);
        Intent i = new Intent();
        i.setAction("com.admin.broadcast.CUSTOM_INTENT");
        sendBroadcast(i);
        String s = String.valueOf(e1.getText());

    }
}
