//OK - Envio de dados funcionando
package com.ezmed.ezmed.criacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Alerta;
import com.ezmed.ezmed.gerenciamento.GerenciarAlertaActivity;

public class CriarAlertaActivity extends Activity {

    private EditText horaI,cuidador,tratamento,paciente,observacao;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_alerta);

        horaI = (EditText) findViewById(R.id.criarAlertaTxtHoraInicial);
        cuidador = (EditText) findViewById(R.id.criarAlertaTxtCuidador);
        tratamento = (EditText) findViewById(R.id.criarAlertaTxtTratamento);
        paciente = (EditText) findViewById(R.id.criarAlertaTxtPaciente);
        observacao = (EditText) findViewById(R.id.criarAlertaTxtObservacao);
        botao = (Button) findViewById(R.id.criarAlertaBtnCriarAlerta);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Alerta objA = new Alerta();
                objA.setHoraIA(horaI.getText().toString());
                objA.setCuidadorA(cuidador.getText().toString());
                objA.setTratamentoA(tratamento.getText().toString());
                objA.setPacienteA(paciente.getText().toString());
                objA.setObservacaoA(observacao.getText().toString());

                Intent intent = new Intent(CriarAlertaActivity.this,GerenciarAlertaActivity.class);
                intent.putExtra("objA",objA);
                startActivity(intent);

            }
        });









    }
}
