package csp585homework4;

public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy=strategy;		
	}
	public String execute(){
		return strategy.execute();
		
	}
}
