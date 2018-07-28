package com.alexzh.tutorial.multiplerowlayoutsrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import static com.alexzh.tutorial.multiplerowlayoutsrecyclerview.ModelDoa.DOA_PAGI;
import static com.alexzh.tutorial.multiplerowlayoutsrecyclerview.ModelDoa.DOA_SORE;

public class AdapterDoa extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<ModelDoa> mList;

    public AdapterDoa(List<ModelDoa> list) {

        this.mList = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {

            case DOA_PAGI:
                View vieu = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_doa, parent, false);
                PagiViewHolder rcv = new PagiViewHolder(vieu);
                return rcv;

            case DOA_SORE:
                View doa = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_doa, parent, false);
                SoreViewHolder mdoa = new SoreViewHolder(doa);
                return mdoa;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ModelDoa object = mList.get(position);

        if (object != null) {

            switch (object.getType()) {

                case DOA_PAGI:
                    ((PagiViewHolder) holder).mTitle.setText(object.getName());
                    break;

                case DOA_SORE:
                    ((SoreViewHolder) holder).mTitle.setText(object.getName());
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        if (mList == null)
            return 0;
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList != null) {
            ModelDoa object = mList.get(position);
            if (object != null) {
                return object.getType();
            }
        }
        return 0;
    }


}