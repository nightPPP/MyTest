package com.example.mytest.recycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytest.R;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuy
 */
public class RcyViewActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcyview);

        list.add("11");
        list.add("22");
        list.add("33");
        list.add("44");

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);

        RcyViewAdapter adapter = new RcyViewAdapter(this, list);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
