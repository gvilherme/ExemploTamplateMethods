package ImpostoStrategy;
import Entities.Orcamento;

public abstract class CalculaImpostoComFaixa implements IImposto {

	@Override
	public double calculaImposto(Orcamento orcamento) {
		return executaUmaFaixa(orcamento);
	}
	
	protected abstract double executaUmaFaixa(Orcamento orcamento);
	protected abstract double faixaMin(Orcamento orcamento);
	protected abstract double faixaMax(Orcamento orcamento);
}
