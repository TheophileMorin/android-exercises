package fr.android.androidexercises;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Step1Fragment extends Fragment {

    private static final String step1 = "This is step 1";

    private TextView textView;
    private OnNextStep1Listener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnNextStep1Listener) context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_step1, container, false);
        textView = (TextView) view.findViewById(R.id.step1TextView);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView.setText(step1);
    }

    public interface OnNextStep1Listener {
        void on1Next();
    }

}
