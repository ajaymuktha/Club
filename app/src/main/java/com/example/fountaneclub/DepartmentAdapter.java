package com.example.fountaneclub;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DepartmentAdapter extends  RecyclerView.Adapter<DepartmentAdapter.DepartmentViewHolder>{


    private Context mCtx;
    private List<Department> departmentList;


    public DepartmentAdapter(Context mCtx, List<Department> departmentList) {
        this.mCtx = mCtx;
        this.departmentList = departmentList;
    }

    @Override
    public DepartmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.deptlist, null);
        DepartmentViewHolder holder = new DepartmentViewHolder(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(DepartmentViewHolder holder, int position) {


        Department department = departmentList.get(position);

        holder.textViewTitle.setText(department.getTitle());
        holder.textViewDesc.setText(department.getShortdesc());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(department.getImage()));

    }

    @Override
    public int getItemCount() {
        return departmentList.size();
    }

    class DepartmentViewHolder extends RecyclerView.ViewHolder{


        ImageView imageView;
        TextView textViewTitle, textViewDesc;


        public DepartmentViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);

        }
    }


}
