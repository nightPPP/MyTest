package com.example.mytest;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 *
 * @author liuy
 */
public class TestService extends AppCompatActivity {
    MyConn conn;
    MyService.CallListern c;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_service);
        findViewById(R.id.btn_bind).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conn = new MyConn();
                Intent intent = new Intent(TestService.this, MyService.class);
                bindService(intent, conn, BIND_AUTO_CREATE);
            }
        });
        findViewById(R.id.btn_unbind).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unbindService(conn);
            }
        });
        findViewById(R.id.btn_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != c){
                    c.callMethodService();
                }
            }
        });
    }

    private class MyConn implements ServiceConnection{

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            System.out.println("调用服务里面的方法");
            c = (MyService.CallListern) service;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {

        }
    }
}
