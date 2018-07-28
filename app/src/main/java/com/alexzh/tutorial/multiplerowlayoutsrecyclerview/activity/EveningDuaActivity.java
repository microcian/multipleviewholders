package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.R;
import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.adapter.AdapterDoa;
import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.factory.RecycleViewFactory;
import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.model.ModelDoa;

import java.util.ArrayList;
import java.util.List;

public class EveningDuaActivity extends AppCompatActivity {

    private AdapterDoa adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_sore);

        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void initView() {
        setupAdapter();
        setupRecycleView();
    }

    private void setupAdapter() {
        adapter = new AdapterDoa(buildData());
    }

    private void setupRecycleView() {
        recyclerView = RecycleViewFactory.create(this, adapter, findViewById(R.id.recyclerView));
        adapter.notifyDataSetChanged();
    }

    private List<ModelDoa> buildData() {
        List<ModelDoa> list = new ArrayList<>();
        list.add(new ModelDoa("Lorem ipsum dolom sir amet", ModelDoa.DOA_SORE));
        list.add(new ModelDoa("Doa dan anugerah", ModelDoa.DOA_SORE));
        return list;
    }
}
