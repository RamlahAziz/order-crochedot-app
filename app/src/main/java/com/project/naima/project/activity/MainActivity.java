package com.project.naima.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.naima.project.R;
import com.project.naima.project.SPUtil;
import com.project.naima.project.pojo.Order;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    FloatingActionButton fab;
    LinearLayout llNewOrder;
    LinearLayout llStarted;
    LinearLayout llCompleted;
    LinearLayout llAll;
    TextView tvTotal, tvCompleted, tvNew, tvStarted, tvCompletedb, tvTotalPrice,tvTotall;

    private List<Order> mOrderInfos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);
        init();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AddOrderActivity.class));
            }
        });
        llNewOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewOrderActivity.class));
            }
        });
        llStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, StartedActivity.class));
            }
        });
        llCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CompletedActivity.class));
            }
        });
        llAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, AllOrderActivity.class));
            }
        });
        checkCount();
    }

    @Override
    protected void onResume() {
        super.onResume();
        checkCount();
    }

    public void init() {
        fab = findViewById(R.id.fab);
        llNewOrder = findViewById(R.id.llNewOrder);
        llStarted = findViewById(R.id.llStarted);
        llCompleted = findViewById(R.id.llCompleted);
        llAll = findViewById(R.id.llAll);
        tvCompleted = findViewById(R.id.tvCompleted);
        tvCompletedb = findViewById(R.id.tvCompletedb);
        tvTotal = findViewById(R.id.tvTotal);
        tvNew = findViewById(R.id.tvNew);
        tvStarted = findViewById(R.id.tvStarted);
        tvTotalPrice = findViewById(R.id.tvTotalPrice);
        tvTotall = findViewById(R.id.tvTotall);
    }

    public void checkCount() {
        int completed = 0, nw = 0, started = 0;
        if (SPUtil.getData(MainActivity.this) != null) {
            mOrderInfos = SPUtil.getData(MainActivity.this).getAllOrders();
            for (int i = 0; i < mOrderInfos.size(); i++) {
                if (mOrderInfos.get(i).getStatus().equals("1")) {
                    nw++;
                } else if (mOrderInfos.get(i).getStatus().equals("2")) {
                    started++;
                } else if (mOrderInfos.get(i).getStatus().equals("3")) {
                    completed++;
                }
            }
            tvCompleted.setText(completed + "");
            tvCompletedb.setText(completed + " Tasks");
            tvNew.setText(nw + " Tasks");
            tvTotal.setText(mOrderInfos.size()+"");
            tvStarted.setText(started + " Tasks");
            tvTotalPrice.setText(calculateTotalPrice() + "");
            tvTotall.setText(mOrderInfos.size()+ "");
        }
    }

    public int calculateTotalPrice() {
        int price = 0;
        for (int i = 0; i < mOrderInfos.size(); i++) {
            price += mOrderInfos.get(i).getPrice();
        }
        return price;
    }
}

