package com.akq.esim;

import android.app.Activity;
import android.os.Bundle;


import com.akq.esim.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

     private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

}