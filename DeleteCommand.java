import java.util.HashMap;

public class DeleteCommand implements Comando {

    @Override
    public void executar(String[] args,
                         HashMap<Integer, Pessoa> banco){

        if (args.length < 2){
            System.out.println("Uso: delete <id>");
            return;
        }

        int id = Integer.parseInt(args[1]);

        if (banco.remove(id) != null){
            System.out.println("Pessoa removida.");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }
    
}