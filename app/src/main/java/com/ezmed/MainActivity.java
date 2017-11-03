package com.ezmed;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.ezmed.ezmed.R;
import com.ezmed.adapters.AlertaAdapter;
import com.ezmed.criacao.CriarCuidadorActivity;
import com.ezmed.criacao.CriarMedicamentoActivity;
import com.ezmed.criacao.CriarPacienteActivity;
import com.ezmed.criacao.CriarTratamentoActivity;
import com.ezmed.gerenciamento.GerenciarCuidadorActivity;
import com.ezmed.gerenciamento.GerenciarMedicamentoActivity;
import com.ezmed.gerenciamento.GerenciarPacienteActivity;
import com.ezmed.gerenciamento.GerenciarTratamentoActivity;
import com.ezmed.util.Mensagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Intent i;
    private Toolbar toolbar;
    private ListView lvAlarmes;
    private List<com.ezmed.dto.Alerta> listaAlarmes;
    AlertaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createSideBar();

        lvAlarmes = (ListView) findViewById(R.id.mainLvAlarme);

        listaAlarmes = generateData();

        adapter = new AlertaAdapter(getApplicationContext(), listaAlarmes);
        lvAlarmes.setAdapter(adapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(toggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    private void createSideBar()
    {
        navigationView = (NavigationView) findViewById(R.id.navView);

        toolbar = (Toolbar) findViewById(R.id.nav_action);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.mainDrawerLayout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setButtonActionMenu();
    }

    private void setButtonActionMenu()
    {
        navigationView.setNavigationItemSelectedListener((MenuItem menuItem) ->
        {
            switch (menuItem.getItemId())
            {
                case R.id.nav_criar_cuidador:
                    i = new Intent(getApplicationContext(), CriarCuidadorActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_criar_medicamento:
                    i = new Intent(getApplicationContext(), CriarMedicamentoActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_criar_paciente:
                    i = new Intent(getApplicationContext(), CriarPacienteActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_criar_tratamento:
                    i = new Intent(getApplicationContext(), CriarTratamentoActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_gerenciar_cuidador:
                    i = new Intent(getApplicationContext(), GerenciarCuidadorActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_gerenciar_medicamento:
                    i = new Intent(getApplicationContext(), GerenciarMedicamentoActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_gerenciar_paciente:
                    i = new Intent(getApplicationContext(), GerenciarPacienteActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_gerenciar_tratamento:
                    i = new Intent(getApplicationContext(), GerenciarTratamentoActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_farmacia:
                    i = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_historico:
                    i = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(i);
                    break;
                case R.id.nav_configuracao:
                    i = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(i);
                    break;
            }
            return true;
        });
    }

    private ArrayList<com.ezmed.dto.Alerta> generateData()
    {
        ArrayList<com.ezmed.dto.Alerta> listaAlarmes = new ArrayList<>();

        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());
        listaAlarmes.add(com.ezmed.util.Ferramentas.gerarAlertaRandomico());

        return listaAlarmes;
    }
}
