package com.example.melikepc.intents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShareActivity extends AppCompatActivity {

    EditText etShare;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        etShare=(EditText) findViewById(R.id.et_Share);
        btnShare=(Button) findViewById(R.id.btn_Share);
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=etShare.getText().toString();
                methodShare(text);
            }
        });
    }

    private void methodShare(String text) {
        Intent shareIntent=new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT,text);
        startActivity(Intent.createChooser(shareIntent,"Paylaşacağınız Platformu Seçiniz"));
    }
}
