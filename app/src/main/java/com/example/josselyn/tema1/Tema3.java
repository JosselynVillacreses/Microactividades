package com.example.josselyn.tema1;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Tema3 extends AppCompatActivity {

    private Button mOpenDialog;
    private Button abrir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tema3);





    }


    public void AbrirDialog(View view) {
        FragmentManager manager = getSupportFragmentManager();
        Tema3_dialog dialog = new Tema3_dialog();
        dialog.show(manager, "MyDialog");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}
