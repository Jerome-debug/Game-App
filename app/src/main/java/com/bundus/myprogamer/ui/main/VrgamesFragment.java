package com.bundus.myprogamer.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bundus.myprogamer.R;
import com.bundus.myprogamer.ReceiptActivity;

public class VrgamesFragment extends Fragment {


    public static VrgamesFragment newInstance() {
        return new VrgamesFragment();
    }

    ImageView vrcart1, vrcart2, vrcart3, vrcart4, vrcart5, vrcart6;
    View view;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.vrgames_fragment, container, false);
        vrcart1 = view.findViewById(R.id.vr_cart1);
        vrcart2 = view.findViewById(R.id.vr_cart2);
        vrcart3 = view.findViewById(R.id.vr_cart3);
        vrcart4 = view.findViewById(R.id.vr_cart4);
        vrcart5 = view.findViewById(R.id.vr_cart5);
        vrcart6 = view.findViewById(R.id.vr_cart6);

        vrcart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        }); return view;
    }
}




