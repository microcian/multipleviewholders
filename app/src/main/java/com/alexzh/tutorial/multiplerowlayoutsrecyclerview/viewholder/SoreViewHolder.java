package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.viewholder;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.RecyclerView;

import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.R;

public class SoreViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView mTitle;

    public SoreViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        mTitle = itemView.findViewById(R.id.titleTextView);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "asu = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
    }
}
