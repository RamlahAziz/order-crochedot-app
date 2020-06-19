package com.project.naima.project.adapter;

/**
 * Created by C_v on 10/28/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.project.naima.project.R;
import com.project.naima.project.TagHelper;
import com.project.naima.project.pojo.Order;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Mohsin on 22/7/16.
 * <p>
 * This adapter is for both hot and followed
 */
public class OrderAdapter extends BaseAdapter {
    private OnClickOrderListener orderListListener;
    private List<Order> orderInfos;
    private LayoutInflater inflater;
    private Context context;

    public OrderAdapter(Context context, List<Order> orderInfos, OnClickOrderListener orderListListener) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        this.orderListListener = orderListListener;
        this.orderInfos = orderInfos;

    }

    @Override
    public int getCount() {
        return orderInfos.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder vh;
        if (view == null) {
            view = inflater.inflate(R.layout.layout_order_item, null);
            vh = new ViewHolder(view);
            TagHelper.setTag(view, TagHelper.TAG_VIEW_HOLDER, vh);
        } else {
            vh = (ViewHolder) TagHelper.getTag(view, TagHelper.TAG_VIEW_HOLDER);
            if (vh == null) {
                return view;
            }
        }

        Order orderInfo = orderInfos.get(i);

        /**
         * here the default image is being set as text
         * need to define key, the key determines the random color selected
         */
        /**
         * setting stretch mode for image view
         */
//        vh.ivImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
        /**
         * setting tile as image, tile size is the size for text image that is being set
         * key is user nickname
         */

        vh.tvName.setText(orderInfo.getCustomer_name());
        vh.tvPrice.setText(orderInfo.getPrice()+"$");
        vh.tvDescription.setText(orderInfo.getPrice()+"");

//        Glide.with(context)
//                .load(orderInfo.getImg())
//                .into(vh.ivImage);
        TagHelper.setTag(vh.cols, TagHelper.TAG_INDEX, i);

        vh.cols.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (orderListListener != null) {
                    orderListListener.onClickOrder(vh.cols, (int) TagHelper.getTag(vh.cols, TagHelper.TAG_INDEX));
                }
            }
        });



            return view;

    }

    public interface OnClickOrderListener {
        void onClickOrder(View view, int index);
    }



    static class ViewHolder {
        @BindView(R.id.llItem)
        LinearLayout cols;

        @BindView(R.id.tvName)
        TextView tvName;

        @BindView(R.id.tvPrice)
        TextView tvPrice;
        @BindView(R.id.tvDescription)
        TextView tvDescription;
        @BindView(R.id.ivImage)
        ImageView ivImage;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
