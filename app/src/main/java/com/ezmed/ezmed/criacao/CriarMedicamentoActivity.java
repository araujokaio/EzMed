//OK - Envio de dados funcionando
package com.ezmed.ezmed.criacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import com.ezmed.ezmed.R;
import com.ezmed.ezmed.classes.Medicamento;
import com.ezmed.ezmed.gerenciamento.GerenciarMedicamentoActivity;

public class CriarMedicamentoActivity extends AppCompatActivity {

    private EditText txtMed;
    private Spinner tipoMed;
    private Button botaoMed;
    private CheckBox cbMed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_medicamento);

        EditText txtMed = (EditText) findViewById(R.id.criarMedicamentoTxtNome);
        Spinner tipoMed = (Spinner) findViewById(R.id.criarMedicamentoSpnTipo);
        CheckBox cbMed = (CheckBox) findViewById(R.id.criarMedicamentoChkEnviarSugestao);
        Button botaoMed = (Button) findViewById(R.id.criarMedicamentoBtnCriarAtualizar);




        botaoMed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Medicamento objMed = new Medicamento();
                objMed.setNomeMed(txtMed.getText().toString());
                objMed.setTipoMed(tipoMed.getSelectedItem().toString());
                objMed.setCbStatus(cbMed.isSelected()); //Verificar tipo return.

                Intent intent = new Intent(CriarMedicamentoActivity.this, GerenciarMedicamentoActivity.class);

                intent.putExtra("objMed",objMed);

                startActivity(intent);
            }
        });




    }
}
