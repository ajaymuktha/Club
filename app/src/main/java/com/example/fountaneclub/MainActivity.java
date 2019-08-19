package com.example.fountaneclub;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    DepartmentAdapter adapter;


    List<Department> departmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        departmentList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF",
                        "USER EXPERIENCE",
                        R.drawable.user_experience));

        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF",
                        "TECHNOLOGY",
                        R.drawable.dellinspiron));

        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF",
                        "OPERATIONS",
                        R.drawable.surface));


        DepartmentAdapter adapter = new DepartmentAdapter(this, departmentList);
        recyclerView.setAdapter(adapter);

            }
        }


