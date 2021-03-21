 * 
 */
package estudodirigido;

import java.util.Scanner;


public class MainExe01 
{
    public static void main(String[] args)
    {
        {
        Scanner ler = new Scanner(System.in);

        Exe01 e1 = new Exe01 ();

        System.out.println("Digite o seu nome: ");
        e1.nome = ler.nextLine();

        System.out.println("Digite seu peso em gramas: ");
        e1.setPeso(ler.nextInt());

        System.out.println("Digite a sua altura em centímetros: ");
        e1.setAltura(ler.nextDouble());

        System.out.println("Unindo os dados... ");   
        System.out.println("Nome: " + e1.nome);
        System.out.println("Peso: " + e1.getPeso());
        System.out.println("Altura: " + e1.getAltura());

        if ( e1.CalcularIMC <= 24.99  ) 
            {
                System.out.println("Você está no peso ideal! ");
            }
        else if ( e1.CalcularIMC >= 29.99 )
            {
            System.out.println("Você está no peso ideal. ");
            }
        
        
        
        }   
}

}
