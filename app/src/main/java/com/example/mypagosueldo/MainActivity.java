package com.example.MyPagoSueldo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtHoras, txtDias;
    private CheckBox chbxdcto, chbxpago;
    private RadioGroup rgRedondeo, rgPago;
    private RadioButton btnLimpiar, btnCalcular;
    private TextView lbl_dcto, lbl_Pago;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHoras = (EditText)findViewById(R.id.txtHoras);
        txtDias = (EditText) findViewById(R.id.txtDias);
        chbxpago = (CheckBox) findViewById(R.id.chbxpago);
        chbxDcto = (CheckBox) findViewById(R.id.chbxdcto);
        rgRedondeo = (RadioGroup )findViewById(R.id.rgRedondeo);
        rbRedondeo = (RadioButton)findViewById(R.id.rbRedondeo);
        rbNoRedondeo = (RadioButton)findViewById(R.id.rbNoRedondeo);
        btnLimpiar = (Button)findViewById(R.id.btnLimpiar);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);
        lbl_dcto = (TextView) findViewById(R.id.lbl_dcto);
        lbl_Pago = (TextView) findViewById(R.id.lbl_Pago);
    }

    public void calcular (View view) {

        int horas = Integer.parseInt(txtHoras.getText().toString());
        int dias = Integer.parseInt(txtDias.getText().toString());
        int horas_mensuales = horas * dias;
        double pago = horas_mensuales * 10;
        double descuento = 0.00;
        double sueldo_base = 1000.00;

        if (chbxpago.isChecked() == true) {
            lbl_Pago.setText(String.valueOf(pago));
        }
        if (chbxdcto.isChecked() == true && pago > 1000) {
            lbl_Pago.setText(String.valueOf(pago));
        }
        if (rgRedondeo.getCheckedRadioButtonId() = R.id.rbRedondeo){
            int pago_redondeo = (int) Math.round(pago);
            lbl_Pago.setText(String.valueOf(pago_redondeo));
            int dcto_redondeo = (int) Math.round(descuento);
            lbl_dcto.setText(String.valueOf(dcto_redondeo));
        }
    }

    public void Limpiar (View view){

            if (btnLimpiar.isPressed() ==true) {

                txtDias.setText("");
                txtHoras.setText("");
            }
        }





    }
