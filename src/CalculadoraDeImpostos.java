
public class CalculadoraDeImpostos {
	
	public static double getAliquota(Orcamento orcamento, IImposto imposto) {
		return imposto.calculaImposto(orcamento);
	}
}
