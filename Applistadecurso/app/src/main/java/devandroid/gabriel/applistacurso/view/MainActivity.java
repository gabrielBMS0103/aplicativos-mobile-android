package devandroid.gabriel.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.gabriel.applistacurso.R;
import devandroid.gabriel.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    String dadosPessoa;

    EditText editPrimeiroNome;
    EditText editSobreNomeAluno;
    EditText editNomeCurso;
    EditText editTelefonedeContato;

    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir coteudo< dados, valores para Objeto
        //conforme o seu MODELO de TEMPLETE
        pessoa.setPrimeiroNome("Gabriel");
        pessoa.setSobreNome("Barbosa");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("19-996687952");

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNomeAluno = findViewById(R.id.editSobreNomeAluno);
        editNomeCurso = findViewById(R.id.editNomeCurso);
        editTelefonedeContato = findViewById(R.id.editTelefonedeContato);

        buttonLimpar = findViewById(R.id.btnLimpar);
        buttonSalvar = findViewById(R.id.btnSalvar);
        buttonFinalizar = findViewById(R.id.btnFinalizar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNomeAluno.setText(pessoa.getSobreNome());
        editNomeCurso.setText(pessoa.getCursoDesejado());
        editTelefonedeContato.setText(pessoa.getTelefoneContato());



        dadosPessoa ="Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa +=" sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa +=" telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();
        dadosPessoa +=" Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();

        Log.i("POOAndroid",pessoa.toString());

    }

}