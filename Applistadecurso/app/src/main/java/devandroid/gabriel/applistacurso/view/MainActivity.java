package devandroid.gabriel.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.gabriel.applistacurso.R;
import devandroid.gabriel.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;
    String dadosPessoa;

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


        dadosPessoa ="Primeiro nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa +=" sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa +=" telefone de contato: ";
        dadosPessoa += pessoa.getTelefoneContato();
        dadosPessoa +=" Curso desejado: ";
        dadosPessoa += pessoa.getCursoDesejado();



    }
}