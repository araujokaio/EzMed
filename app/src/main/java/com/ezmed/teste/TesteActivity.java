package com.ezmed.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ezmed.LoginActivity;
import com.ezmed.MainActivity;
import com.ezmed.criacao.*;
import com.ezmed.gerenciamento.*;
import com.ezmed.ezmed.R;
import com.ezmed.RecuperarSenhaActivity;
import com.ezmed.RegistrarActivity;


public class TesteActivity extends AppCompatActivity
{

    Button btnCriarAlerta;
    Button btnCriarCuidador;
    Button btnCriarMedicamento;
    Button btnCriarPaciente;
    Button btnCriarTratamento;
    Button btnGerenciarCuidador;
    Button btnGerenciarMedicamento;
    Button btnGerenciarPaciente;
    Button btnGerenciarTratamento;
    Button btnLogin;
    Button btnMain;
    Button btnRecuperarSenha;
    Button btnRegistrar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_teste);

        setButtonsLocal();
        setOnClickListenerButtons();
    }

    private void setOnClickListenerButtons()
    {
        btnCriarAlerta.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), CriarAlertaActivity.class);
            startActivity(i);
        });

        btnCriarCuidador.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), CriarCuidadorActivity.class);
            startActivity(i);
        });

        btnCriarMedicamento.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), CriarMedicamentoActivity.class);
            startActivity(i);
        });

        btnCriarPaciente.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), CriarPacienteActivity.class);
            startActivity(i);
        });

        btnCriarTratamento.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), CriarTratamentoActivity.class);
            startActivity(i);
        });

        btnGerenciarCuidador.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), GerenciarCuidadorActivity.class);
            startActivity(i);
        });

        btnGerenciarMedicamento.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), GerenciarMedicamentoActivity.class);
            startActivity(i);
        });

        btnGerenciarPaciente.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), GerenciarPacienteActivity.class);
            startActivity(i);
        });

        btnGerenciarTratamento.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), GerenciarTratamentoActivity.class);
            startActivity(i);
        });

        btnLogin.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(i);
        });

        btnMain.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        });

        btnRecuperarSenha.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), RecuperarSenhaActivity.class);
            startActivity(i);
        });

        btnRegistrar.setOnClickListener((View v) ->
        {
            Intent i = new Intent(getApplicationContext(), RegistrarActivity.class);
            startActivity(i);
        });
    }

    private void setButtonsLocal()
    {
        btnCriarAlerta = (Button) findViewById(R.id.testeBtnCriarAlerta);
        btnCriarCuidador = (Button) findViewById(R.id.testeBtnCriarCuidador);
        btnCriarMedicamento = (Button) findViewById(R.id.testeBtnCriarMedicamento);
        btnCriarPaciente = (Button) findViewById(R.id.testeBtnCriarPaciente);
        btnCriarTratamento = (Button) findViewById(R.id.testeBtnCriarTratamento);
        btnGerenciarCuidador = (Button) findViewById(R.id.testeBtnGerenciarCuidador);
        btnGerenciarMedicamento = (Button) findViewById(R.id.testeBtnGerenciarMedicamento);
        btnGerenciarPaciente = (Button) findViewById(R.id.testeBtnGerenciarPaciente);
        btnGerenciarTratamento = (Button) findViewById(R.id.testeBtnGerenciarTratamento);
        btnLogin = (Button) findViewById(R.id.testeBtnLogin);
        btnMain = (Button) findViewById(R.id.testeBtnMain);
        btnRecuperarSenha = (Button) findViewById(R.id.testeBtnRecuperarSenha);
        btnRegistrar = (Button) findViewById(R.id.testeBtnRegistrar);
    }
}
