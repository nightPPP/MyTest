package com.example.mytest.netChangeListener;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytest.R;

public class NetTestActivity extends AppCompatActivity implements NetStateChangeObserver{

    private TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_net_test);

        NetStateChangeReceiver.registerReceiver(this);
        tv = (TextView) findViewById(R.id.tv_test_no);

    }
    @Override
    protected void onResume() {
        super.onResume( );
        NetStateChangeReceiver.registerObserver(this);
    }

    @Override
    protected void onPause() {
        super.onPause( );
        NetStateChangeReceiver.unRegisterObserver(this);
    }
    @Override
    protected void onDestroy() {
        NetStateChangeReceiver.unRegisterReceiver(this);
        super.onDestroy();
    }

    @Override
    public void onNetDisconnected() {
        tv.setText("断开链接");
    }

    @Override
    public void onNetConnected(NetworkType networkType) {
        tv.setText("连接上了"+networkType.toString());
    }
}
