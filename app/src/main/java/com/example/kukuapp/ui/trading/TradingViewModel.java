package com.example.kukuapp.ui.trading;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kukuapp.models.Product;

import java.util.ArrayList;

public class TradingViewModel extends ViewModel {
    private final MutableLiveData<ArrayList<Product>> products = new MutableLiveData<>();

    TradingViewModel() {
        ArrayList<Product> data = new ArrayList<Product>();
        data.add(
                new Product(
                        "Product 1", "", 199
                )
        );
        data.add(
                new Product(
                        "Product 2", "", 2199
                )
        );
        products.setValue(data);
    }
    LiveData<ArrayList<Product>> getData(){
        return products;
    }

}