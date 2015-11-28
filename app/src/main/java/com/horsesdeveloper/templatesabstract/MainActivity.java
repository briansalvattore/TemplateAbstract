package com.horsesdeveloper.templatesabstract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.description)
    protected TextView description;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        description.setTextColor(getResources().getColor(R.color.primary_text));
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.next)
    protected void onClickNext(){

        startActivity(new Intent(this, SecondActivity.class));
        finish();
    }

}
