package com.atul.android.recyclecart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.atul.android.recyclecart.databinding.ActivityMainBinding;
import com.atul.android.recyclecart.models.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setupProductList();
    }

    private void setupProductList() {
        //Create DataSet
        List<Product> product = new ArrayList<>(
                Arrays.asList(
                        new Product("Tomato",20)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                        ,new Product("Potato",30)
                        ,new Product("Apple",100)
                )
        );
        //Create Adapter object
        ProductsAdapter adapter = new ProductsAdapter(this,product);
        // Set the adapter & layoutManager to RV
        b.productID.setAdapter(adapter);
        b.productID.setLayoutManager(new LinearLayoutManager(this));
    }
}
