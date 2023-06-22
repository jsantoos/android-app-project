package com.example.carrent.ui.sobre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.carrent.R;
import com.example.carrent.databinding.FragmentSobreBinding;


public class SobreFragment extends Fragment {

    private FragmentSobreBinding binding;

    public SobreFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSobreBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.txtSobre.setText("Sobre nós");
        binding.txtSobreEmail.setText("Email:");
        binding.txtSobreEmailt.setText("AlugarCarros@gmail.com");
        binding.txtSobreRedes.setText("Redes Sociais");

        View fbLogo = view.findViewById(R.id.imageViewFacebookLogo);
        fbLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

        View instaLogo = view.findViewById(R.id.imageViewInstagramLogo);
        instaLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }

}