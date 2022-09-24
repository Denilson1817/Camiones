package com.example.mybus;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class General_Adapter extends FragmentPagerAdapter {

    private List<Fragment> fragments =new ArrayList<>();
    private List<String> fragmentsTitles =new ArrayList<>();

    public General_Adapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return fragmentsTitles.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragments.add(fragment);
        fragmentsTitles.add(title);
    }
}
