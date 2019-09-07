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
import com.kubra.mobilliumchallenge.model.Categories;

import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder> {

    private LayoutInflater inflater;
    private List<Categories> categoriesList;
    private Context context;

    public CategoriesAdapter(Context context, List<Categories> categoriesList) {

        inflater = LayoutInflater.from(context);
        this.categoriesList = categoriesList;
        this.context = context;
    }

    @Override
    public CategoriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.categories_item, parent, false);
        CategoriesViewHolder holder = new CategoriesViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(CategoriesViewHolder holder, int position) {

        String title = categoriesList.get(position).getName().toUpperCase();

        holder.tv_categories_title.setText(title);

        Glide.with(context).load(categoriesList.get(position).getLogo().getUrl()).into(holder.iv_categories);


    }

    @Override
    public int getItemCount() {
        return categoriesList.size();
    }

    class CategoriesViewHolder extends RecyclerView.ViewHolder {

        TextView tv_categories_title;
        ImageView iv_categories;

        CategoriesViewHolder(View itemView) {
            super(itemView);

            tv_categories_title = itemView.findViewById(R.id.tv_categories_item_title);
            iv_categories = itemView.findViewById(R.id.iv_categories);
        }

    }
}
