package src.br.com.professorisidro.isilanguage.ast;

public class CommandPrintTamanho extends AbstractCommand{

    private String id;

    public CommandPrintTamanho(String id) {
        this.id = id;
    }
    @Override
    public String generateJavaCode() {
        return "       System.out.println("+id + ".size());";
    }
    @Override
    public String toString() {
        return "CommandPrintTamanho [id=" + id + "]";
    }

}
