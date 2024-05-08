package com.example.final_project.items;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_project.R;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView1, textView2, textView3, textView4;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView1 = itemView.findViewById(R.id.textView3);
        textView2 = itemView.findViewById(R.id.textView5);
        textView3 = itemView.findViewById(R.id.textView4);
        textView4 = itemView.findViewById(R.id.textView6);
    }
}
