import java.util.HashMap;

public interface Comando{

    void executar(String[] args,
                   HashMap<Integer, Pessoa> banco);
                   
}