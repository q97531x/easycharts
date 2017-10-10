package com.weeboos.easycharts;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weeboos.easycharts.chartfragment.LineChartFragment;
import com.weeboos.easycharts.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        getFragmentManager().beginTransaction().replace(R.id.fl_container, LineChartFragment.newInstance()).commitAllowingStateLoss();
    }
}
