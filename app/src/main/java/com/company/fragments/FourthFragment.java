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

public class FourthFragment extends Fragment {
    private TextView fourth_textView;
    private Button fourth_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fourth_textView = view.findViewById(R.id.fourth_text_view);
        Bundle bundle = getArguments();
        String data2 = bundle.getString("text");
        fourth_textView.setText(data2);
        fourth_button = view.findViewById(R.id.btn_next4);
        fourth_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("text",fourth_textView.getText().toString());
                Fragment fragment = new FifthFragment();
                fragment.setArguments(bundle4);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).addToBackStack("").commit();

            }
        });
    }
}