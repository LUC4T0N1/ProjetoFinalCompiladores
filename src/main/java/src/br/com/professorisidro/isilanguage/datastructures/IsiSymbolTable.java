package src.br.com.professorisidro.isilanguage.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class IsiSymbolTable {
	
	private HashMap<String, IsiSymbol> map;
	
	public IsiSymbolTable() {
		map = new HashMap<String, IsiSymbol>();
		
	}
	
	public void add(IsiSymbol symbol) {
		map.put(symbol.getName(), symbol);
	}
	
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}

	public boolean validarCondicao(String condLeft, String condRight){
		try {
			Integer.parseInt(condLeft);
			Integer.parseInt(condRight);
			return true;
		}
		catch (NumberFormatException ignored){}
		try {
			Integer.parseInt(condLeft);
			IsiVariable y = (IsiVariable) get(condRight);
			return y.getType()==0;
		}
		catch (NumberFormatException ignored){}
		try {
			Integer.parseInt(condRight);
			IsiVariable x = (IsiVariable) get(condLeft);
			return x.getType()==0;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(condLeft);
			Double.parseDouble(condRight);
			return true;
		}catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(condLeft);
			IsiVariable y = (IsiVariable) get(condRight);
			return y.getType()==2;
		}
		catch (NumberFormatException ignored){}
		try {
			Double.parseDouble(condRight);
			IsiVariable x = (IsiVariable) get(condLeft);
			return x.getType()==2;
		}
		catch (NumberFormatException ignored){}
		try {
			IsiVariable x = (IsiVariable) get(condLeft);
			IsiVariable y = (IsiVariable) get(condRight);
			return x.getType() == y.getType();
		}catch (NumberFormatException ignored){}
		return false;
	}

	public boolean initialized(String symbolName) {
		return map.get(symbolName).isInitialized();
	}

	public boolean used(String symbolName) {
		return map.get(symbolName).isUsed();
	}

	public IsiSymbol get(String symbolName) {
		return map.get(symbolName);
	}
	
	public ArrayList<IsiSymbol> getAll(){
		ArrayList<IsiSymbol> lista = new ArrayList<IsiSymbol>();
		for (IsiSymbol symbol : map.values()) {
			lista.add(symbol);
		}
		return lista;
	}

	
	
}
