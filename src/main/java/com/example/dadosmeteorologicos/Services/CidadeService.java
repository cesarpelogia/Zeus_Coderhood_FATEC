package com.example.dadosmeteorologicos.Services;

import java.util.List;

import com.example.dadosmeteorologicos.db.CidadeSQL;
import com.example.dadosmeteorologicos.model.Cidade;

public class CidadeService {


    public List<Cidade> getCidades() {
        CidadeSQL banco = new CidadeSQL();
        List<Cidade> listaCidades = banco.buscaCidadesBanco();
        banco.fecharConexao();
        return listaCidades;
    }

    public boolean siglaValida(String siglaCidade) {
        CidadeSQL banco = new CidadeSQL();
        boolean siglaValida = banco.siglaValida(siglaCidade);
        banco.fecharConexao();
        return siglaValida;
    }

    public void criarCidade(String nomeCidade, String siglaCidade) {
        CidadeSQL banco = new CidadeSQL();
        banco.criarCidade(nomeCidade, siglaCidade);
        banco.fecharConexao();
    }

}
