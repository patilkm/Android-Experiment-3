package com.example.communicatingfragments;

import static com.example.communicatingfragments.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlueFragment extends Fragment {
    private TextView mTextView;

    public BlueFragment() {
        // Required empty public constructor
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(layout.fragment_blue, container, false);
        mTextView = v.findViewById(id.textview);
        return v;
    }
    public void youveGotMail(String message) {
        mTextView.setText(message);
    }
}