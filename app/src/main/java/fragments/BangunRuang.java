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

import bangunRuang.Balok;
import bangunRuang.Bola;
import bangunRuang.Kerucut;
import bangunRuang.Kubus;
import bangunRuang.Tabung;
import bangunRuang.limassegitiga;

public class BangunRuang extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list_bangun_ruang, container, false);

        CardView cardViewBalok = rootView.findViewById(R.id.balok);
        CardView cardViewKubus = rootView.findViewById(R.id.kubus);
        CardView cardViewLimas = rootView.findViewById(R.id.limas);
        CardView cardViewKerucut = rootView.findViewById(R.id.kerucut);
        CardView cardViewTabung = rootView.findViewById(R.id.tabung);
        CardView cardViewBola = rootView.findViewById(R.id.bola);

        cardViewBalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Balok.class);
                startActivity(intent);
            }
        });

        cardViewKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kubus.class);
                startActivity(intent);
            }
        });

        cardViewLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), limassegitiga.class);
                startActivity(intent);
            }
        });

        cardViewKerucut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Kerucut.class);
                startActivity(intent);
            }
        });

        cardViewTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Tabung.class);
                startActivity(intent);
            }
        });

        cardViewBola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bola.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
