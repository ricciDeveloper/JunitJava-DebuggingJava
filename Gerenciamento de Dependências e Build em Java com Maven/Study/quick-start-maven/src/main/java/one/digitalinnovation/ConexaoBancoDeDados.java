package one.digitalinnovation;

import java.util.logging.Logger;

public class ConexaoBancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(ConexaoBancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }
    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão");
    }
    public static void insereDados(Pessoa pessoa){
        LOGGER.info("Inseriu dados");
    }
    public static void removeDados(Pessoa pessoa){
        LOGGER.info("Removeu dados");
    }
}
