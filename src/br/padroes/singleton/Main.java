package br.padroes.singleton;

public class Main {
    public static void main( String args[] ){
        BancoDeDados bd = BancoDeDados.getInstance();
        System.out.println(bd);
        /* AINDA A MESMA INSTÂNCIA DE bd */
        BancoDeDados bdNovo = BancoDeDados.getInstance();
        System.out.println(bdNovo);
        
    }
}
