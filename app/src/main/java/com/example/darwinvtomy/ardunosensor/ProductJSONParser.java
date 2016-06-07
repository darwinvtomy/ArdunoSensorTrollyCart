package com.example.darwinvtomy.ardunosensor;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by DARWIN V TOMY on 4/22/2016.
 */
public class ProductJSONParser

{
    private String JSONString;

    public ProductJSONParser(String strJson) {
        this.JSONString = strJson;
    }


    public ArrayList<Product> ParseJSON() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            JSONObject jsonRootObject = new JSONObject(JSONString);
            JSONArray jsonArray = jsonRootObject.optJSONArray("ProductsList");

            for (int i = 0; i < jsonArray.length(); i++) {
                Product productitem = new Product();
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                int id = Integer.parseInt(jsonObject.optString("id"));
                String name = jsonObject.optString("name");
                double mrp = Double.parseDouble(jsonObject.optString("mrp"));
                String weight = jsonObject.optString("weight");
                String mfg = jsonObject.optString("mfg");
                String exp = jsonObject.optString("exp");
                productitem.setId(id);
                productitem.setName(name);
                productitem.setCost(mrp);
                productitem.setWeight(weight);
                productitem.setMfgdate(mfg);
                productitem.setExpdate(exp);
                products.add(productitem);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return products;
    }


}

