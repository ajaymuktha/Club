package com.example.fountaneclub;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DomainAdapter extends  RecyclerView.Adapter<DomainAdapter.DomainViewholder>{


    private Context mCtx;
    private List<Domain> domainList;

    public DomainAdapter(Context mCtx, List<Domain> domainList) {
        this.mCtx = mCtx;
        this.domainList = domainList;
    }

    @Override
    public DomainViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.domainlist, null);
        DomainViewholder holder =  new DomainViewholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DomainViewholder holder, int position) {


        Domain domain = domainList.get(position);
        holder.textViewTitle.setText(domain.getTitle());
        holder.textViewDesc.setText(domain.getSubtitle());

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(domain.getImage()));



    }

    @Override
    public int getItemCount() {
        return domainList.size();
    }

    class DomainViewholder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView textViewTitle, textViewDesc;


        public DomainViewholder(View itemView) {
            super(itemView);


            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
        }
    }
}
