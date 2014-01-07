package io.renaud.dummy;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.renaud.dummylib.Test;

public class Dummy extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dummy);

        TextView tv = (TextView) findViewById(R.id.dummy);
        tv.setText(Test.THIS_IS_A_TEST);
    }
}
