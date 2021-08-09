package src.br.com.professorisidro.isilanguage.ast;

import src.br.com.professorisidro.isilanguage.datastructures.IsiVariable;

public class CommandLeitura extends AbstractCommand {

	private String id;
	private IsiVariable var;
	
	public CommandLeitura (String id, IsiVariable var) {
		this.id = id;
		this.var = var;
	}
	@Override
	public String generateJavaCode() {
		String nextType;
		if(var.getType()==IsiVariable.INT) nextType = "nextInt();\n       scanner.nextLine();";
		else if(var.getType()==IsiVariable.TEXT) nextType = "       nextLine();";
		else nextType = "nextDouble();\n       scanner.nextLine();";
		return "       "+id +" = scanner." + nextType;
	}
	@Override
	public String toString() {
		return "CommandLeitura [id=" + id + "]";
	}

}
