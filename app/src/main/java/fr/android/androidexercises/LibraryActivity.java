package fr.android.androidexercises;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity implements Step0Fragment.OnNextStep0Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // TODO replace Step0Fragment in containerFrameLayout
        getSupportFragmentManager().beginTransaction().replace(R.id.containerFrameLayout,new Step0Fragment(), Step0Fragment.class.getSimpleName()).commit();
    }

    // TODO implement onNext() from Step0Fragment.OnNextStep0Listener
    @Override
    public void onNext() {
        getSupportFragmentManager().beginTransaction().addToBackStack(Step1Fragment.class.getSimpleName()).replace(R.id.containerFrameLayout,new Step1Fragment(), Step1Fragment.class.getSimpleName()).commit();    }
}
