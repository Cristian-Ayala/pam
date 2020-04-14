package uesocc.edu.sv.ipam;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import org.mozilla.javascript.ScriptableObject;

public class MainActivity extends AppCompatActivity {
    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve;
    Button btnSuma, btnMultiplica, btnClean, btnBorrar, btnPunto, btnIgual;
    ImageButton btnResta, btnDivide, btnRaiz, btnCuadrado, modalOff;
    TextView Resultado, Ops;
    String operador, mostrar, reserva;
    LinearLayout modalOn;
    LayoutInflater layoutInflater;
    View layout;
    PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutInflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        layout = layoutInflater.inflate(R.layout.modal, null);
        popupWindow = new PopupWindow(layout, ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);
        modalOn = (LinearLayout) findViewById(R.id.modal);
        modalOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);
            }
        });



        modalOn.post(new Runnable(){
            @Override
            public void run() {
                modalOn.performClick();
            }
        });
//        popupWindow.showAtLocation(this.findViewById(R.id.Cuadrado), Gravity.CENTER, 0, 0);
//        popupWindow.showAtLocation(getWindow().findViewById(android.R.id.button3), Gravity.CENTER, 0, 0);
        modalOff = (ImageButton) layout.findViewById(R.id.modalShow);
        modalOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });


        btnCero = (Button) findViewById(R.id.Cero);
        btnUno = (Button) findViewById(R.id.Uno);
        btnDos = (Button) findViewById(R.id.Dos);
        btnTres = (Button) findViewById(R.id.Tres);
        btnCuatro = (Button) findViewById(R.id.Cuatro);
        btnCinco = (Button) findViewById(R.id.Cinco);
        btnSeis = (Button) findViewById(R.id.Seis);
        btnSiete = (Button) findViewById(R.id.Siete);
        btnOcho = (Button) findViewById(R.id.Ocho);
        btnNueve = (Button) findViewById(R.id.Nueve);
        btnSuma = (Button) findViewById(R.id.Suma);
        btnResta = (ImageButton) findViewById(R.id.Resta);
        btnMultiplica = (Button) findViewById(R.id.Multiplica);
        btnDivide = (ImageButton) findViewById(R.id.Division);
        btnRaiz = (ImageButton) findViewById(R.id.Raiz);
        btnCuadrado = (ImageButton) findViewById(R.id.Cuadrado);
        btnClean = (Button) findViewById(R.id.Clean);
        btnBorrar = (Button) findViewById(R.id.Delete);
        Resultado = (TextView) findViewById(R.id.OpsText);
        Ops = (TextView) findViewById(R.id.Total);
        btnPunto = (Button) findViewById(R.id.Punto);
        btnIgual = (Button) findViewById(R.id.Igual);


        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "0";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "1";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "2";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "3";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "4";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "5";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "6";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "7";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "8";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                mostrar = mostrar + "9";
                Resultado.setText(mostrar);
                procesar();
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "+");
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "-");
            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "*");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "/");
            }
        });

        btnRaiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "^0.5");
            }
        });

        btnCuadrado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + "^2");
            }
        });


        btnPunto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Resultado.setText(Resultado.getText().toString() + ".");
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = "";
                Resultado.setText(mostrar);
                Ops.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mostrar = Resultado.getText().toString();
                Resultado.setText(!mostrar.isEmpty() ? mostrar.substring(0, mostrar.length() - 1) : mostrar);
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                procesar();
                Resultado.setText("");
            }
        });

    }

    public void procesar(){
        if (!"".equals(Resultado.getText().toString().trim())) {
            org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
            // turn off optimization to work with android
            rhino.setOptimizationLevel(-1);
            String res = Resultado.getText().toString().replaceAll("(-?\\d+(?:\\.\\d+)?)\\^(-?\\d+(?:\\.\\d+)?)", "Math.pow($1,$2)");

            try {
                ScriptableObject scope = rhino.initStandardObjects();
                String result = rhino.evaluateString(scope, res, "JavaScript", 1, null).toString();
                Ops.setText(String.valueOf(result));

            } catch (Exception e) {

            } finally {
                org.mozilla.javascript.Context.exit();
            }
        }
    }
}
