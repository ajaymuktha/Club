package com.example.fountaneclub;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class WebDevelopment extends AppCompatActivity {

    TextView txt_pathShow;
    Button  btn_filepicker;
    Intent myFileIntent;


    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_development);

        Button button2 = (Button) findViewById(R.id.git);

        txt_pathShow  = (TextView)findViewById(R.id.format);
        btn_filepicker = (Button)findViewById(R.id.upload);

    myDialog = new Dialog(this);


    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent  int1 = new Intent(WebDevelopment.this,GitamWeb.class);
            startActivity(int1);
        }
    });


    }


    public void showpopup(View v) {
        TextView txtclose;
        Button checkstatus;
        myDialog.setContentView(R.layout.applicationsub);
        txtclose = (TextView) myDialog.findViewById(R.id.txtclose);
        checkstatus = (Button) myDialog.findViewById(R.id.checkstatus);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();



        btn_filepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myFileIntent = new Intent(Intent.ACTION_GET_CONTENT);
                myFileIntent.setType("*/*");
                startActivityForResult(myFileIntent,10);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        switch (requestCode) {

            case 10:
                if (resultCode == RESULT_OK)
                {
                    String path = data.getData().getPath();
                    txt_pathShow.setText(path);




                }
                break;
        }
    }
}
