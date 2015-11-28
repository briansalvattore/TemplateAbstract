package com.horsesdeveloper.templatesabstract;

import android.content.Intent;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.OnClick;

public class SecondActivity extends BaseActivity {

    @Bind(R.id.description)
    protected TextView description;

    @Override
    protected void onCreate() {

        description.setTextColor(getResources().getColor(R.color.primary_text));
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_second;
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.before)
    protected void onClickBefore(){

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}
