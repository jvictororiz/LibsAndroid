package br.com.jvictororiz.libs.ui.main.dialogs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

import br.com.jvictororiz.libs.R;
import br.com.jvictororiz.libs.adapters.OurRecyclerviewAdapter;
import br.com.jvictororiz.libs.adapters.SectionsPagerAdapter;
import br.com.jvictororiz.libs.ui.main.fragments.BaseFragment;
import br.com.jvictororiz.libs.ui.main.fragments.EsfregarViewFragment;
import br.com.jvictororiz.libs.ui.main.fragments.NubankPagerAdapterItemFragment;
import br.com.jvictororiz.libs.ui.main.fragments.TinderCardsFragment;

public class NubankBottomSheetDialog extends SuperSheetPopup {
    private View v;
    private BaseFragment[] myFragments = {
            NubankPagerAdapterItemFragment.newInstance(),
            NubankPagerAdapterItemFragment.newInstance(),
            NubankPagerAdapterItemFragment.newInstance()
    };

    public NubankBottomSheetDialog(Context context) {
        super(context);
    }

    @Override
    protected View createView() {
        v = LayoutInflater.from(context).inflate(R.layout.layout_dialog_fragment, null);

        RecyclerView rvList = v.findViewById(R.id.rv_list);
        rvList.setAdapter(new OurRecyclerviewAdapter(R.layout.item_nubank));

        return v;
    }

    public void show(AppCompatActivity activity) {
        super.show();
//        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(activity.getSupportFragmentManager(), myFragments);
//        ViewPager viewPager = v.findViewById(R.id.view_pager);
//        viewPager.setAdapter(sectionsPagerAdapter);
    }
}
