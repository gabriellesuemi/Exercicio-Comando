import java.util.HashMap;

public class GetCommand implements Comando {
    @Override
    public void executar(String[] args,
                         HashMap<Integer, Pessoa> banco) {

        if (args.length < 2) {
            System.out.println("Uso: get <id>");
            return;
        }

        int id = Integer.parseInt(args[1]);
        Pessoa p = banco.get(id);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
}
