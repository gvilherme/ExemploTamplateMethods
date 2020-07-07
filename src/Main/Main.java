package Main;
import java.util.ArrayList;
import java.util.List;

import Entities.Items;
import Entities.Orcamento;
import ImpostoStrategy.CalculadoraDeImpostos;
import ImpostoStrategy.IKCV;
import ImpostoStrategy.INPS;

public class Main {

	public static void main(String[] args) {
		List<Items> itens = new ArrayList<Items>() {{
			add(new Items("Lápis", 2, 2.0));
			add(new Items("Mochilas", 2, 55.0));
			add(new Items("Kindle", 8, 110.0));
			add(new Items("Talco", 5, 2.0));
			add(new Items("Mouse", 1, 76.0));
		}};
		Orcamento orcamento = new Orcamento(itens);
		
		System.out.println(CalculadoraDeImpostos.getAliquota(orcamento, new IKCV()));
	}
}
