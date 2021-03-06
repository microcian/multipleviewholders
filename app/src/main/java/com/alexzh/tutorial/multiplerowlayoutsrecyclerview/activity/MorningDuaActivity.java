package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.R;
import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.adapter.AdapterDoa;
import com.alexzh.tutorial.multiplerowlayoutsrecyclerview.model.ModelDoa;

import java.util.ArrayList;
import java.util.List;

public class MorningDuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_pagi);

    }

    @Override
    protected void onStart() {
        super.onStart();

        AdapterDoa adapter = new AdapterDoa(MorningDuaActivity.getData());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MorningDuaActivity.this);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);
    }

    public static Context context;
    public static List<ModelDoa> getData() {

        String[] data = context.getResources().getStringArray(R.array.doasore);

        List<ModelDoa> list = new ArrayList<>();

        list.add(new ModelDoa("London", ModelDoa.DOA_PAGI));
        list.add(new ModelDoa("Amsterdam", ModelDoa.DOA_PAGI));
        list.add(new ModelDoa("Berlin", ModelDoa.DOA_PAGI));

        for (int i = 0; i < data.length; i++) {
            list.add(new ModelDoa(data[i], ModelDoa.DOA_PAGI));
        }

        return list;
    }


}