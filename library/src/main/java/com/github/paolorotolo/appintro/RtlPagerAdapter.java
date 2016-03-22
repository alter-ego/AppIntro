package com.github.paolorotolo.appintro;


import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.List;

public class RtlPagerAdapter extends PagerAdapter {
    public RtlPagerAdapter(FragmentManager fm, @NonNull List<Fragment> fragments) {
        super(fm, fragments);
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(fragments.size()-1-position);
    }
}
