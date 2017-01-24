package fr.lab.bbox.bboxapirunner.Application;

import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.lab.bbox.bboxapirunner.R;

/**
 * Created by AlexandreBigot on 24/01/2017.
 */

public class DemoApprentissage extends Fragment {

    private final static String TAG = "DEMO_APPRENTISSAGE";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
        String ip = sharedPref.getString("bboxip", "");
        Log.i("x-session", ip);
        return inflater.inflate(R.layout.apprentissage_layout, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
