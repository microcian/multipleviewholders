package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.viewholder;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.RecyclerView;

import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.R;

public class PagiViewHolder extends RecyclerView.ViewHolder {
    public TextView mTitle;
    public int posisi = 0;
    public int posisi1 = 1;
    public Button tombolbaca;
    public Button tombolshare;

    public PagiViewHolder(View itemView) {
        super(itemView);

        itemView.setOnClickListener(mainViewClickListener);
        mTitle = (TextView) itemView.findViewById(R.id.titleTextView);
        tombolbaca = (Button) itemView.findViewById(R.id.buttonbaca);
        tombolshare = (Button) itemView.findViewById(R.id.buttonshare);
        tombolbaca.setOnClickListener(bacaClickListener);
        tombolshare.setOnClickListener(shareClickListener);
    }

    private View.OnClickListener bacaClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // Do button click handling here
        }
    };

    private View.OnClickListener shareClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // Do button click handling here
            if ( posisi == getAdapterPosition() ) {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, mTitle.getText().toString() + mTitle.getText().toString() );
                sendIntent.setType("text/plain");
                Intent.createChooser(sendIntent,"Share via");
                v.getContext().startActivity(sendIntent);
            }
        }
    };

    private View.OnClickListener mainViewClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // Do button click handling here
            Toast.makeText(v.getContext(), "ssss = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
        }
    };


}

