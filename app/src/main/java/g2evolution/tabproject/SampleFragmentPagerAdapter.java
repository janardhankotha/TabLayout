package g2evolution.tabproject;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by G2evolution on 7/19/2016.
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 8;
    private String tabTitles[] = new String[] { "Standard", "Classic", "Platinum" , "Diamond", "Standard", "Classic", "Platinum" , "Diamond"};
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                // Top Rated fragment activity
                return new Description_Fragment();
            case 1:
                // Games fragment activity
                return new Fragment_Test();
            case 2:
                // Movies fragment activity
                return new Description_Fragment();
            case 3:
                // Top Rated fragment activity
                return new Description_Fragment();
            case 4:
                // Games fragment activity
                return new Fragment_Test();
            case 5:
                // Movies fragment activity
                return new Description_Fragment();
            case 6:
                // Top Rated fragment activity
                return new Description_Fragment();
            case 7:
                // Games fragment activity
                return new Fragment_Test();


        }

        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}