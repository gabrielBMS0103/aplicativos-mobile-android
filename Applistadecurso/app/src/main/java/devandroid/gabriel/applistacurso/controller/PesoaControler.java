package devandroid.gabriel.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.gabriel.applistacurso.model.Pessoa;

public class PesoaControler {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_controler","Controle iniciada");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC_controler","salvo: "+ pessoa.toString());
    }

    public void finalizar(Pessoa pessoa) {
    }

    public void limpar(Pessoa pessoa) {
    }
}
