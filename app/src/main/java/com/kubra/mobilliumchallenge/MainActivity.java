package com.kubra.mobilliumchallenge;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kubra.mobilliumchallenge.Adapter.ViewPagerAdapter;
import com.kubra.mobilliumchallenge.Serialize.CheckInterface;
import com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer;
import com.kubra.mobilliumchallenge.model.CategoriesList;
import com.kubra.mobilliumchallenge.model.CollectionsList;
import com.kubra.mobilliumchallenge.model.FeaturedList;
import com.kubra.mobilliumchallenge.model.ProductsList;
import com.kubra.mobilliumchallenge.model.ShopsList;
import com.kubra.mobilliumchallenge.network.ApiManager;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    public static FeaturedList featured = null;
    public static ProductsList new_products = null;
    public static CollectionsList collections = null;
    public static ShopsList editor_shops = null;
    public static ShopsList new_shops = null;
    public static CategoriesList categories = null;

    ViewPagerAdapter viewPagerAdapter;
    ViewPager vp_featured;
    Activity activity;
    LinearLayout layout_dots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity = this;
        vp_featured = findViewById(R.id.vp_featured);
        layout_dots = findViewById(R.id.layout_dots);

        ApiManager apiManager = ApiManager.getInstance();
        apiManager.addVersionData(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response) {
                Log.d("response", response.message());
                String json = new Gson().toJson(response.body());

                GsonBuilder builder = new GsonBuilder();

                builder.registerTypeAdapter(CheckInterface.class, new CheckInterfaceDeserializer());
                Gson gson = builder.create();

                CheckInterface[] result2 = gson.fromJson(json, CheckInterface[].class);

                viewPagerAdapter = new ViewPagerAdapter(getApplicationContext(), featured.getFeatured());

                vp_featured.setAdapter(viewPagerAdapter);

                vp_featured.setCurrentItem(0);
                addBottomDots(layout_dots, viewPagerAdapter.getCount(), 0);
                vp_featured.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int pos, float positionOffset, int positionOffsetPixels) {
                    }

                    @Override
                    public void onPageSelected(int pos) {
                        addBottomDots(layout_dots, viewPagerAdapter.getCount(), pos);

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {
                    }
                });
            }

            @Override
            public void onFailure(Call<List<Object>> call, Throwable t) {
                Log.d("response", t.getMessage());

            }
        });


        // displaying selected image first

    }

    private void addBottomDots(LinearLayout layout_dots, int size, int current) {
        ImageView[] dots = new ImageView[size];
        layout_dots.removeAllViews();
        int width_height=20;
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new ImageView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(width_height, width_height));
            params.setMargins(10, 10, 10, 10);
            dots[i].setLayoutParams(params);
            dots[i].setImageResource(R.drawable.shape_circle_outline);
            layout_dots.addView(dots[i]);
        }
        if (dots.length > 0) {
            dots[current].setImageResource(R.drawable.shape_circle);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(30, 30));
            dots[current].setLayoutParams(params);
        }
    }
}
