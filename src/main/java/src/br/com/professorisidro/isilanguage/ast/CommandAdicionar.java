package src.br.com.professorisidro.isilanguage.ast;

public class CommandAdicionar extends AbstractCommand{

    private String id;
    private String expr;

    public CommandAdicionar(String id, String expr) {
        this.id = id;
        this.expr = expr;
    }
    @Override
    public String generateJavaCode() {
        // TODO Auto-generated method stub
        return "       "+id + ".add("+expr+");";
    }
    @Override
    public String toString() {
        return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
    }



}
