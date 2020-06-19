package com.project.naima.project.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

import com.project.naima.project.BaseActivity;
import com.project.naima.project.Constant;
import com.project.naima.project.R;
import com.project.naima.project.SPUtil;
import com.project.naima.project.adapter.OrderAdapter;
import com.project.naima.project.pojo.Order;

import java.util.ArrayList;
import java.util.List;


public class StartedActivity extends BaseActivity implements OrderAdapter.OnClickOrderListener {
    private List<Order> mOrderInfos = new ArrayList<>();
    private List<Order> mStartedInfos = new ArrayList<>();
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
        if (SPUtil.getData(StartedActivity.this) != null) {

            mOrderInfos = SPUtil.getData(StartedActivity.this).getAllOrders();
            filterStartedOrders();
            listAdapter = new OrderAdapter(this, mStartedInfos, this);
            lvList.setAdapter(listAdapter);
            listAdapter.notifyDataSetChanged();
        } else {
            findViewById(R.id.tvNoOrders).setVisibility(View.VISIBLE);
        }
    }

    public void filterStartedOrders() {
        mStartedInfos.clear();
        for (int i = 0; i < mOrderInfos.size(); i++) {
            if (mOrderInfos.get(i).getStatus().equals("2"))
                mStartedInfos.add(mOrderInfos.get(i));
        }
        if (mStartedInfos.size() == 0)
            findViewById(R.id.tvNoOrders).setVisibility(View.VISIBLE);
    }

    @Override
    public void onClickOrder(View view, int index) {
        if (index < mStartedInfos.size()) { // bugtags #368 java.lang.IndexOutOfBoundsException
            Intent intent = new Intent(this, OrderDetailActivity.class);
            intent.putExtra(Constant.INTENT_EXTRA_ITEMINFO, mStartedInfos.get(index));
            startActivity(intent);
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
        if (SPUtil.getData(StartedActivity.this) != null) {

            mOrderInfos = SPUtil.getData(StartedActivity.this).getAllOrders();
            filterStartedOrders();
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

}
