public class MinhaClasse {

public static void main(String [] args){
    System.out.print ("Coé Rapaziada");
    final String BR = "Brasil";
    final double PI = 3.14;

    String nomeCompleto = nomeCompleto("Júlio", "Carvalho");
    System.out.print ("\n" + nomeCompleto);
}
public static String nomeCompleto (String primeiroNome, String segundoNome)
{
    return primeiroNome.concat("").concat(segundoNome);
}
}
