package entidade;

public class EmpregadoTercerizado extends Empregado {
	
	private Double despesaAdicional;
	
	public EmpregadoTercerizado() {
		super();
	}
	
	public EmpregadoTercerizado(String nome,Integer hora, Double valorPorHora,Double despesaAdicional) {
		super(nome,hora,valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	public double getDespesaAdicional() {
		return despesaAdicional;
	}
	
	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento()+despesaAdicional*1.1;
	}
}
