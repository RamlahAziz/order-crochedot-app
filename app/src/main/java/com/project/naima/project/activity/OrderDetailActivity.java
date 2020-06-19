package com.project.naima.project.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import com.project.naima.project.BaseActivity;
import com.project.naima.project.Constant;
import com.project.naima.project.Data;
import com.project.naima.project.R;
import com.project.naima.project.SPUtil;
import com.project.naima.project.adapter.OrderAdapter;
import com.project.naima.project.pojo.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDetailActivity extends BaseActivity {
    Toolbar toolbar;                              // Declaring the Toolbar Object
    @BindView(R.id.tvName)
    TextView tvName;
    @BindView(R.id.tvOrderNo)
    TextView tvOrderNo;
    @BindView(R.id.tvPrice)
    TextView tvPrice;
    @BindView(R.id.tvCity)
    TextView tvCity;
    @BindView(R.id.tvPhoneNumber)
    TextView tvPhoneNumber;
    @BindView(R.id.tvDescription)
    TextView tvDescription;
    @BindView(R.id.tvButton)
    TextView tvButton;
    Order mOrderInfo;
    private List<Order> mOrderInfos = new ArrayList<>();

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_order_detail;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras(); //bugtags 833
        if (bundle != null)
            mOrderInfo = ((Order) bundle.get(Constant.INTENT_EXTRA_ITEMINFO));
        init(mOrderInfo);

    }

    public void init(@Nullable final Order order) {
        tvName.setText(order.getCustomer_name());
        tvOrderNo.setText(order.getOrdernum() + "");
        tvPrice.setText(order.getPrice() + "");
        tvDescription.setText(order.getDetails() + "");
        tvCity.setText(order.getCustomer_address() + "");
        tvPhoneNumber.setText(order.getPhone() + "");

        switch (order.getStatus()) {
            case "1":
                tvButton.setText("Start Order");
                break;
            case "2":
                tvButton.setText("End Order");
                break;
            case "3":
                tvButton.setText("Order Ended");
                break;
        }

        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeStatus(order);

            }
        });


    }

    public void changeStatus(Order order) {
        Data data = SPUtil.getData(OrderDetailActivity.this);
        int index = 0;
        for (int i = 0; i < data.getAllOrders().size(); i++) {
            if (data.getAllOrders().get(i).getCustomer_name().equals(order.getCustomer_name()) && data.getAllOrders().get(i).getDetails().equals(order.getDetails())) {
                index = i;
            }
        }
        switch (order.getStatus()) {
            case "1":
                tvButton.setText("End Order");
                data.getAllOrders().get(index).setStatus("2");
                break;
            case "2":
                data.getAllOrders().get(index).setStatus("3");
                tvButton.setText("Order Ended");
                break;
            case "3":
                break;

        }
        SPUtil.saveData(OrderDetailActivity.this, data);

    }


}
