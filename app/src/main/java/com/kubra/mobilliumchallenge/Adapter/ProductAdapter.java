package com.kubra.mobilliumchallenge.Adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kubra.mobilliumchallenge.R;
import com.kubra.mobilliumchallenge.model.Products;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private LayoutInflater inflater;
    private List<Products> productsLists;
    private Context context;

    public ProductAdapter(Context context, List<Products> productsLists) {

        inflater = LayoutInflater.from(context);
        this.productsLists = productsLists;
        this.context = context;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.products_item, parent, false);
        ProductViewHolder holder = new ProductViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {

        String title = productsLists.get(position).getTitle();
        if (title.length() > 18) {
            title = title.substring(0, 18) + "...";
        }
        holder.tv_product_title.setText(title);
        holder.tv_product_shop_name.setText(productsLists.get(position).getShop().getName());
        holder.tv_product_price.setText(productsLists.get(position).getPrice() + " TL");
        holder.tv_product_old_price.setText(productsLists.get(position).getOldPrice() + " TL");
        holder.tv_product_old_price.setPaintFlags(holder.tv_product_old_price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        Glide.with(context).load(productsLists.get(position).getImages().get(0).getUrl()).into(holder.iv_product);



    }

    @Override
    public int getItemCount() {
        return productsLists.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        TextView tv_product_title, tv_product_shop_name, tv_product_price, tv_product_old_price;
        ImageView iv_product;

        ProductViewHolder(View itemView) {
            super(itemView);

            tv_product_title = itemView.findViewById(R.id.tv_product_title);
            tv_product_shop_name = itemView.findViewById(R.id.tv_product_shop_name);
            tv_product_price = itemView.findViewById(R.id.tv_product_price);
            tv_product_old_price = itemView.findViewById(R.id.tv_product_old_price);

            iv_product = itemView.findViewById(R.id.iv_product);
        }

    }
}