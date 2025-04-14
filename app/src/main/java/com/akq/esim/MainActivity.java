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
//        com.google.common.collect.Lists.transform()

//        0>api.xml.class-parse: Warning BG8605 : The Java type 'com.google.common.collect.FluentIterable<T>' could not be found (are you missing a Java reference jar/aar or a Java binding library NuGet?)
//        0>api.xml.class-parse: Warning BG8605 : The Java type 'com.google.common.collect.Lists.RandomAccessListWrapper<E>' could not be found (are you missing a Java reference jar/aar or a Java binding library NuGet?)
//        com.google.common.collect.FluentIterable
    }

}