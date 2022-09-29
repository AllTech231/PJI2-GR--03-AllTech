package Controller;

import Model.Produto.Produto;
import view.TrataTela;

public class ComparaApp {
	public static void main(String[] args) {
			TrataTela tela = new TrataTela();
			tela.entraSistema();
			
			String produtoInformado = tela.obtemProduto();
			
			Produto prodNegocio = new Produto();
			
			String mensagem =prodNegocio.verificaPreco(produtoInformado);
			
			tela.informaPreco(mensagem); 
	
	}

	  }	 



