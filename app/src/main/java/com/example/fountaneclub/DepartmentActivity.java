package com.example.fountaneclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class DepartmentActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    DepartmentAdapter adapter;

    List<Department> departmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);



        departmentList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF)",
                        " USER EXPERIENCE",
                        R.drawable.user_experience));

        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF)",
                        "TECHNOLOGY",
                        R.drawable.technology));

        departmentList.add(
                new Department(
                        1,
                        "DEPARTMENT OF)",
                        "OPERATIONS",
                        R.drawable.operations));

        DepartmentAdapter adapter = new DepartmentAdapter(this, departmentList);

        recyclerView.setAdapter(adapter);



    }
}
