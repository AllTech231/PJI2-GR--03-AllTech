package Model.DAO;

import java.util.Arrays;

public class ProdutoDAO {
   public double pesquisaProduto(String codProdutoPesquisa) {
	    double [] codProd1 = {1500, 1000, 500};
	    double [] codProd2 = {1501, 1001, 501};
	    double [] codProd3 = {1520, 1020, 520};
	    double [] codProd4 = {1300, 1300, 300};
	    double menor = 0;
	    
		if (codProdutoPesquisa.equals ("p1") ) 
		{
			Arrays.sort(codProd1);
			menor=codProd1[0];
		} 
		else if (codProdutoPesquisa.equals("p2") ) 
		{
				Arrays.sort(codProd2);
					menor=codProd2[0];
		} 
		else if (codProdutoPesquisa.equals("p3") ) 
		{
					Arrays.sort(codProd3);
						menor=codProd3[0];
		} 
		else 	if (codProdutoPesquisa.equals("p4") ) 
		{
						Arrays.sort(codProd4);
							menor=codProd4[0];
		}
		return menor;
   }
}