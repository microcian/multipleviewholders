package com.alexzh.tutorial.multiplerowlayoutsrecyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DoaSore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa_sore);

    }

    @Override
    protected void onStart() {
        super.onStart();

        AdapterDoa adapter = new AdapterDoa(DoaPagi.getData());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DoaSore.this);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);
    }

    public static Context context;
    public static List<ModelDoa> getData() {

        List<ModelDoa> list = new ArrayList<>();

        list.add(new ModelDoa("ssssss", ModelDoa.DOA_SORE));
        list.add(new ModelDoa("cccccccc", ModelDoa.DOA_SORE));


        return list;
    }

}
