package com.example.bottonmenuexample.fragments;
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
import android.widget.Toast;

import com.example.bottonmenuexample.R;
import com.example.bottonmenuexample.adapterbangun;
import com.example.bottonmenuexample.balok;
import com.example.bottonmenuexample.kerucut;
import com.example.bottonmenuexample.kubus;
import com.example.bottonmenuexample.lingkaran;
import com.example.bottonmenuexample.modelbangun;
import com.example.bottonmenuexample.persegi;
import com.example.bottonmenuexample.persegipanjang;
import com.example.bottonmenuexample.segitiga;
import com.example.bottonmenuexample.silinder;

import java.util.ArrayList;
import java.util.List;

public class Fragment2 extends Fragment implements adapterbangun.ItemClickListener {

    RecyclerView rvBangunRuang;
    List<modelbangun> listDataBangunDatar;
    adapterbangun adapter;
    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment2, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvBangunRuang = view.findViewById(R.id.rvBangunRuang);
        listDataBangunDatar = new ArrayList<>();

        modelbangun kubus = new modelbangun();
        kubus.setNamaBangunn("Kubus");
        kubus.setDescBangun("L = 2 × (pl + pt + lt)");
        kubus.setImageBangun("data:image/png;base64,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");
        listDataBangunDatar.add(kubus);

        modelbangun balok = new modelbangun();
        balok.setNamaBangunn("Balok");
        balok.setDescBangun("V = p × l × t.");
        balok.setImageBangun("https://asset-a.grid.id//crop/0x0:0x0/700x0/photo/2022/03/23/bangun-balokjpeg-20220323012813.jpeg");
        listDataBangunDatar.add(balok);

        modelbangun silinder = new modelbangun();
        silinder.setNamaBangunn("Silinder");
        silinder.setDescBangun("V = π R 2 H");
        silinder.setImageBangun("https://asset-a.grid.id//crop/0x0:0x0/700x0/photo/2022/03/29/tabungjpeg-20220329043914.jpeg");
        listDataBangunDatar.add(silinder);

        modelbangun kerucut = new modelbangun();
        kerucut.setNamaBangunn("Kerucut");
        kerucut.setDescBangun("V= 1/3 x π x r x r x t");
        kerucut.setImageBangun("https://cdn.medcom.id/dynamic/content/2023/08/15/1602595/pN0se1m6Sc.jpeg?w=480");
        listDataBangunDatar.add(kerucut);

        rvBangunRuang.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new adapterbangun(listDataBangunDatar, getContext());
        rvBangunRuang.setAdapter(adapter);
        adapter.setClickListener(this);
    }

    @Override
    public void onItemClick(View view, int position) {
        modelbangun item = adapter.getItem(position);
        if (item.getNamaBangunn().equals("Kubus")) {
            Intent intent = new Intent(getActivity(), kubus.class);
            startActivity(intent);
        } else if (item.getNamaBangunn().equals("Balok")) {
            Intent intent = new Intent(getActivity(), balok.class);
            startActivity(intent);
        } else if (item.getNamaBangunn().equals("Silinder")) {
            Intent intent = new Intent(getActivity(), silinder.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(getActivity(), kerucut.class);
            startActivity(intent);
        }
    }
}
