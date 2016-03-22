package com.github.paolorotolo.appintro;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

class PagerAdapter extends FragmentStatePagerAdapter {

    public static final String FRAGMENT_IDENTIFIER = "FRAGMENT_IDENTIFIER";

    protected List<Fragment> fragments;

    public PagerAdapter(FragmentManager fm, @NonNull List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

//    @Override
//    public long getItemId(int position) {
//        String id = getItem(position).getArguments().getString(FRAGMENT_IDENTIFIER, null);
//        if (id != null) {
//            return id.hashCode();
//        } else {
//            return super.getgetItemId(position);
//        }
//    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }

    @NonNull
    public List<Fragment> getFragments() {
        return fragments;
    }
}
