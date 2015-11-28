package com.horsesdeveloper.templatesabstract;

import android.content.Intent;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Bind(R.id.description)
    protected TextView description;

    @Override
    protected void onCreate() {

        description.setTextColor(getResources().getColor(R.color.primary_text));
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.next)
    protected void onClickNext(){

        startActivity(new Intent(this, SecondActivity.class));
        finish();
    }

}
