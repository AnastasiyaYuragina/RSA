package com.rem.RSA;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyActivity extends Activity {

    Button decriptButton;
    Button encriptButton;
    EditText enterText;
    EditText encryptDecriptText;
    EditText key;

    /**
     * Called when the activity is first created.
     */
    //add comment

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        decriptButton = (Button) findViewById(R.id.decriptButton);
        encriptButton = (Button) findViewById(R.id.encryptButton);
        enterText = (EditText) findViewById(R.id.editText);
        encryptDecriptText = (EditText) findViewById(R.id.decriptText);
        key = (EditText) findViewById(R.id.Key);

        decriptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deciphertText();
            }
        });

        encriptButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                encryptText();
            }
        });
    }

    public void encryptText(){
        String stringKey = key.getText().toString();
        if (stringKey.length() > 0){
            Encryption encription = new Encryption(stringKey);
            String text = enterText.getText().toString();
            String messageEncrypted = encription.encryptMessage(text);
            encryptDecriptText.setText(messageEncrypted);
        } else
        {
            Context context = getApplicationContext();
            CharSequence text = "Add key";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void deciphertText(){
        String stringKey = key.getText().toString();
        if (stringKey.length() > 0){
            Encryption encription = new Encryption(stringKey);
            String text = enterText.getText().toString();
            String messageDecipher = encription.decipherMessage(text);
            encryptDecriptText.setText(messageDecipher);
        } else
        {
            Context context = getApplicationContext();
            CharSequence text = "Add key";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
}
