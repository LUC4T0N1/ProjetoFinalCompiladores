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
