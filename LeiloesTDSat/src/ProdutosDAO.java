/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adm
 */

import java.util.ArrayList;


public class ProdutosDAO {
    
    ArrayList<ProdutosDTO> listagem = new ArrayList<>();
    
    public boolean cadastrarProduto (ProdutosDTO produto){
        
        new conectaDAO().connectDB();
        listagem.add(produto); // Adiciona o produto à lista
    System.out.println("Produto cadastrado: " + produto.getNome());
        
        return true;
    }
    
    
    public ArrayList<ProdutosDTO> listarProdutos(){
        
       
        ProdutosDTO p = new ProdutosDTO (10,"PS5",4000 , "A venda");
        ProdutosDTO p1 = new ProdutosDTO (9,"PS6",5000 , "A venda");
        ProdutosDTO p2 = new ProdutosDTO (8,"NintendoSwitch",3500 , "A venda");
        ProdutosDTO p3 = new ProdutosDTO (7,"PlayStation1",1000 , "A venda");
        ProdutosDTO p4 = new ProdutosDTO (6,"PlayStation2",2000 , "A venda");
        ProdutosDTO p5 = new ProdutosDTO (5,"PlayStation4",4000 , "A venda");
        ProdutosDTO p6 = new ProdutosDTO (4,"Atari",900 , "A venda");
        ProdutosDTO p7 = new ProdutosDTO (3,"SuperNintendo",2500 , "A venda");
        
        
        listagem.add(p);
        listagem.add(p1);
        listagem.add(p2);
        listagem.add(p3);
        listagem.add(p4);
        listagem.add(p5);
        listagem.add(p6);
        listagem.add(p7);
        
        
        
        
        return listagem;
    }
    
    
    
        
}

