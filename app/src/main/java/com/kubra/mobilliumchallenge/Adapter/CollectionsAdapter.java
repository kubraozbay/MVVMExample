package com.kubra.mobilliumchallenge.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kubra.mobilliumchallenge.R;
import com.kubra.mobilliumchallenge.model.Collections;

import java.util.List;

public class CollectionsAdapter extends RecyclerView.Adapter<CollectionsAdapter.CollectionsViewHolder> {
    private LayoutInflater inflater;
    private List<Collections> collectionsList;
    private Context context;

    public CollectionsAdapter(Context context, List<Collections> CollectionsList) {

        inflater = LayoutInflater.from(context);
        this.collectionsList = CollectionsList;
        this.context = context;
    }

    @Override
    public CollectionsAdapter.CollectionsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.collections_item, parent, false);
        CollectionsAdapter.CollectionsViewHolder holder = new CollectionsAdapter.CollectionsViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CollectionsAdapter.CollectionsViewHolder holder, int position) {

        holder.tv_title.setText(collectionsList.get(position).getTitle());
        holder.tv_subTitle.setText(collectionsList.get(position).getDefinition());

        Glide.with(context).load(collectionsList.get(position).getCover().getUrl()).into(holder.img_cover);


    }

    @Override
    public int getItemCount() {
        return collectionsList.size();
    }

    class CollectionsViewHolder extends RecyclerView.ViewHolder {

        ImageView img_cover;
        TextView tv_title, tv_subTitle;

        CollectionsViewHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_subTitle = itemView.findViewById(R.id.tv_subtitle);
            img_cover = itemView.findViewById(R.id.img_cover);
        }

    }
}
