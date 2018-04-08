package com.hugopinto.subneteoip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private TextView edit1;
    private EditText edit2;
    private EditText edit3;
    private EditText edit4;
    private EditText edit5;

    private Button procesar;

    private TextView ntid;
    private TextView brdcst;
    private TextView cip;
    private TextView prthst;
    private TextView prtrd;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        procesar = findViewById(R.id.btn);

    procesar.setOnClickListener(new View.OnClickListener(){
        @Override

        public void onClick(View v){
            int leng1, leng2, leng3, leng4, leng5, n1, n2, n3, n4, n5, b1, b2, b3, b4, b5, cantidadip, aux1, aux2;


            edit1 = findViewById(R.id.et1);
            edit2 = findViewById(R.id.et2);
            edit3 = findViewById(R.id.et3);
            edit4 = findViewById(R.id.et4);
            edit5 = findViewById(R.id.et5);
            ntid=findViewById(R.id.netid);
            brdcst=findViewById(R.id.broadcast);
            prthst=findViewById(R.id.partehost);
            prtrd=findViewById(R.id.partered);
            cip=findViewById(R.id.cantip);

            leng1 = edit1.getText().length();
            leng2 = edit2.getText().length();
            leng3 = edit3.getText().length();
            leng4 = edit4.getText().length();
            leng5 = edit5.getText().length();



            if(leng1==0 || leng2==0 || leng3==0 || leng4==0 || leng5==0){
                Toast.makeText(getApplicationContext(),"Por favor, ingrese todos los datos",Toast.LENGTH_SHORT).show();
            }
            else{
                n1 = Integer.parseInt(edit1.getText().toString());
                n2 = Integer.parseInt(edit2.getText().toString());
                n3 = Integer.parseInt(edit3.getText().toString());
                n4 = Integer.parseInt(edit4.getText().toString());
                n5 = Integer.parseInt(edit5.getText().toString());

                if(n1>255 || n2>255 || n3>255 || n4>255 || n5>32){
                    Toast.makeText(getApplicationContext(),"Por favor, ingrese correctamente los datos",Toast.LENGTH_SHORT).show();

                }
                else{
                    if(n5==0){
                        b1 = n1 & 0;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 255;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");


                        prtrd.setText("-");
                        prthst.setText(n1+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==1){
                        b1 = n1 & 128;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 127;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-1);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 128;
                        aux2=n1 & 127;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==2){
                        b1 = n1 & 192;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 191;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-2);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 192;
                        aux2=n1 & 63;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==3){
                        b1 = n1 & 224;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 223;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-3);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 224;
                        aux2=n1 & 31;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==4){
                        b1 = n1 & 240;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 239;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-4);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 240;
                        aux2=n1 & 15;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==5){
                        b1 = n1 & 248;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 247;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 248;
                        aux2=n1 & 7;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==6){
                        b1 = n1 & 252;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 251;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-6);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 252;
                        aux2=n1 & 3;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }
                    if(n5==7){
                        b1 = n1 & 254;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 253;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-7);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 254;
                        aux2=n1 & 1;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);



                    }

                    if(n5==8){
                        b1 = n1 & 255;
                        b2 = n2 & 0;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 255;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-8);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n1 & 255;
                        aux2=n1 & 0;

                        prtrd.setText(aux1+"");
                        prthst.setText(aux2+"."+n2+"."+n3+"."+n4);

                    }
                    if(n5==9){
                        b1 = n1 & 255;
                        b2 = n2 & 128;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 127;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-9);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 128;
                        aux2=n2 & 127;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==10){
                        b1 = n1 & 255;
                        b2 = n2 & 192;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 191;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-10);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 192;
                        aux2=n2 & 63;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==11){
                        b1 = n1 & 255;
                        b2 = n2 & 224;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 223;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-11);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 224;
                        aux2=n2 & 31;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==12){
                        b1 = n1 & 255;
                        b2 = n2 & 240;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 239;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-12);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 240;
                        aux2=n2 & 15;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==13){
                        b1 = n1 & 255;
                        b2 = n2 & 248;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 247;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-13);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 248;
                        aux2=n2 & 7;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==14){
                        b1 = n1 & 255;
                        b2 = n2 & 252;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 251;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-14);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 252;
                        aux2=n2 & 3;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==15){
                        b1 = n1 & 255;
                        b2 = n2 & 254;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 253;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-15);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 254;
                        aux2=n2 & 1;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(aux2+"."+n3+"."+n4);

                    }
                    if(n5==16){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 0;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 255;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-16);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n2 & 255;
                        aux2=n2 & 0;

                        prtrd.setText(n1+"."+aux1+"");
                        prthst.setText(n3+"."+n4);

                    }
                    if(n5==17){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 128;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 127;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-17);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 128;
                        aux2=n3 & 127;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==18){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 192;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 191;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-18);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 192;
                        aux2=n3 & 63;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==19){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 224;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 223;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-19);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 224;
                        aux2=n3 & 31;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==20){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 240;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 239;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-20);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 240;
                        aux2=n3 & 15;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==21){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 248;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 247;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 248;
                        aux2=n3 & 7;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==22){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 252;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 251;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 252;
                        aux2=n3 & 3;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==23){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 254;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 253;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 254;
                        aux2=n3 & 1;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"."+n4);

                    }
                    if(n5==24){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 0;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 255;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n3 & 255;
                        aux2=n3 & 0;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(n4+"");

                    }
                    if(n5==25){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 128;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 127;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 128;
                        aux2=n4 & 127;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==26){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 192;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 191;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 192;
                        aux2=n4 & 63;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==27){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 224;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 223;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 224;
                        aux2=n4 & 31;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==28){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 240;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 239;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 240;
                        aux2=n4 & 15;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==29){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 248;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 247;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 248;
                        aux2=n4 & 7;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==30){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 252;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 251;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 252;
                        aux2=n4 & 3;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }

                    if(n5==31){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 254;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 253;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-2;

                        cip.setText(cantidadip+"");

                        aux1=n4 & 254;
                        aux2=n4 & 1;

                        prtrd.setText(n1+"."+n2+"."+aux1+"");
                        prthst.setText(aux2+"");

                    }
                    if(n5==32){
                        b1 = n1 & 255;
                        b2 = n2 & 255;
                        b3 = n3 & 255;
                        b4 = n4 & 255;

                        ntid.setText(b1+"."+b2+"."+b3+"."+b4);

                        b1 = n1 | 0;
                        b2 = n2 | 0;
                        b3 = n3 | 0;
                        b4 = n4 | 0;

                        brdcst.setText(b1+"."+b2+"."+b3+"."+b4);

                        cantidadip=(int)Math.pow(2,32-n5);
                        cantidadip=cantidadip-1;

                        cip.setText(cantidadip+"");


                        prtrd.setText(n1+"."+n2+"."+n3+"."+n4);
                        prthst.setText("-");

                    }




                }
            }
        }








    });

    }
}
