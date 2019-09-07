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
import com.kubra.mobilliumchallenge.model.Shops;

import java.util.List;

public class EditorShopsAdapter extends RecyclerView.Adapter<EditorShopsAdapter.ShopViewHolder> {

    private LayoutInflater inflater;
    private List<Shops> shopList;
    private Context context;

    public EditorShopsAdapter(Context context, List<Shops> shopList) {

        inflater = LayoutInflater.from(context);
        this.shopList = shopList;
        this.context = context;
    }

    @Override
    public EditorShopsAdapter.ShopViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.editor_shops_item, parent, false);
        EditorShopsAdapter.ShopViewHolder holder = new EditorShopsAdapter.ShopViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(EditorShopsAdapter.ShopViewHolder holder, int position) {

        holder.tv_editor_shop_name.setText(shopList.get(position).getName());

        String defination = shopList.get(position).getDefinition();
        if (defination.length() > 81) {
            defination = defination.substring(0, 81);
        }
        holder.tv_editor_shop_defination.setText(defination+"...");

        int size = 0;
        try {
            if (shopList.get(position).getPopularProducts().get(position).getImages() != null)
                size = shopList.get(position).getPopularProducts().get(position).getImages().size();
        } catch (Exception e) {
            size = 0;
        }

        String[] str = new String[3];

        if (size == 3) {

            for (int i = 0; i < size; i++) {

                str[i] = shopList.get(position).getPopularProducts().get(position).getImages().get(i).getUrl();
            }

            if (!str[0].equals(""))
                Glide.with(context).load(str[0]).into(holder.iv_editor_shop1);

            if (!str[1].equals(""))
                Glide.with(context).load(str[1]).into(holder.iv_editor_shop2);

            if (!str[2].equals(""))
                Glide.with(context).load(str[2]).into(holder.iv_editor_shop3);

        }
    }

    @Override
    public int getItemCount() {
        return shopList.size();
    }

    class ShopViewHolder extends RecyclerView.ViewHolder {

        ImageView iv_editor_shop1, iv_editor_shop2, iv_editor_shop3;
        TextView tv_editor_shop_name, tv_editor_shop_defination;

        ShopViewHolder(View itemView) {
            super(itemView);

            iv_editor_shop1 = itemView.findViewById(R.id.iv_editor_shop1);
            iv_editor_shop2 = itemView.findViewById(R.id.iv_editor_shop2);
            iv_editor_shop3 = itemView.findViewById(R.id.iv_editor_shop3);

            tv_editor_shop_name = itemView.findViewById(R.id.tv_editor_shop_name);
            tv_editor_shop_defination = itemView.findViewById(R.id.tv_editor_shop_defination);


        }

    }
}
