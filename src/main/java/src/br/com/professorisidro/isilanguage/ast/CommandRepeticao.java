package src.br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;

public class CommandRepeticao extends AbstractCommand {

    private String condition;
    private ArrayList<AbstractCommand> listaTrue;

    public CommandRepeticao(String condition, ArrayList<AbstractCommand> lt) {
        this.condition = condition;
        this.listaTrue = lt;
    }
    @Override
    public String generateJavaCode() {
        StringBuilder str = new StringBuilder();
        str.append("       while("+condition+") {");
        for (AbstractCommand cmd: listaTrue) {
            str.append("\n	").append(cmd.generateJavaCode());
        }
        str.append("\n       }");
        return str.toString();
    }
    @Override
    public String toString() {
        return "CommandRepeticao [condition=" + condition + ", listaTrue=" + listaTrue + "]";
    }



}
