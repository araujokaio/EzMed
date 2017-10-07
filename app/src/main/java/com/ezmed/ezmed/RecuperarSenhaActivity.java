package com.ezmed.ezmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.ezmed.util.Mensagem.exibirToastCurto;

public class RecuperarSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
    }

    public void clickVoltar(View view){
        limparCampos();
        irActivityLogin();
    }

    public void clickLimpar(View view){
        limparCampos();

        exibirToastCurto(RecuperarSenhaActivity.this, "Todos os campos limpos!");
    }

    private void irActivityLogin(){
        Intent i = new Intent(RecuperarSenhaActivity.this, LoginActivity.class);
        finish();
        startActivity(i);
    }

    private void limparCampos(){
        EditText txtEmailCelular = (EditText) findViewById(R.id.recuperarSenhaTxtEmailSenha);

        txtEmailCelular.setText("");
    }
}
