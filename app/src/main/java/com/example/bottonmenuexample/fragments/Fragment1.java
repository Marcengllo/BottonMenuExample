package com.example.bottonmenuexample.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottonmenuexample.R;
import com.example.bottonmenuexample.adapterbangun;
import com.example.bottonmenuexample.lingkaran;
import com.example.bottonmenuexample.modelbangun;
import com.example.bottonmenuexample.persegi;
import com.example.bottonmenuexample.persegipanjang;
import com.example.bottonmenuexample.segitiga;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment implements adapterbangun.ItemClickListener {

    RecyclerView rvBangunDatar;
    List<modelbangun> listDataBangunDatar;
    adapterbangun adapter;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBangunDatar = view.findViewById(R.id.rvBangunDatar);
        listDataBangunDatar = new ArrayList<>();

        modelbangun persegi = new modelbangun();
        persegi.setNamaBangunn("Persegi");
        persegi.setImageBangun("https://t1.gstatic.com/licensed-image?q=tbn:ANd9GcQRMdhid5P1JGVYD9LWMrAy4qaRhLq0G5HOLkRvK6ORTI2-az7FWgB4M-IPYd1nGYoA");
        listDataBangunDatar.add(persegi);

        modelbangun persegipanjang = new modelbangun();
        persegipanjang.setNamaBangunn("Persegi Panjang");
        persegipanjang.setImageBangun("https://cdn0-production-images-kly.akamaized.net/Ndj6uHSUufXXhsB4tQ_Mt7hnaRY=/500x281/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3409131/original/045818300_1616496131-persegi_panjang.jpg");
        listDataBangunDatar.add(persegipanjang);

        modelbangun segitiga = new modelbangun();
        segitiga.setNamaBangunn("Segitiga");
        segitiga.setImageBangun("https://cdn0-production-images-kly.akamaized.net/HMlQZTZBi9T7WUSt6wXjJFv2sic=/500x667/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3471854/original/039486200_1622699012-sama_sisi.jpg");
        listDataBangunDatar.add(segitiga);

        modelbangun lingkaran = new modelbangun();
        lingkaran.setNamaBangunn("Lingkaran");
        lingkaran.setImageBangun("https://awsimages.detik.net.id/community/media/visual/2018/03/08/2e61153c-d96d-4c90-8bac-87ccf009245b.jpeg?w=600&q=90");
        listDataBangunDatar.add(lingkaran);

        rvBangunDatar.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new adapterbangun(listDataBangunDatar, getContext());
        rvBangunDatar.setAdapter(adapter);
        adapter.setClickListener(this);
    }

    @Override
    public void onItemClick(View view, int position) {
        modelbangun item = adapter.getItem(position);
        if (item.getNamaBangunn().equals("Persegi")) {
            Intent intent = new Intent(getActivity(), persegi.class);
            startActivity(intent);
        } else if (item.getNamaBangunn().equals("Persegi Panjang")) {
            Intent intent = new Intent(getActivity(), persegipanjang.class);
            startActivity(intent);
        } else if (item.getNamaBangunn().equals("Segitiga")) {
            Intent intent = new Intent(getActivity(), segitiga.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getActivity(), lingkaran.class);
            startActivity(intent);
        }
    }
}