package com.kubra.mobilliumchallenge;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.kubra.mobilliumchallenge.Adapter.CategoriesAdapter;
import com.kubra.mobilliumchallenge.Adapter.CollectionsAdapter;
import com.kubra.mobilliumchallenge.Adapter.EditorShopsAdapter;
import com.kubra.mobilliumchallenge.Adapter.ProductAdapter;
import com.kubra.mobilliumchallenge.Adapter.ViewPagerAdapter;
import com.kubra.mobilliumchallenge.ViewModels.VitrinovaViewModel;
import com.kubra.mobilliumchallenge.model.BaseModel;
import com.kubra.mobilliumchallenge.model.CategoriesList;
import com.kubra.mobilliumchallenge.model.CollectionsList;
import com.kubra.mobilliumchallenge.model.FeaturedList;
import com.kubra.mobilliumchallenge.model.ProductsList;
import com.kubra.mobilliumchallenge.model.ShopsList;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    ViewPager vp_featured;
    RecyclerView rv_products;
    RecyclerView rv_categories;
    RecyclerView rv_collections;
    RecyclerView rv_editor_shops;

    TextView tv_product_title;
    TextView tv_categories_title;
    TextView tv_collections_title;
    LinearLayout ll_all;
    LinearLayout linearLayout4;

    ViewPagerAdapter viewPagerAdapter;
    ProductAdapter productAdapter;
    CategoriesAdapter categoriesAdapter;
    CollectionsAdapter collectionsAdapter;
    EditorShopsAdapter editorShopsAdapter;
    Activity activity;
    LinearLayout layout_dots;

    VitrinovaViewModel vitrinovaViewModel;
    FeaturedList featuredList;
    ProductsList new_products;
    CollectionsList collections;
    ShopsList editor_shops;
    ShopsList new_shops;
    ShopsList shopsList;
    CategoriesList categories;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View item_product = findViewById(R.id.item_product);
        View item_collections = findViewById(R.id.item_collections);
        View item_categories = findViewById(R.id.item_categories);
        View item_editor_shops = findViewById(R.id.item_editor_shops);

        activity = this;
        vp_featured = findViewById(R.id.vp_featured);
        layout_dots = findViewById(R.id.layout_dots);
        rv_products = item_product.findViewById(R.id.rv_item);
        rv_categories = item_categories.findViewById(R.id.rv_item);
        rv_collections = item_collections.findViewById(R.id.rv_item);
        rv_editor_shops = item_editor_shops.findViewById(R.id.rv_item);
        tv_product_title = item_product.findViewById(R.id.tv_title);
        ll_all = item_product.findViewById(R.id.ll_all);
        tv_categories_title = item_categories.findViewById(R.id.tv_title);
        tv_collections_title = item_collections.findViewById(R.id.tv_title);
        linearLayout4 = findViewById(R.id.linearLayout4);

        vitrinovaViewModel = ViewModelProviders.of(this).get(VitrinovaViewModel.class);
        vitrinovaViewModel.init();
        vitrinovaViewModel.getNewsRepository().observe(this, new Observer<List<BaseModel>>() {
            @Override
            public void onChanged(List<BaseModel> baseModels) {

                for (int i = 0; i < baseModels.size(); i++) {
                    BaseModel baseModel = baseModels.get(i);
                    if (baseModel instanceof FeaturedList) {
                        featuredList = (FeaturedList) baseModel;

                    } else if (baseModel instanceof ShopsList) {
                        shopsList = (ShopsList) baseModels.get(i);
                        if (shopsList.getType().equals("editor_shops")) {
                            editor_shops = shopsList;
                        } else if (shopsList.getType().equals("new_shops")) {
                            new_shops = shopsList;
                        }
                    } else if (baseModel instanceof ProductsList) {
                        new_products = (ProductsList) baseModel;

                    } else if (baseModel instanceof CollectionsList) {
                        collections = (CollectionsList) baseModel;

                    } else if (baseModel instanceof CategoriesList) {
                        categories = (CategoriesList) baseModel;
                    }
                }

                setupViewPager();
                setupProductRecylerView();
                setupCategoriesRecylerView();
                setupCollectionsRecylerView();
                setupEditorShopsRecylerView();


                viewPagerAdapter.notifyDataSetChanged();
                productAdapter.notifyDataSetChanged();
                categoriesAdapter.notifyDataSetChanged();
                collectionsAdapter.notifyDataSetChanged();
                editorShopsAdapter.notifyDataSetChanged();
                ll_all.setVisibility(View.VISIBLE);
                linearLayout4.setBackgroundColor(getResources().getColor(R.color.item_gray));
            }
        });


    }

    private void addBottomDots(LinearLayout layout_dots, int size, int current) {
        ImageView[] dots = new ImageView[size];
        layout_dots.removeAllViews();
        int width_height = 20;
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

    public void setupViewPager() {
        viewPagerAdapter = new ViewPagerAdapter(getApplicationContext(), featuredList.getFeatured());

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

    public void setupProductRecylerView() {
        productAdapter = new ProductAdapter(this, new_products.getProducts());
        rv_products.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_products.setAdapter(productAdapter);
        tv_product_title.setText(new_products.getTitle().toUpperCase());
        ll_all.setVisibility(View.VISIBLE);

    }

    public void setupCategoriesRecylerView() {
        categoriesAdapter = new CategoriesAdapter(this, categories.getCategories());
        rv_categories.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_categories.setAdapter(categoriesAdapter);
        tv_categories_title.setText(categories.getTitle().toUpperCase());

    }

    public void setupCollectionsRecylerView() {
        collectionsAdapter = new CollectionsAdapter(this, collections.getCollections());
        rv_collections.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_collections.setAdapter(collectionsAdapter);
        tv_collections_title.setText(collections.getTitle().toUpperCase());


    }

    public void setupEditorShopsRecylerView() {
        editorShopsAdapter = new EditorShopsAdapter(this, editor_shops.getShops());
        rv_collections.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
        rv_collections.setAdapter(editorShopsAdapter);
        tv_collections_title.setText(editor_shops.getTitle());
        ll_all.setVisibility(View.VISIBLE);

    }
}
