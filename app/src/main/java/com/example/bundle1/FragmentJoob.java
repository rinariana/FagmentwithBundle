package com.example.bundle1;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentJoob extends Fragment {

    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama,txtPekerjaan,txtLamaKerja;

    public FragmentJoob() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawaiNyaa=(Pegawai)bundle.getSerializable("bungkus2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fragment_joob,container,false);
        txtNama=(TextView)view.findViewById(R.id.txt_namajob);
        txtPekerjaan=(TextView)view.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja=(TextView)view.findViewById(R.id.txt_lamaKerja);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawaiNyaa.getNamanya());
        txtPekerjaan.setText(pegawaiNyaa.getPekerjaan());
        txtLamaKerja.setText(pegawaiNyaa.getLamaKerja());
    }
}


