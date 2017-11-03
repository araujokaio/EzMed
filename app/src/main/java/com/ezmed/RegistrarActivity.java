package com.ezmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ezmed.ezmed.R;

import static com.ezmed.util.Mensagem.exibirToastCurto;

public class RegistrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
    }

    public void clickVoltar(View view){
        limparCampos();
        irActivityLogin();
    }

    public void clickLimpar(View view){
        limparCampos();

        exibirToastCurto(RegistrarActivity.this, "Todos os campos limpos!");
    }

    private void irActivityLogin(){
        Intent i = new Intent(RegistrarActivity.this, LoginActivity.class);
        finish();
        startActivity(i);
    }

    private void limparCampos(){
        EditText txtNomeCompleto = (EditText) findViewById(R.id.registrarNomeCompleto);
        EditText txtUsuario = (EditText) findViewById(R.id.registrarTxtUsuario);
        EditText txtEmail = (EditText) findViewById(R.id.registrarTxtEmail);
        EditText txtSenha = (EditText) findViewById(R.id.registrarTxtSenha);
        EditText txtCelular = (EditText) findViewById(R.id.registrarTxtCelular);

        txtNomeCompleto.setText("");
        txtUsuario.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        txtCelular.setText("");
    }
}
