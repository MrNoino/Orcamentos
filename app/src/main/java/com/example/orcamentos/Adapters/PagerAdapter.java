package com.example.orcamentos.Adapters;


import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.orcamentos.Fragments.TabFragmentWork;
import com.example.orcamentos.Fragments.TabFragmentMaterial;
import com.example.orcamentos.Fragments.TabFragmentInformation;

public class PagerAdapter  extends FragmentStateAdapter {

    private int mNumOfTabs;

    public PagerAdapter(Fragment fragment, int NumOfTabs) {
        super(fragment);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new TabFragmentInformation();
            case 1: return new TabFragmentMaterial();
            case 2: return new TabFragmentWork();
            default: return null;
        }
    }



    @Override
    public int getItemCount() {
        return this.mNumOfTabs;
    }
}
