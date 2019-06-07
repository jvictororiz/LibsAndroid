package br.com.jvictororiz.libs.ui.main.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import br.com.jvictororiz.libs.R;
import br.com.jvictororiz.libs.ui.main.activities.TelaNubankActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class GoNubankFragment extends BaseFragment {

//    implementation 'com.github.nihad92:SwipeableCards:1.0.19'

    public static GoNubankFragment newInstance() {
        GoNubankFragment fragment = new GoNubankFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_go_nubank_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getView() != null) {
            getView().findViewById(R.id.tv_go_nubank).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(), TelaNubankActivity.class));
                }
            });

        }
    }

    @Override
    public String getTitle() {
        return "Go nubank view";
    }
}