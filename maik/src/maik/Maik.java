/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maik;

import java.util.Scanner;

/**
 *
 * @author lab208
 */
public class Maik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
        int mes = 0;
            
            String mesString = "";
            
            System.out.println("Digite o numero do mes que voce quer");
             mes = scanner.nextInt();
            switch(mes){
                case 1: mesString = "Janeiro";
                
                case 2: mesString = "Fevereiro";
               
                case 3: mesString = "Março";
             
                case 4: mesString = "Abril";
      
                case 5: mesString = "Maio";

                case 6: mesString = "Junho";

                case 7: mesString = "Julho";

                case 8: mesString = "Agosto";

                case 9: mesString = "Setembro";
    
                case 10: mesString = "Outubro";
   
                case 11: mesString = "Novembro";

                case 12: mesString = "Dezembro";

            }
    
            System.out.println("seu mes"+" "+mes+" "+"selecionado foi"+" "+mesString);
    }
    
}
