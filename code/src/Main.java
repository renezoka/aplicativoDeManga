import java.util.Scanner;

public class Main {
    static int ac;
    
public static void main(String[] args) throws Exception {
                    Scanner scanner = new Scanner(System.in);
                    boolean sistemaAtivo = true;
            
                    while(sistemaAtivo){
                        ac = 0 ;
                        
                        System.out.println("--------- MENU --------");
                        System.out.println("");
                        System.out.println("Bem-vind@ a tela de Menu!");
                        System.out.println("");
                        System.out.println("O que você deseja?");
                        System.out.println("");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Fazer cadastro    -> 1");
                        System.out.println("Editar cadastro   -> 2");
                        System.out.println("Consultar livro   -> 3");
                        System.out.println("Listar livro      -> 4");
                        System.out.println("");
                        System.out.println("         Sair     -> 0");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
            
                    int acao = scanner.nextInt();
                    scanner.nextLine();
                        ac = acao;
                if(acao==0){
                    break;
                }else if(acao>=1 && acao<=4){
                    boolean desejo = true;
                    while(desejo){
                        System.out.println("-------- TELA DE SELEÇÃO --------");
                        System.out.println("");
                        System.out.println("Qual recurso voce quer acessar?");
                        System.out.println("");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("Livro 1       -> 1");
                        System.out.println("Livro 2       -> 2");
                        System.out.println("Livro 3       -> 3");
                        System.out.println("Livro 4       -> 4");
                        System.out.println("Livro 5       -> 5");
                        System.out.println("Livro 6       -> 6");
                        System.out.println("Livro 7       -> 7");
                        System.out.println("Livro 8       -> 8");
                        System.out.println("Livro 9       -> 9");
                        System.out.println("Livro 10      -> 10");
                        System.out.println("Livro 11      -> 11");
                        System.out.println("");
                        System.out.println("        Sair  -> 0");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
        
                int objeto = scanner.nextInt();
                scanner.nextLine();
                        
                if(objeto==0){
                    break;
                }else{
            System.out.println("Resposta inválida, tente novamente");
        }



        
        }
        scanner.close();
        System.out.println("A sessão foi encerrada.");
    }
}
}
}