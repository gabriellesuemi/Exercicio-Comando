import java.util.HashMap;

public class NewCommand implements Comando {

    @Override
    public void executar(String[] args,
                         HashMap<Integer, Pessoa> banco){

        if (args.length < 3){
            System.out.println("Uso: new <id> <nome>");
            return;
        }

        int id = Integer.parseInt(args[1]);
        String nome = args[2];

        banco.put(id, new Pessoa(id, nome));

        System.out.println("Pessoa cadastrada.");
    }
    
}