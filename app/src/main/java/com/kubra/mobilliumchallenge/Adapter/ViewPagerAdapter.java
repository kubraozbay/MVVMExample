package com.kubra.mobilliumchallenge.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.kubra.mobilliumchallenge.R;
import com.kubra.mobilliumchallenge.model.Featured;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private List<Featured> items;

    public ViewPagerAdapter(Context context, List<Featured> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    public Featured getItem(int pos) {
        return items.get(pos);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        final Featured featured = items.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.viewpager_item, container, false);

        TextView tv_title = v.findViewById(R.id.tv_title);
        TextView tv_subTitle = v.findViewById(R.id.tv_subtitle);
        ImageView img_cover = v.findViewById(R.id.img_cover);

        tv_title.setText(featured.getTitle().toUpperCase());
        tv_subTitle.setText(featured.getSubTitle().toUpperCase());
        Glide.with(context).load(featured.getCover().getUrl()).into(img_cover);

        container.addView(v);
        return v;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }

}

