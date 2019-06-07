package br.com.jvictororiz.libs.ui.main.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.goibibo.libs.views.ScratchRelativeLayoutView;

import br.com.jvictororiz.libs.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class EsfregarViewFragment extends BaseFragment {
//    implementation 'com.goibibo.libs:scratchcardview:0.1.6'

    public static EsfregarViewFragment newInstance() {
        EsfregarViewFragment fragment = new EsfregarViewFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_esfregar, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getView() != null) {
            ScratchRelativeLayoutView scratchRelativeLayoutView = getView().findViewById(R.id.scratch_card);
            scratchRelativeLayoutView.setStrokeWidth(20);
            scratchRelativeLayoutView.setScratchView(R.layout.lyt_scratch);


            scratchRelativeLayoutView.setRevealListener(new ScratchRelativeLayoutView.IRevealListener() {
                @Override
                public void onRevealed(ScratchRelativeLayoutView tv) {
                    // on reveal
                }

                @Override
                public void onRevealPercentChangedListener(ScratchRelativeLayoutView siv, float percent) {
                    // on percent change
                }
            });
        }
    }

    @Override
    public String getTitle() {
        return "Esfregar view";
    }
}