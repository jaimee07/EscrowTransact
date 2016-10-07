package com.escrowwidget.root.escrowtransactreal;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //set credentials
        String usernameGmail = "jaimeema20@gmail.com";
        String passwordGmail = "Freelancer1";




        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
