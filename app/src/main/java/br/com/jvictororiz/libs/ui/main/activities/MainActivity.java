package br.com.jvictororiz.libs.ui.main.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import br.com.jvictororiz.libs.R;
import br.com.jvictororiz.libs.ui.main.fragments.BaseFragment;
import br.com.jvictororiz.libs.ui.main.fragments.EsfregarViewFragment;
import br.com.jvictororiz.libs.adapters.SectionsPagerAdapter;
import br.com.jvictororiz.libs.ui.main.fragments.GoNubankFragment;
import br.com.jvictororiz.libs.ui.main.fragments.TinderCardsFragment;

public class MainActivity extends AppCompatActivity {

    private BaseFragment[] myFragments = {
            EsfregarViewFragment.newInstance(),
            TinderCardsFragment.newInstance(),
            GoNubankFragment.newInstance()
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager(), myFragments);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }
}