package com.jianghu.jh.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jianghu.jh.R;

public class OrderStatusFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static OrderStatusFragment newInstance(int position) {
        OrderStatusFragment f = new OrderStatusFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
        View rootView = inflater.inflate(R.layout.fragment_order_status, container, false);



        return rootView;
    }
}