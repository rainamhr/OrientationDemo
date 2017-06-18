package com.example.cksya.orientationdemo;

import android.support.v4.util.SparseArrayCompat;

import tellh.com.stickyheaderview_rv.adapter.DataBean;
import tellh.com.stickyheaderview_rv.adapter.IViewBinder;
import tellh.com.stickyheaderview_rv.adapter.IViewBinderProvider;
import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;

/**
 * Created by tlh on 2017/1/22 :)
 */
public class ItemHeader extends DataBean {
    private String text1;

    public String getText1() {
        return text1;
    }

    public ItemHeader(String text1) {
        this.text1 = text1;
    }

    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter adapter) {
        return R.layout.header;
    }

    @Override
    public boolean shouldSticky() {
        return true;
    }
}


/*
public class ItemHeader extends Contact implements IViewBinderProvider {
    private String name;

    public String getName() {
        return name;
    }

    public ItemHeader(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public IViewBinder provideViewBinder(StickyHeaderViewAdapter stickyHeaderViewAdapter, SparseArrayCompat<? extends IViewBinder> sparseArrayCompat, int i) {
        return null;
    }
}
*/
