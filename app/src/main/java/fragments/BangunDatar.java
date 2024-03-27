package fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.latihan31maret.R;

import bangunDatar.BelahKetupat;
import bangunDatar.jajargenjang;
import bangunDatar.Lingkaran;
import bangunDatar.Persegi;
import bangunDatar.PersegiPanjang;
import bangunDatar.Segitiga;

public class BangunDatar extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_bangun_datar, container, false);

        CardView cardViewLingkaran = rootView.findViewById(R.id.lingkaran);
        CardView cardViewPersegi = rootView.findViewById(R.id.persegi);
        CardView cardViewBelahKetupat = rootView.findViewById(R.id.belahketupat);
        CardView cardViewSegitiga = rootView.findViewById(R.id.segitiga);
        CardView cardViewPersegiPanjang = rootView.findViewById(R.id.persegipanjang);
        CardView cardViewJajarGenjang = rootView.findViewById(R.id.jajargenjang);

        cardViewLingkaran.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Lingkaran.class);
            startActivity(intent);
        });

        cardViewPersegi.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Persegi.class);
            startActivity(intent);
        });

        cardViewBelahKetupat.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BelahKetupat.class);
            startActivity(intent);
        });

        cardViewSegitiga.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Segitiga.class);
            startActivity(intent);
        });

        cardViewPersegiPanjang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PersegiPanjang.class);
            startActivity(intent);
        });

        cardViewJajarGenjang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), jajargenjang.class);
            startActivity(intent);
        });

        return rootView;
    }
}
