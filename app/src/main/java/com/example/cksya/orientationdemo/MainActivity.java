package com.example.cksya.orientationdemo;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


import tellh.com.stickyheaderview_rv.adapter.StickyHeaderViewAdapter;

public class MainActivity extends AppCompatActivity{
    RecyclerView r1;
    List<Contact> contactList =new ArrayList<>();
    List<ItemHeader> headerList = new ArrayList<>();
    StickyHeaderViewAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       r1 = (RecyclerView) findViewById(R.id.h1_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        r1.setLayoutManager(linearLayoutManager);

        contactList = new ArrayList<>();
       myAdapter = new StickyHeaderViewAdapter(contactList)
                .RegisterItemType(new ContactItemViewBinder())
                .RegisterItemType(new ItemHeaderViewBinder());

        /*RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        r1.setLayoutManager(layoutManager);
        r1.setItemAnimator(new DefaultItemAnimator());*/

        r1.setAdapter(myAdapter);
        addGarne();
    }

 /*   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
*/
  /*  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.action_add_view:
//                User user = new User("Sticky View", 123, "https://avatars.githubusercontent.com/u/15800681?v=3");
//                user.setShouldSticky(random.nextBoolean());
//                adapter.append(user);
//                break;
//            case R.id.action_clear_all:
//                adapter.clear(rv);
//                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }*/

    void addGarne() {
        ItemHeader header= new ItemHeader("h1");
        headerList.add(header);

        Contact list = new Contact("r1");
        contactList.add(list);

        list = new Contact("r2");
        contactList.add(list);

        list = new Contact("r3");
        contactList.add(list);

        list = new Contact("r4");
        contactList.add(list);

        list = new Contact("r5");
        contactList.add(list);

        list = new Contact("r6");
        contactList.add(list);

        list = new Contact("r7");
        contactList.add(list);

        list = new Contact("r8");
        contactList.add(list);

        list = new Contact("r9");
        contactList.add(list);

        list = new Contact("r10");
        contactList.add(list);

        list = new Contact("r11");
        contactList.add(list);

        list = new Contact("r12");
        contactList.add(list);

        ItemHeader header2= new ItemHeader("h2");
        headerList.add(header2);

        Contact list1 = new Contact("r1");
        contactList.add(list1);

        list1 = new Contact("r2");
        contactList.add(list1);

        list1 = new Contact("r3");
        contactList.add(list1);

        list1 = new Contact("r4");
        contactList.add(list1);

        list1 = new Contact("r5");
        contactList.add(list1);

        list1 = new Contact("r6");
        contactList.add(list1);

        list1 = new Contact("r7");
        contactList.add(list1);

        list1 = new Contact("r8");
        contactList.add(list1);

        list1 = new Contact("r9");
        contactList.add(list1);

        list1 = new Contact("r10");
        contactList.add(list1);

        list1 = new Contact("r11");
        contactList.add(list1);

        list1 = new Contact("r12");
        contactList.add(list1);

       myAdapter.notifyDataSetChanged();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
            r1.setLayoutManager(layoutManager);
            r1.setItemAnimator(new DefaultItemAnimator());
            r1.setAdapter(myAdapter);

            addGarne();

        }
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);

            r1.setLayoutManager(layoutManager);
            r1.setItemAnimator(new DefaultItemAnimator());
            r1.setAdapter(myAdapter);

            addGarne();
        }
    }
}