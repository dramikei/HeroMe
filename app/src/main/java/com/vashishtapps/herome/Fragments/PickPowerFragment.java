package com.vashishtapps.herome.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.vashishtapps.herome.Activities.MainActivity;
import com.vashishtapps.herome.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PickPowerFragment.PickPowerInteractionListerner} interface
 * to handle interaction events.
 * Use the {@link PickPowerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PickPowerFragment extends Fragment implements View.OnClickListener {
    Button turtlePwr;
    Button lightningPwr;
    Button flightPwr;
    Button webPwr;
    Button laserPrw;
    Button strengthPwr;
    Button backStoryBtn;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private PickPowerInteractionListerner mListener;

    public PickPowerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PickPowerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PickPowerFragment newInstance(String param1, String param2) {
        PickPowerFragment fragment = new PickPowerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pick_power, container, false);
        turtlePwr = (Button) view.findViewById(R.id.turtlePwr);
        lightningPwr = (Button) view.findViewById(R.id.lightningPwr);
        flightPwr = (Button) view.findViewById(R.id.flightPwr);
        webPwr = (Button) view.findViewById(R.id.webPrw);
        laserPrw = (Button) view.findViewById(R.id.laserPrw);
        strengthPwr = (Button) view.findViewById(R.id.strengthPwr);
        backStoryBtn = (Button) view.findViewById(R.id.backStoryBtn);

        backStoryBtn.setEnabled(false);
        backStoryBtn.setAlpha(0.5f);

        turtlePwr.setOnClickListener(this);
        lightningPwr.setOnClickListener(this);
        flightPwr.setOnClickListener(this);
        webPwr.setOnClickListener(this);
        laserPrw.setOnClickListener(this);
        strengthPwr.setOnClickListener(this);


        backStoryBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.loadBackStoryScreen();
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {
        backStoryBtn.setAlpha(1);
        backStoryBtn.setEnabled(true);

        Button btn = (Button)view;
        int leftDrawable = 0;

        turtlePwr.setCompoundDrawablesWithIntrinsicBounds(R.drawable.turtle_power,0,0,0);
        lightningPwr.setCompoundDrawablesWithIntrinsicBounds(R.drawable.thors_hammer,0,0,0);
        flightPwr.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_man_crest,0,0,0);
        webPwr.setCompoundDrawablesWithIntrinsicBounds(R.drawable.spider_web,0,0,0);
        laserPrw.setCompoundDrawablesWithIntrinsicBounds(R.drawable.laser_vision,0,0,0);
        strengthPwr.setCompoundDrawablesWithIntrinsicBounds(R.drawable.super_strength,0,0,0);

        if (btn == turtlePwr) {
            leftDrawable = R.drawable.turtle_power;
        } else if (btn == lightningPwr) {
            leftDrawable = R.drawable.thors_hammer;
        } else if (btn == flightPwr) {
            leftDrawable = R.drawable.super_man_crest;
        } else if (btn == webPwr) {
            leftDrawable = R.drawable.spider_web;
        } else if (btn == laserPrw) {
            leftDrawable = R.drawable.laser_vision;
        } else if (btn == strengthPwr) {
            leftDrawable = R.drawable.super_strength;
        }
        btn.setCompoundDrawablesWithIntrinsicBounds(leftDrawable,0,R.drawable.item_selected,0);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onPickPowerFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof PickPowerInteractionListerner) {
            mListener = (PickPowerInteractionListerner) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface PickPowerInteractionListerner {
        // TODO: Update argument type and name
        void onPickPowerFragmentInteraction(Uri uri);
    }
}
