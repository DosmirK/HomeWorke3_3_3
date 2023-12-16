package com.example.homeworke3_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimeViewHolder extends RecyclerView.ViewHolder {
    private TextView tvAnimeName;
    public AnimeViewHolder(@NonNull View itemView) {
        super(itemView);

        initView();
    }

    private void initView() {
        tvAnimeName = itemView.findViewById(R.id.tv_anime_name);
    }

    public void onBind(String animeName){
        tvAnimeName.setText(animeName);
    }
}
