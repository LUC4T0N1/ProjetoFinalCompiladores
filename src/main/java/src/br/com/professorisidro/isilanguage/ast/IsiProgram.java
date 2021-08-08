package src.br.com.professorisidro.isilanguage.ast;

import src.br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
import src.br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class IsiProgram {
	private IsiSymbolTable varTable;
	private ArrayList<AbstractCommand> comandos;
	private String programName;

	public void generateTarget() {
		StringBuilder str = new StringBuilder();

		str.append("import java.util.Locale;\n");
		str.append("import java.util.Scanner;\n\n");
		str.append("public class MainClass{ \n");
		str.append("  public static void main(String[] args){\n ");
		str.append("      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);\n");
		for (IsiSymbol symbol: varTable.getAll()) {
			str.append(symbol.generateJavaCode()+"\n");
		}
		for (AbstractCommand command: comandos) {
			str.append(command.generateJavaCode()+"\n");
		}
		str.append("  }");
		str.append("}");
		
		try {
			FileWriter fr = new FileWriter(new File("D:\\ProjetoFinalCompiladores\\src\\main\\java\\MainClass.java"));
			fr.write(str.toString());
			fr.close();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	public IsiSymbolTable getVarTable() {
		return varTable;
	}

	public void setVarTable(IsiSymbolTable varTable) {
		this.varTable = varTable;
	}

	public ArrayList<AbstractCommand> getComandos() {
		return comandos;
	}

	public void setComandos(ArrayList<AbstractCommand> comandos) {
		this.comandos = comandos;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

}
