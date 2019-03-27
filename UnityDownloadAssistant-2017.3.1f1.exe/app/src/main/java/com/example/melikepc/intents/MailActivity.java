package com.example.melikepc.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MailActivity extends AppCompatActivity {

    EditText etMailTo,etSubject,etMailMessage;
    Button btnMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        etMailTo=(EditText) findViewById(R.id.et_MailTo);
        etSubject=(EditText) findViewById(R.id.et_Subject);
        etMailMessage=(EditText) findViewById(R.id.et_MailMassage);
        btnMail=(Button) findViewById(R.id.btn_Mail);
        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mailTo=etMailTo.getText().toString();
                String subject=etSubject.getText().toString();
                String mailMassege=etMailMessage.getText().toString();
                methodSendMail(mailTo,subject,mailMassege);
            }
        });
    }

    private void methodSendMail(String mailTo, String subject, String mailMassege) {
        Intent mailIntent=new Intent(Intent.ACTION_SEND);
        mailIntent.setType("message/rfc822");
        mailIntent.putExtra(Intent.EXTRA_EMAIL,new String[]{mailTo});
        mailIntent.putExtra(Intent.EXTRA_SUBJECT,subject);
        mailIntent.putExtra(Intent.EXTRA_TEXT,mailMassege);
        startActivity(mailIntent);
    }
}
