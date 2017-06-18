package com.example.cksya.orientationdemo;

import android.view.View;
import android.widget.TextView;

import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;
import tellh.com.stickyheaderview_rv.adapter.ViewBinder;

//import com.squareup.picasso.Picasso;

/**
 * Created by tlh on 2017/1/22 :)
 */

class ContactItemViewBinder extends ViewBinder<Contact, ContactItemViewBinder.ViewHolder> {
    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(StickyHeaderViewAdapter adapter, ViewHolder holder, int position, Contact entity) {
        holder.name_tv.setText(String.valueOf(entity.getContact()));
        //holder.tvName.setText(entity.getLogin());

    }

    @Override
    public int getItemLayoutId(StickyHeaderViewAdapter adapter) {
        return R.layout.item_row;
    }

    static class ViewHolder extends ViewBinder.ViewHolder {
        public TextView name_tv;
       /* public ImageView ivAvatar;
        public TextView tvName;*/

        public ViewHolder(View rootView) {
            super(rootView);
            this.name_tv = (TextView) rootView.findViewById(R.id.name_tv);
            /*this.ivAvatar = (ImageView) rootView.findViewById(R.id.iv_avatar);
            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);*/
        }

    }
}
