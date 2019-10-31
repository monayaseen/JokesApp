package com.udacity.gradle.builditbigger;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivityFragment extends Fragment {
    @BindView(R.id.indic_prog) @Nullable() ProgressBar indicator_progressbar;
    @BindView(R.id.btn_joke) @Nullable()
    Button mJokeBtn;
    public MainActivityFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        ButterKnife.bind(this, view);
        ButterKnife.setDebug(true);

        mJokeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                indicator_progressbar.setVisibility(View.VISIBLE);
                ((MainActivity)getActivity()).tellJoke();
            }
        });
        return view;
    }
}
