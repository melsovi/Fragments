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

public class ThirdFragment extends Fragment {
    private TextView third_text_view;
    private Button third_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        third_text_view = view.findViewById(R.id.third_text_view);
        Bundle bundle = getArguments();
        String data3 = bundle.getString("text");
        third_text_view.setText(data3);
        third_button = view.findViewById(R.id.btn_next3);
        third_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("text",third_text_view.getText().toString());
                Fragment fragment = new FourthFragment();
                fragment.setArguments(bundle3);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack(null).commit();
            }
        });
    }
}