package com.example.josselyn.tema1;

import android.app.Dialog;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tema3_dialog extends DialogFragment {

    private TextView ok_btn;
    private TextView cancel_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_tema3_dialog, null);

        cancel_btn = view.findViewById(R.id.action_cancel);
        ok_btn = view.findViewById(R.id.action_ok);


        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getDialog().dismiss();
            }
        });



        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getDialog().dismiss();
            }
        });

        return view;
    }


    /* @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_tema3_dialog, container, false);
        cancel_btn = view.findViewById(R.id.action_cancel);
        ok_btn = view.findViewById(R.id.action_ok);


        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dialog", "onClick: closing dialog");
                getDialog().dismiss();
            }
        });



        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dialog", "onClick: capturing input");
                *//*Intent intent = new Intent(Tema3_dialog.this, Tema3.class);
                startActivity(intent);
*//*
                getDialog().dismiss();
            }
        });




        return view;
    }
*/

}
