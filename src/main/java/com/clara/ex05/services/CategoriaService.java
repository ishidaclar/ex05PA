package com.clara.ex05.services;

import com.clara.ex05.models.CategoriaModel;
import com.clara.ex05.repositories.CategoriaRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepositorie categoriaRepositorie;

    public List<CategoriaModel> findAll(){
    return categoriaRepositorie.findAll();
    }

    public CategoriaModel criarCategoria (CategoriaModel categoria){
        return categoriaRepositorie.save(categoria);
    }

    public Optional<CategoriaModel> findById(Long id){
        return categoriaRepositorie.findById(id);
    }

    public CategoriaModel atualizarCategoria (Long id, CategoriaModel categoria){
        CategoriaModel requeste = categoriaRepositorie.findById(id).get();
        requeste.setNome(categoria.getNome());
        return categoriaRepositorie.save(requeste);
    }

    public void deletarCategoria(Long id){
        categoriaRepositorie.deleteById(id);
    }

}
