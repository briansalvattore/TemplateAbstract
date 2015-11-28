package com.horsesdeveloper.templatesabstract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SecondActivity extends AppCompatActivity {

    @Bind(R.id.description)
    protected TextView description;

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ButterKnife.bind(this);

        description.setTextColor(getResources().getColor(R.color.primary_text));
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.before)
    protected void onClickBefore(){

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
