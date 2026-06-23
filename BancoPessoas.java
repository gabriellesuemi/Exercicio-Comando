import java.util.HashMap;

public class BancoPessoas {

    private static final HashMap<Integer, Pessoa> banco =
            new HashMap<>();

    private static final HashMap<String, Comando> comandos =
            new HashMap<>();

    static {
        comandos.put("new", new NewCommand());
        comandos.put("delete", new DeleteCommand());
        comandos.put("get", new GetCommand());
        comandos.put("all", new AllCommand());
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println(
                "Uso: java BancoPessoas <comando> [args]"
            );
            return;
        }

        String nomeComando = args[0];

        Comando comando = comandos.get(nomeComando);

        if (comando == null) {
            System.out.println("Comando inválido.");
            return;
        }

        comando.executar(args, banco);
    }
}