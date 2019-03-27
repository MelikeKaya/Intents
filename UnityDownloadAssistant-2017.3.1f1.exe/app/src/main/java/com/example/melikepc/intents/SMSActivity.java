package com.example.melikepc.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SMSActivity extends AppCompatActivity {

    Button btnSMS;
    EditText etMessage,etPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);
        etMessage=(EditText) findViewById(R.id.et_Message);
        etPhoneNumber=(EditText) findViewById(R.id.et_PhoneNumber);
        btnSMS=(Button) findViewById(R.id.btn_SMS);
        btnSMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj=etMessage.getText().toString();
                String phoneNumber=etPhoneNumber.getText().toString();
                methodSMS(mesaj,phoneNumber);
            }
        });
    }

    private void methodSMS(String mesaj, String phoneNumber) {
        Intent intentSMS=new Intent(Intent.ACTION_SENDTO);
        intentSMS.setData(Uri.parse("smsto:"+phoneNumber));
        intentSMS.putExtra("sms_body",mesaj);
        startActivity(intentSMS);
    }
}
