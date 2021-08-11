package src.br.com.professorisidro.isilanguage.ast;

public class CommandTamanho extends AbstractCommand{

    private String id;

    public CommandTamanho(String id) {
        this.id = id;
    }
    @Override
    public String generateJavaCode() {
        return "       "+id + ".size();";
    }
    @Override
    public String toString() {
        return "CommandTamanho [id=" + id + "]";
    }

}
