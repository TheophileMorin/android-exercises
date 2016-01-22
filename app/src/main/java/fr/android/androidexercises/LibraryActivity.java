package fr.android.androidexercises;

import android.app.FragmentManager;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LibraryActivity extends AppCompatActivity implements Step0Fragment.OnNextStep0Listener, Step1Fragment.OnNextStep1Listener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        boolean landscape = getResources().getBoolean(R.bool.landscape); //getResources().getBoolean(R.bool.landscape);
        if(landscape) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment0, new Step0Fragment(), Step0Fragment.class.getSimpleName())
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment1, new Step1Fragment(), Step1Fragment.class.getSimpleName())
                    .commit();
        } else {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment0, new Step0Fragment(), Step0Fragment.class.getSimpleName())
                    .commit();
            findViewById(R.id.fragment1).setVisibility(View.GONE); //Eviter la rémanance
        }
    }


    @Override
    public void on0Next() {
        // TODO replace Step1Fragment in containerFrameLayout
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment0, new Step1Fragment(), Step1Fragment.class.getSimpleName())
                .addToBackStack(Step0Fragment.class.getSimpleName())
                .commit();
    }

    @Override
    public void on1Next() {

    }

}
