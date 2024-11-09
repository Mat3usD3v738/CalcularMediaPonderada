import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
 public static void main(String[] args) {
try {
    String nome ; 
        Scanner in = new Scanner(System.in);
int pesoMatematica , pesoPortugues , pesoCiencias  , pesoIngles , pesoEspanhol , pesoLiteratura , pesoArtes  ,pesoHistoria , pesoGeografia ,
Matematica , Portugues , Ciencias  , Ingles , Espanhol , Literatura , Artes  ,Historia , Geografia;
System.out.println("Digite seu nome");
nome = in.nextLine();
System.out.println("Digite a nota  de Matematica");
Matematica = in.nextInt();
System.out.println("digite a nota  de Portugues");
Portugues = in.nextInt() ; 
System.out.println("digite a nota  de Ciencias");
Ciencias = in.nextInt() ; 
System.out.println("digite a nota  de Ingles");
Ingles = in.nextInt() ; 
System.out.println("digite a nota  de Espanhol");
Espanhol = in.nextInt() ; 
System.out.println("digite a nota  de Literatura");
Literatura = in.nextInt() ; 
System.out.println("digite a nota  de Artes");
Artes = in.nextInt() ; 
System.out.println("digite a nota  de Historia");
Historia = in.nextInt() ; 
System.out.println("digite a nota  de Geografia");
Geografia = in.nextInt() ; 
System.out.println("\n______________________________________________________________");
System.out.println("Agora sobre os pesos das diciplinas");
System.out.println("\n______________________________________________________________");
System.out.println("Digite o peso  de Matematica");
pesoMatematica = in.nextInt();
System.out.println("digite o peso  de Portugues");
pesoPortugues = in.nextInt() ; 
System.out.println("digite o peso  de Ciencias");
pesoCiencias = in.nextInt() ; 
System.out.println("digite o peso  de Ingles");
pesoIngles = in.nextInt() ; 
System.out.println("digite o peso  de Espanhol");
pesoEspanhol = in.nextInt() ; 
System.out.println("digite o peso  de Literatura");
pesoLiteratura = in.nextInt() ; 
System.out.println("digite o peso  de Artes");
pesoArtes = in.nextInt() ; 
System.out.println("digite o peso  de Historia");
pesoHistoria = in.nextInt() ; 
System.out.println("digite o peso  de Geografia");
pesoGeografia = in.nextInt() ; 
System.out.println("_______________________________");
in.close();
int media = CalcularMediaPonderada(pesoMatematica, pesoPortugues, pesoCiencias, pesoIngles, pesoEspanhol, pesoLiteratura, pesoArtes, pesoHistoria, pesoGeografia, Matematica, Portugues, Ciencias, Ingles, Espanhol, Literatura, Artes, Historia, Geografia);

if (IsAprovado(media)) {
    System.out.println(nome);
    System.out.println("Sua media : "+media);
    System.out.println("Você foi aprovado");
} else {
    System.out.println(nome);
    System.out.println("Sua media : "+media);
    System.out.println("Você não foi aprovado");
}
}catch (InputMismatchException e) {
    System.out.println("Tente novamente");
    System.out.println("Você deve digitar numeros não letras ou simbolos");
    e.printStackTrace();
}
}
private static int CalcularMediaPonderada(int pesoMatematica , int pesoPortugues , int pesoCiencias  , int pesoIngles , int pesoEspanhol , int pesoLiteratura , int pesoArtes  ,int pesoHistoria , int pesoGeografia ,
   int Matematica , int Portugues , int Ciencias  , int Ingles , int Espanhol , int Literatura , int Artes  , int Historia , int Geografia){
    return  ((Matematica  * pesoMatematica) + 
    (Portugues * pesoPortugues) + (Ciencias * pesoCiencias) + 
    (Ingles * pesoIngles) + (Espanhol* pesoEspanhol) +(Literatura * pesoLiteratura) + 
    (Artes * pesoArtes) +(Historia * pesoHistoria) +(Geografia *  pesoGeografia)) / 
    (pesoMatematica + pesoPortugues + pesoCiencias + pesoIngles + pesoEspanhol +
     pesoLiteratura + pesoLiteratura + pesoArtes + pesoHistoria + pesoGeografia);  
   
}
private static boolean IsAprovado(int media){
    return media == 7 || media > 7 ;
}
}
