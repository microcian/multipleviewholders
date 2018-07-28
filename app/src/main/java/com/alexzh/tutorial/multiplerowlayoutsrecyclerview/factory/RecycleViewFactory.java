package com.alexzh.tutorial.multiplerowlayoutsrecyclerview.factory;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RecycleViewFactory {
    public static RecyclerView create(AppCompatActivity rootView,
                                      RecyclerView.Adapter adapter,
                                      View view) {
        if (view instanceof RecyclerView) {
            RecyclerView v = (RecyclerView) view;
            v.setLayoutManager(new LinearLayoutManager(rootView));
            v.setItemAnimator(new DefaultItemAnimator());
            v.setAdapter(adapter);
            return v;
        }
        throw new IllegalArgumentException("Wrong parent view");
    }
}
