//OK - Envio de dados funcionando

package com.ezmed.ezmed.criacao;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Cuidador;
import com.ezmed.ezmed.gerenciamento.GerenciarCuidadorActivity;

public class CriarCuidadorActivity extends Activity{

    private Button botaoC ;
    private EditText txtNomeC,txtCelC,txtEmailC,txtObsC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_cuidador);

        txtNomeC = (EditText) findViewById(R.id.criarCuidadorTxtNome);
        txtCelC = (EditText) findViewById(R.id.criarCuidadorTxtNumeroCelular);
        txtEmailC = (EditText) findViewById(R.id.criarCuidadorTxtEmail);
        txtObsC = (EditText) findViewById(R.id.criarCuidadorTxtObservacao);
        botaoC = (Button) findViewById(R.id.gerenciarCuidadorBtnCriarAtualizar);

        botaoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Cuidador objCuidador = new Cuidador();
                objCuidador.setNome(txtNomeC.getText().toString());
                objCuidador.setCel(txtCelC.getText().toString());
                objCuidador.setEmail(txtEmailC.getText().toString());
                objCuidador.setObservacao(txtObsC.getText().toString());


                Intent intent = new Intent(CriarCuidadorActivity.this,GerenciarCuidadorActivity.class);
                intent.putExtra("objC",objCuidador);

                startActivity(intent);

            }
        });







    }
}
