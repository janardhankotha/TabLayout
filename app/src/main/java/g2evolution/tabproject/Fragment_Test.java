package g2evolution.tabproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by G2evolution on 7/19/2016.
 */
public class Fragment_Test extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final    View rootView = inflater.inflate(R.layout.frage, container, false);


        return rootView;
    }
}
