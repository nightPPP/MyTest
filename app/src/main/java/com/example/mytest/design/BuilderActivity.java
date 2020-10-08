package com.example.mytest.design;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;
import com.example.mytest.design.builder.Room;
import com.example.mytest.design.builder.WorkBuilder;
import com.example.mytest.design.clone.AbsOrder;
import com.example.mytest.design.clone.EnterpriseOrder;
import com.example.mytest.design.clone.OrderService;

import java.util.List;

public class BuilderActivity extends AppCompatActivity {

    public final String TAG = BuilderActivity.class.getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
//        Room room = new WorkBuilder()
//                .makeWindow("窗户")
//                .makeFloor("地板")
//                .makeLamp("吊顶")
//                .build();
//        Log.d(TAG, room.toString());

        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderName("电脑");
        enterpriseOrder.setOrderCompany("haocai");
        enterpriseOrder.setOrderNumber(266);

        List<AbsOrder> order = null;
        try {
            order = OrderService.getOrder(enterpriseOrder);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (AbsOrder absOrder : order) {
            Log.d(TAG, absOrder.toString());
        }

    }
}
