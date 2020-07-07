package ImpostoStrategy;

import Entities.Orcamento;

public class IKCV extends CalculaImpostoComFaixa {

	@Override
	protected double executaUmaFaixa(Orcamento orcamento) {
		if (orcamento.getValorTotal() > 500 && orcamento.getItems().stream().filter(i -> i.getValorUnit() > 100.0).count() >= 1) {
			return faixaMax(orcamento);
		}
		return faixaMin(orcamento);
	}

	@Override
	protected double faixaMin(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.06;
	}

	@Override
	protected double faixaMax(Orcamento orcamento) {
		return orcamento.getValorTotal() * 0.1;
	}

}
