package com.example.circularprogressdialog;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(MainActivity.this, R.style.circularProgress);

                dialog.setTitle("Progress Dialog");
                dialog.setMessage("Please wait...");
                dialog.show();
        //dialog.cancel();
    }
}
