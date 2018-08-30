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
                break;
                case 2: mesString = "Fevereiro";
                break;
                case 3: mesString = "Março";
                break;
                case 4: mesString = "Abril";
                break;
                case 5: mesString = "Maio";
                break;
                case 6: mesString = "Junho";
                break;  
                case 7: mesString = "Julho";
                break;
                case 8: mesString = "Agosto";
                break;
                case 9: mesString = "Setembro";
                break;
                case 10: mesString = "Outubro";
                break;
                case 11: mesString = "Novembro";
                break;
                case 12: mesString = "Dezembro";

            }
    
            System.out.println("seu mes"+" "+mes+" "+"selecionado foi"+" "+mesString);
    }
    
}
