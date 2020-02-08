package com.haanhgs.livedrawing;

import android.app.Activity;
import android.os.Bundle;

//test
public class LiveDrawingActivity extends Activity {

    private DrawingView drawingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawingView = new DrawingView(this);
        setContentView(drawingView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        drawingView.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        drawingView.pause();
    }
}
