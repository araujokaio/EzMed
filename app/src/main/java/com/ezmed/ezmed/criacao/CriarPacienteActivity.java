//OK - Envio de dados Funcionando
package com.ezmed.ezmed.criacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Paciente;
import com.ezmed.ezmed.gerenciamento.GerenciarPacienteActivity;

public class CriarPacienteActivity extends Activity {

    private EditText nomeP,dataP,pesoP,alturaP;
    private Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_paciente);

        nomeP = (EditText) findViewById(R.id.criarPacienteTxtNome);
        dataP = (EditText) findViewById(R.id.criarPacienteTxtDataNascimento);
        pesoP = (EditText) findViewById(R.id.criarPacienteTxtPeso);
        alturaP = (EditText) findViewById(R.id.criarPacienteTxtAltura);
        botao = (Button) findViewById(R.id.testeBtnCriarPaciente);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Paciente objP = new Paciente();
                objP.setNomeP(nomeP.getText().toString());
                objP.setDataP(dataP.getText().toString());
                objP.setPesoP(Float.parseFloat(pesoP.getText().toString()));
                objP.setAlturaP(Float.parseFloat(alturaP.getText().toString()));

                Intent intent = new Intent(CriarPacienteActivity.this, GerenciarPacienteActivity.class);

                intent.putExtra("objP",objP);



                startActivity(intent);


            }
        });


    }
}
