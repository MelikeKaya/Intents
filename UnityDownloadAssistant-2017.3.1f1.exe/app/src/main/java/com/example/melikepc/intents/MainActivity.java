package com.example.melikepc.intents;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnActivityShare,btnActivitySMS,btnActivityMail,btnActivityLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnActivityShare=(Button) findViewById(R.id.btn_ActivityShare);
        btnActivityShare.setOnClickListener(this);
        btnActivitySMS=(Button) findViewById(R.id.btn_ActivitySMS);
        btnActivitySMS.setOnClickListener(this);
        btnActivityMail=(Button) findViewById(R.id.btn_ActivityMail);
        btnActivityMail.setOnClickListener(this);
        btnActivityLink=(Button) findViewById(R.id.btn_ActivityLink);
        btnActivityLink.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_ActivityShare:{
                Intent intent=new Intent(MainActivity.this,ShareActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_ActivitySMS:{
                Intent intent=new Intent(MainActivity.this,SMSActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_ActivityMail:{
                Intent intent=new Intent(MainActivity.this,MailActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_ActivityLink:{
                Intent intent=new Intent(MainActivity.this,LinkActivity.class);
                startActivity(intent);
                break;
            }

        }


    }
}

