package com.project.naima.project.pojo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Naema Asif on 12/31/2017.
 */

public class Order implements Parcelable {

    int ordernum, price;
    String customer_name;
    String customer_address;
    String details;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String phone;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;
    public Order(){

    }

    public Order(int ordernum,String phone, int price, String customer_name, String customer_address, String details,String status) {
        this.ordernum = ordernum;
        this.price = price;
        this.phone = phone;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.details = details;
        this.status = status;
    }


    public int getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public int describeContents() {
        return 0;
    }
    protected Order(Parcel in) {
        this.ordernum = in.readInt();
        this.price = in.readInt();
        this.customer_name = in.readString();
        this.phone = in.readString();
        this.customer_address = in.readString();
        this.details = in.readString();
        this.status = in.readString();
    }
    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.ordernum);
        parcel.writeInt(this.price);
        parcel.writeString(this.customer_name);
        parcel.writeString(this.phone);
        parcel.writeString(this.customer_address);
        parcel.writeString(this.details);
        parcel.writeString(this.status);
    }



    public static final Creator<Order> CREATOR = new Creator<Order>() {
        @Override
        public Order createFromParcel(Parcel source) {
            return new Order(source);
        }

        @Override
        public Order[] newArray(int size) {
            return new Order[size];
        }
    };
}
