package src.br.com.professorisidro.isilanguage.datastructures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsiVariable extends IsiSymbol {
	
	public static final int INT=0;
	public static final int TEXT=1;
	public static final int REAL=2;
	public static final int LISTA_INT=3;
	public static final int LISTA_TEXTO=4;
	public static final int LISTA_REAL=5;
	
	private int type;
	private String value;
	
	public IsiVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
	}

	public int getType() {
		return type;
	}


	public boolean verificaTipoELista(IsiVariable varLista) {
		return (type == INT && varLista.type == LISTA_INT) || (type == REAL && varLista.type == LISTA_REAL) || (type == TEXT && varLista.type == LISTA_TEXTO);
	}

	public boolean verificaTipo(String valor, IsiSymbolTable table) {
		try {
			Integer.parseInt(valor);
			return type == INT;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(valor);
			return type == REAL;
		}
		catch (NumberFormatException ignored){}
		if(valor.contains("\"")) return type == TEXT;
		else return verificarExpressao(valor, table);

	}
	public static List<String> stringParaLista (String telefonesString){
		if (telefonesString == null || telefonesString.isEmpty()) return new ArrayList<>();
		telefonesString = telefonesString.replace(" ", "");
		String[] tels = telefonesString.split("[-+*/]+");
		List<String> telefones = new ArrayList<>();
		Collections.addAll(telefones, tels);
		return telefones;
	}


	private boolean verificarExpressao(String expr, IsiSymbolTable table){
		List<String> elementos = stringParaLista(expr);
		for(String el : elementos){
			if(!validarElemento(el, table)) return false;
		}
		return true;

	}

	private boolean validarElemento(String elemento, IsiSymbolTable table){
		try {
			Integer.parseInt(elemento);
			return type == INT;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(elemento);
			return type == REAL;
		}
		catch (NumberFormatException ignored){}
		IsiVariable var = (IsiVariable)table.get(elemento);
		return type == var.getType();
	}

	private boolean verificarExpressaoLista(String expr, IsiSymbolTable table){
		List<String> elementos = stringParaLista(expr);
		for(String el : elementos){
			if(!validarElementoLista(el, table)) return false;
		}
		return true;

	}

	private boolean validarElementoLista(String elemento, IsiSymbolTable table){
		int tipo;
		if(type == LISTA_INT) tipo = INT;
		else if(type == LISTA_TEXTO) tipo = TEXT;
		else tipo = REAL;
		try {
			Integer.parseInt(elemento);
			return type == LISTA_INT;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(elemento);
			return type == LISTA_REAL;
		}
		catch (NumberFormatException ignored){}
		IsiVariable var = (IsiVariable)table.get(elemento);
		return type == tipo;
	}

	public boolean verificaTipoLista(String valor, IsiSymbolTable table){
		try {
			Integer.parseInt(valor);
			return type == LISTA_INT;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(valor);
			return type == LISTA_REAL;
		}
		catch (NumberFormatException ignored){}
		if(valor.contains("\"")) return type == LISTA_TEXTO;
		else return verificarExpressaoLista(valor, table);
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IsiVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
	}
	
	public String generateJavaCode() {
       String str = "";
       if (type == INT) {
    	   str = "       int "+ " "+super.name+";";
       }
       else  if (type == TEXT)  {
    	   str = "       String "+ " "+super.name+";";
       }else if (type == REAL){
		   str = "       double "+ " "+super.name+";";
	   }else if (type == LISTA_INT){
		   str = "       List<Integer>"+ " "+super.name+" = new ArrayList<>();";
	   }else if (type == LISTA_TEXTO){
		   str = "       List<String>"+ " "+super.name+" = new ArrayList<>();";
	   }else{
		   str = "       List<Double>"+ " "+super.name+" = new ArrayList<>();";
	   }
       return str;
	}
	
	

}
