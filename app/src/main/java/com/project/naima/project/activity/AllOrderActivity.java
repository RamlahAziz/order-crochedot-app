package com.project.naima.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.project.naima.project.BaseActivity;
import com.project.naima.project.Constant;
import com.project.naima.project.R;
import com.project.naima.project.SPUtil;
import com.project.naima.project.adapter.OrderAdapter;
import com.project.naima.project.pojo.Order;

import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;

public class AllOrderActivity extends BaseActivity implements OrderAdapter.OnClickOrderListener {
    private List<Order> mOrderInfos = new ArrayList<>();
    private OrderAdapter listAdapter;
    @BindView(R.id.lvList)
    ListView lvList;


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_new_order;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (SPUtil.getData(AllOrderActivity.this) != null) {

            mOrderInfos = SPUtil.getData(AllOrderActivity.this).getAllOrders();
            listAdapter = new OrderAdapter(this, mOrderInfos, this);
            lvList.setAdapter(listAdapter);
            listAdapter.notifyDataSetChanged();
        } else {
            findViewById(R.id.tvNoOrders).setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onClickOrder(View view, int index) {
        if (index < mOrderInfos.size()) { // bugtags #368 java.lang.IndexOutOfBoundsException
            Intent intent = new Intent(this, OrderDetailActivity.class);
            intent.putExtra(Constant.INTENT_EXTRA_ITEMINFO, mOrderInfos.get(index));
            startActivity(intent);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (SPUtil.getData(AllOrderActivity.this) != null) {

            mOrderInfos = SPUtil.getData(AllOrderActivity.this).getAllOrders();
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
