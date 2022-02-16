package com.company.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FifthFragment extends Fragment {
    private TextView fifth_textView;
    private Button fifth_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fifth_textView = view.findViewById(R.id.fifth_text_view);
        fifth_button = view.findViewById(R.id.btn_next5);
        Bundle bundle = getArguments();
        String data1 = bundle.getString("text");
        fifth_textView.setText(data1);
    }
}