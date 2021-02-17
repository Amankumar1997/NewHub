package com.example.newshub;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter  extends FragmentPagerAdapter {
    private final Context mycontext;
    int totaltab;

    public MyAdapter(Context context, FragmentManager fragmentManager,int totaltab)
    {
        super(fragmentManager);
this.totaltab=totaltab;
        mycontext = context;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {

            case 0:
                EnglishFragment english=new EnglishFragment();
                return english;
            case 1:
                HindiFragment hindi=new HindiFragment();
                return  hindi;
            case 2:
                LiveFragment liveFragment=new LiveFragment();
                return liveFragment;


            default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return totaltab;
    }
}
