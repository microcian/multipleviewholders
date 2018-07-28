package com.alexzh.tutorial.multiplerowlayoutsrecyclerview;

public class ModelDoa {

    public static final int DOA_PAGI = 0;
    public static final int DOA_SORE = 1;

    private String mName;
    private int mType;

    public ModelDoa(String name, int type) {
        this.mName = name;
        this.mType = type;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public int getType() {
        return mType;
    }

    public void setType(int type) {
        this.mType = type;
    }
}
