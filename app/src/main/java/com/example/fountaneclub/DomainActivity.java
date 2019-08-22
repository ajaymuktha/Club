package com.example.fountaneclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DomainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    DomainAdapter adapter;

    List<Domain> domainList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domain);


        domainList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        domainList.add(
                new Domain(
                        1,
                        "WEB)",
                        " DEVELOPMENT",
                        R.drawable.user_experience));

        domainList.add(
                new Domain(
                        1,
                        "ANDROID)",
                        "DEVELOPMENT",
                        R.drawable.dellinspiron));

        domainList.add(
                new Domain(
                        1,
                        "BACKEND)",
                        "DEVELOPMENT",
                        R.drawable.surface));

        //creating recyclerview adapter

        DomainAdapter adapter = new DomainAdapter(this, domainList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
}
