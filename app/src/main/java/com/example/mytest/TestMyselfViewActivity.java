package com.example.mytest;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 *
 * @author liuy
 */
public class TestMyselfViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_self_view);
        MenuItemLayout view = (MenuItemLayout) findViewById(R.id.menu_1);
        view.setTitleText("666");
        view.setViewOnlickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
