package com.alexzh.tutorial.multiplerowlayoutsrecyclerview;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.RecyclerView;

public class SoreViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView mTitle;

    public SoreViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(this);
        mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
    }

    @Override
    public void onClick(View view) {

        Toast.makeText(view.getContext(), "asu = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
    }

}
