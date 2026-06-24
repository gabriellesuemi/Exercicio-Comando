import java.util.HashMap;

public class AllCommand implements Comando {

    @Override
    public void executar(String[] args,
                         HashMap<Integer, Pessoa> banco) {

        if (banco.isEmpty()) {
            System.out.println("Banco vazio.");
            return;
        }

        for (Pessoa p : banco.values()) {
            System.out.println(p);
        }
    }
}