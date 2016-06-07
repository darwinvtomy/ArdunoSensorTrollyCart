package com.example.darwinvtomy.ardunosensor;

/**
 * Created by DARWIN V TOMY on 4/25/2016.
 */
public class GlobalClass {
    private static Product SELECTED_PRODUCT;



    public static void setSelectedProduct(Product selectedProduct) {
        SELECTED_PRODUCT = selectedProduct;
    }

    public static Product getheSelectedProductDetails() {
        return SELECTED_PRODUCT;
    }
}
