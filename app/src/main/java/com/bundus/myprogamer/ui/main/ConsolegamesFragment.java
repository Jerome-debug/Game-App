package com.bundus.myprogamer.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bundus.myprogamer.R;

public class ConsolegamesFragment extends Fragment {

    public static ConsolegamesFragment newInstance() {
        return new ConsolegamesFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.consolegames_fragment, container, false);

        return  view;
    }

}