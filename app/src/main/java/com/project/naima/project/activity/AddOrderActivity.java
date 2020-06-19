package com.project.naima.project.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.project.naima.project.Data;
import com.project.naima.project.R;
import com.project.naima.project.SPUtil;
import com.project.naima.project.pojo.Order;


import java.util.ArrayList;
import java.util.List;

public class AddOrderActivity extends AppCompatActivity {
    EditText etPrice, etPhone, etDescription, etName, etCity;
    private List<Order> mOrderInfos = new ArrayList<>();

    TextView etOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order);
        init();

        etOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addOrder(getDataFromEditText());
                finish();
            }
        });
//        fire();
    }

    public void addOrder(Order order) {
        Data data = SPUtil.getData(AddOrderActivity.this);
        if (data != null) {
            data.getAllOrders().add(order);
            SPUtil.saveData(AddOrderActivity.this, data);
        } else {
            Data data1 = new Data();
            mOrderInfos.add(order);
            data1.setAllOrders(mOrderInfos);
            SPUtil.saveData(AddOrderActivity.this, data1);
        }
    }

    public Order getDataFromEditText() {
        Order order = new Order(mOrderInfos.size() + 1, getS(etPhone), Integer.parseInt(getS(etPrice)), getS(etName), getS(etCity), getS(etDescription), "1");
        return order;
    }

    public String getS(EditText et) {
        return et.getText().toString();
    }

    public void init() {
         etCity = findViewById(R.id.etCity);
        etName = findViewById(R.id.etName);
        etPrice = findViewById(R.id.etPrice);
        etPhone = findViewById(R.id.etPhone);
        etOrder = findViewById(R.id.etOrder);
        etDescription = findViewById(R.id.etDescription);
    }
}
