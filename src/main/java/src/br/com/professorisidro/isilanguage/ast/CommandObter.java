package src.br.com.professorisidro.isilanguage.ast;

public class CommandObter extends AbstractCommand {

    private String id;
    private String expr;

    public CommandObter(String id, String expr) {
        this.id = id;
        this.expr = expr;
    }
    @Override
    public String generateJavaCode() {
        return "       "+id +".get("+expr+");";
    }
    @Override
    public String toString() {
        return "CommandObter [id=" + id + "]";
    }

}
