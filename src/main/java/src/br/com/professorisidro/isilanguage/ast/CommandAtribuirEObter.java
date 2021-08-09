package src.br.com.professorisidro.isilanguage.ast;

public class CommandAtribuirEObter extends AbstractCommand{

    private String id;
    private String idLista;
    private String ind;

    public CommandAtribuirEObter(String id, String idLista, String ind) {
        this.id = id;
        this.idLista = idLista;
        this.ind = ind;
    }
    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return "       "+id + " = "+idLista+".get("+ind+");";
    }
    @Override
    public String toString() {
        return "CommandAtribuirEObter [id=" + id;
    }



}
