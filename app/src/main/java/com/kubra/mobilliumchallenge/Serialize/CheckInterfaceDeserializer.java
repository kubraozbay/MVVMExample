package com.kubra.mobilliumchallenge.Serialize;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.kubra.mobilliumchallenge.MainActivity;
import com.kubra.mobilliumchallenge.model.CategoriesList;
import com.kubra.mobilliumchallenge.model.CollectionsList;
import com.kubra.mobilliumchallenge.model.FeaturedList;
import com.kubra.mobilliumchallenge.model.ProductsList;
import com.kubra.mobilliumchallenge.model.ShopsList;

import java.lang.reflect.Type;

public class CheckInterfaceDeserializer implements JsonDeserializer<CheckInterface> {

    public static FeaturedList featured = null;
    public static ProductsList new_products = null;
    public static CollectionsList collections = null;
    public static ShopsList editor_shops = null;
    public static ShopsList new_shops = null;
    public static CategoriesList categories = null;
    
    @Override
    public CheckInterface deserialize(JsonElement json, Type typeOfT,
                                      JsonDeserializationContext context) throws JsonParseException {
        JsonObject jObject = (JsonObject) json;
        JsonElement typeObj = jObject.get("type");

        if (typeObj != null) {
            String typeVal = typeObj.getAsString();

            switch (typeVal) {
                case "featured": {
                    featured = context.deserialize(json, FeaturedList.class);

                    return context.deserialize(json, FeaturedList.class);
                }

                case "new_products": {
                    new_products = context.deserialize(json, ProductsList.class);
                    return context.deserialize(json, ProductsList.class);

                }
                case "editor_shops": {
                    editor_shops = context.deserialize(json, ShopsList.class);
                    return context.deserialize(json, ShopsList.class);

                }
                case "new_shops": {
                    new_shops = context.deserialize(json, ShopsList.class);
                    return context.deserialize(json, ShopsList.class);

                }
                case "collections": {
                    collections = context.deserialize(json, CollectionsList.class);
                    return context.deserialize(json, CollectionsList.class);

                }
                case "categories": {
                    categories = context.deserialize(json, CategoriesList.class);
                    return context.deserialize(json, CategoriesList.class);

                }
            }
        }

        return null;
    }
}
