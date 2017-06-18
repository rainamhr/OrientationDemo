package com.example.cksya.orientationdemo;

import android.view.View;
import android.widget.TextView;

import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;
import tellh.com.stickyheaderview_rv.adapter.ViewBinder;

/**
 * Created by tlh on 2017/1/22 :)
 */

public class ItemHeaderViewBinder extends ViewBinder<ItemHeader, ItemHeaderViewBinder.ViewHolder> {

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(StickyHeaderViewAdapter adapter, ViewHolder holder, int position, ItemHeader entity) {
        holder.text1.setText(entity.getText1());
    }

    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter adapter) {
        return R.layout.header;
    }


    static class ViewHolder extends ViewBinder.ViewHolder {
        TextView text1;

        public ViewHolder(View rootView) {
            super(rootView);
            this.text1 = (TextView) rootView.findViewById(R.id.text1);
        }

    }
}
