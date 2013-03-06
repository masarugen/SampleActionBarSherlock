
package me.gensan.android.sampleactionbarsherlock;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class SampleActionBarSherlockActivity extends SherlockActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sherlock);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_action_bar_sherlock);
    }

}
