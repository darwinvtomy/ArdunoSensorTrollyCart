package com.example.darwinvtomy.ardunosensor;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DARWIN V TOMY on 4/22/2016.
 */
public class ProductAdapter extends ArrayAdapter<Product> {
    private Context context;
    private ArrayList<Product> productList;


    public ProductAdapter(Context context, int resource, ArrayList<Product> objects) {
        super(context, resource, objects);
        this.context = context;
        this.productList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.productlist_item,parent,false);

        Product product = productList.get(position);
        TextView name = (TextView) view.findViewById(R.id.p_name);
        TextView cost = (TextView) view.findViewById(R.id.p_cost);
        name.setText(product.getName());
        cost.setText(product.getCost()+"");
        return view;
    }
}
