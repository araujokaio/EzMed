package com.ezmed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ezmed.ezmed.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void clickEntrar(View view){
        //TODO Incluir metodo de validação de usuário e senha

        finish();

        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);
    }

    public void clickRegistrar(View view){
        limparCampos();
        irActivityRegistrar();
    }

    public void clickEsqueceuSenha(View view){
        limparCampos();
        irRecuperarSenha();
    }

    private void irActivityRegistrar(){
        Intent i = new Intent(LoginActivity.this, RegistrarActivity.class);
        startActivity(i);
    }

    private void irRecuperarSenha(){
        Intent i = new Intent(LoginActivity.this, RecuperarSenhaActivity.class);
        startActivity(i);
    }

    private void limparCampos(){
        EditText txtLogin = (EditText) findViewById(R.id.loginTxtLogin);
        EditText txtSenha = (EditText) findViewById(R.id.loginTxtSenha);

        txtLogin.setText("");
        txtSenha.setText("");
    }
}
