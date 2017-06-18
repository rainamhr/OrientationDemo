package com.example.cksya.orientationdemo;

import android.support.v4.util.SparseArrayCompat;

import tellh.com.stickyheaderview_rv.adapter.DataBean;
import tellh.com.stickyheaderview_rv.adapter.IViewBinder;
import tellh.com.stickyheaderview_rv.adapter.IViewBinderProvider;
import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;

/**
 * Created by CKSYA on 5/23/2017.
 */

/*mport tellh.com.stickyheaderview_rv.adapter.DataBean;
import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;

import tellh.com.stickyheaderview_rv.adapter.DataBean;
import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;

public class Contact extends DataBean {
    private String name;
    private int contact;
    // private String avatar_url;
    private boolean shouldSticky;


    public Contact(String name, int contact) {
        this.name = name;
        this.contact = contact;
        // this.avatar_url = avatar_url;
    }

   *//* public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }*//*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter adapter) {
        return R.layout.item_row;
    }

    public void setShouldSticky(boolean shouldSticky) {
        this.shouldSticky = shouldSticky;
    }

    @Override
    public boolean shouldSticky() {
        return shouldSticky;
    }




}*/

/*
class Contact extends DataBean {
    public Contact(String r1) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    String name;
    String contact;

    public Contact(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter stickyHeaderViewAdapter) {
        return 0;
    }
}

*/

public class Contact extends DataBean {
    private String contact;
    private boolean shouldStiky;

    public Contact(String r1) {
        this.contact = r1;
    }

    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {

        this.contact = contact;
    }
    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter adapter) {
        return R.layout.item_row;
    }

    public void setShouldStiky(boolean shouldSticky) {
        this.shouldStiky = shouldSticky;
    }

    @Override
    public boolean shouldSticky() {
        return shouldStiky;
    }

}