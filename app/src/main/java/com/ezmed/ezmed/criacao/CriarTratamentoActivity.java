package com.ezmed.ezmed.criacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Tratamento;
import com.ezmed.ezmed.gerenciamento.GerenciarTratamentoActivity;

public class CriarTratamentoActivity extends Activity {
    private EditText txtMed,txtDose,txtDataI,txtDataF;
    private Spinner spTipo;
    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_tratamento);

        txtMed = (EditText) findViewById(R.id.criarTratamentoTxtMedicamento);
        txtDose = (EditText) findViewById(R.id.criarTratamentoTxtDose);
        txtDataI = (EditText) findViewById(R.id.criarTratamentoTxtDataInicio);
        txtDataF = (EditText) findViewById(R.id.criarTratamentoTxtDataFim);
        spTipo = (Spinner) findViewById(R.id.criarTratamentoSpnTipoDose);
        botao = (Button) findViewById(R.id.criarTratamentoBtnCriarAtualizar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tratamento objT = new Tratamento();
                objT.setNomeMed(txtMed.getText().toString());
                objT.setDoseMed(txtDose.getText().toString());
                objT.setDataI(txtDataI.getText().toString());
                objT.setDataF(txtDataF.getText().toString());
                objT.setCbTipo(spTipo.getSelectedItem().toString());

                Intent intent = new Intent(CriarTratamentoActivity.this, GerenciarTratamentoActivity.class);
                intent.putExtra("objT",objT);
                startActivity(intent);
            }
        });



    }
}
