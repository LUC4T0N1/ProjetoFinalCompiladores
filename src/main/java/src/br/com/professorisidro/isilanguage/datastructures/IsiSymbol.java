package src.br.com.professorisidro.isilanguage.datastructures;

public abstract class IsiSymbol {
	
	protected String name;
	protected boolean initialized = false;
	
	public abstract String generateJavaCode();
	public IsiSymbol(String name) {
		this.name = name;
		
	}

	public boolean isInitialized() {
		return initialized;
	}

	public void setInitialized(boolean initialized) {
		this.initialized = initialized;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "IsiSymbol [name=" + name + "]";
	}
	
	
	

}
