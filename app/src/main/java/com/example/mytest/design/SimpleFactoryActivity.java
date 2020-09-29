package com.example.mytest.design;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;
import com.example.mytest.design.simplefactory.InterSimpleView;
import com.example.mytest.design.simplefactory.SimpleFactory;

/**
 * 简单工厂测试效果
 * @author liuy
 */
public class SimpleFactoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_fac);

        InterSimpleView facType = SimpleFactory.getFacType(0);
        facType.getType();
        facType.setInterType(1);

        findViewById(R.id.tv_simple_fac).setOnClickListener(v -> {
            ((TextView) findViewById(R.id.tv_simple_fac_show)).setText(String.valueOf(facType.getType()));
        });
    }
}
