package com.example.mytest.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mytest.R;
import com.example.mytest.myselfview.MenuItemLayout;

import java.util.List;

/**
 * @author liuy
 */
public class RcyViewAdapter extends RecyclerView.Adapter<RcyViewAdapter.MyHolder> {

    private Context mContext;
    private List<String> list;

    public RcyViewAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rcy_item, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        String str = list.get(position);
        holder.itemLayout.setTitleText(str);
        holder.itemLayout.setHintText(str);
        holder.itemLayout.setDivideLine(1);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder{

        MenuItemLayout itemLayout;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            itemLayout = itemView.findViewById(R.id.menu_item);
        }
    }
}
