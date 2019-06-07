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

public class NubankPagerAdapterItemFragment extends BaseFragment {

    public static GoNubankFragment newInstance() {
        GoNubankFragment fragment = new GoNubankFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pager_adapter_nubank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getView() != null) {


        }
    }
    @Override
    public String getTitle() {
        return "";
    }
}
