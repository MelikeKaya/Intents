package com.example.melikepc.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class LinkActivity extends AppCompatActivity {

    TextView tvLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);
        tvLink=(TextView) findViewById(R.id.tv_Link);
        tvLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodLink();
            }
        });
    }
    private void methodLink() {
        Intent intentLink=new Intent(Intent.ACTION_VIEW);
        intentLink.setData(Uri.parse("http://www.karabuk.edu.tr"));
        startActivity(intentLink);
    }
}
