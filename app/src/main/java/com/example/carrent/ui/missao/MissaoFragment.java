package com.example.carrent.ui.missao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carrent.R;
import com.example.carrent.databinding.FragmentMissaoBinding;

public class MissaoFragment extends Fragment {
    private FragmentMissaoBinding binding;
    public MissaoFragment() {

    }

    public static MissaoFragment newInstance(String param1, String param2) {
        MissaoFragment fragment = new MissaoFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMissaoBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }
}
