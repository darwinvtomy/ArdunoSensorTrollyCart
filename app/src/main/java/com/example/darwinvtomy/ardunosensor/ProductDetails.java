package com.example.darwinvtomy.ardunosensor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {
TextView name ,cost, id,weight,exp,mfg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Product selectedProductDetails = GlobalClass.getheSelectedProductDetails();
        name = (TextView) findViewById(R.id.p_nameDetail);
        cost = (TextView) findViewById(R.id.p_costDetail);
        id = (TextView) findViewById(R.id.p_idDetail);
        weight = (TextView) findViewById(R.id.p_weightDetail);
        exp = (TextView) findViewById(R.id.p_expDetail);
        mfg  = (TextView) findViewById(R.id.p_mfgDetail);



        name.setText(selectedProductDetails.getName());
        cost.setText(selectedProductDetails.getCost()+"");
        id.setText(selectedProductDetails.getId()+"");
        weight.setText(selectedProductDetails.getWeight());
        exp.setText(selectedProductDetails.getExpdate());
        mfg.setText(selectedProductDetails.getMfgdate());


    }
}
