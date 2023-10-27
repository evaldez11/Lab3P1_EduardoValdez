/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_eduardovaldez;

import java.util.Scanner;

/**
 *
 * @author guali
 */
public class Lab3P1_EduardoValdez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("************Menu************");
        System.out.println("1: Sucesiones y mas sucesiones");
        System.out.println("2: Pocket Monster");
        System.out.println("3: Asterisco en casa");
        System.out.println();
        System.out.println("Ingrese una opcion");
        int opcion =leer.nextInt();
        
        while (opcion>0 || opcion < 4){
            
            switch (opcion){
                case 1: ;
                    System.out.println("Ejercicio 1 - Sucesiones y mas sucesiones");
                    System.out.print("Diferencia: ");
                    int dif = leer.nextInt();
                    System.out.print("Inicial: ");
                    int inicial= leer.nextInt();
                    System.out.print("Cantidad: ");
                    int cant = leer.nextInt();
                    int c = inicial + dif;
                    System.out.print(inicial+", "+c);
                    
                    for (int i = 0; i<= cant-3; i++){
                        c = c+dif+i;
                        int c2 = c+i+1;
                        System.out.print(" ,"+c2); 
                    }   
                    
                    System.out.println();
                    System.out.println();
                        System.out.print("Que numero desea ver mas adelante en la sucesion: ");
                        int num = leer.nextInt();
                        
                        break;
                        
                case 2: ;
                    System.out.println("Ejercicio 2 - Pocket Monster");
                    System.out.println("Ingrese la pelea pokemon que desea");
                    System.out.println("1.- Hasta la muerte");
                    System.out.println("2.- Por rondas");
                    int tipo = leer.nextInt();
                    
                    double vidaSylv = 280;
                    double ataqueSylv ;
                    
                           
                    double vidaGyar = 300;
                    double ataqueGyar ;
                    
                           
                    double vidaGir = 300;
                    double ataqueGir ;
                    
                            
                    double vidaDrag = 250;
                    double ataqueDrag ;
                    
                    
                    switch (tipo){
                        case 1 : ;
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa: 25%");
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            System.out.println();
                            
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon     vrs     Dragonite");
                            System.out.println("2.- Gyarados    vrs     Giratina");
                            System.out.println("3.- Dragonite   vrs     Giratina");
                            System.out.println("4.- Giratina    vrs     Sylveon");
                            System.out.println();
                            int pelea = leer.nextInt();
                            
                            switch (pelea){
                                case 1 : ;
                                    while (vidaSylv > 0 && vidaDrag >0){
                                       
                                        System.out.println("----------------Ronda----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaSylv);
                                        System.out.println("Vida de Pokemon 2: "+vidaDrag);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueSylv = 64;
                                        ataqueDrag = 63.75;
                                        
                                        vidaSylv=vidaSylv-ataqueDrag;
                                        vidaDrag=vidaDrag-ataqueSylv;
                                        if (vidaSylv>=0 && vidaDrag>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaSylv);
                                        System.out.println("Vida de Pokemon 2: "+vidaDrag);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaSylv<=0 && vidaDrag>vidaSylv){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaDrag);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaDrag<=0 && vidaSylv>vidaDrag){
                                            System.out.println("Vida de pokemon 1: "+vidaSylv);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                                case 2: ;
                                while (vidaGyar > 0 && vidaGir >0){
                                         
                                        System.out.println("----------------Ronda----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaGyar);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueGyar = 37.5 ;
                                        ataqueGir = 63;
                                        
                                        vidaGyar=vidaGyar-ataqueGir;
                                        vidaGir=vidaGir-ataqueGyar;
                                        if (vidaGyar>=0 && vidaGir>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaGyar);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaGyar<=0 && vidaGir>vidaGyar){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaGir);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaGir<=0 && vidaGyar>vidaGir){
                                            System.out.println("Vida de pokemon 1: "+vidaGyar);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                     break;  
                                        
                                     }
                                case 3: ;
                                while (vidaDrag > 0 && vidaGir >0){
                                        
                                        System.out.println("----------------Ronda----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaDrag);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueDrag = 56.25;
                                        ataqueGir = 56;
                                        
                                        vidaDrag=vidaDrag-ataqueGir;
                                        vidaGir=vidaGir-ataqueDrag;
                                        if (vidaDrag>=0 && vidaGir>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaDrag);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaDrag<=0 && vidaGir>vidaDrag){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaGir);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaGir<=0 && vidaDrag>vidaGir){
                                            System.out.println("Vida de pokemon 1: "+vidaDrag);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                                case 4: ;
                                while (vidaGir > 0 && vidaSylv >0){
                                     
                                        System.out.println("----------------Ronda----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaGir);
                                        System.out.println("Vida de Pokemon 2: "+vidaSylv);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueGir = 59.5 ;
                                        ataqueSylv = 60 ;
                                        
                                        vidaGir=vidaGir-ataqueSylv;
                                        vidaSylv=vidaSylv-ataqueGir;
                                        if (vidaGir>=0 && vidaSylv>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaGir);
                                        System.out.println("Vida de Pokemon 2: "+vidaSylv);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaGir<=0 && vidaSylv>vidaGir){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaSylv);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaSylv<=0 && vidaGir>vidaSylv){
                                            System.out.println("Vida de pokemon 1: "+vidaGir);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                                        
                                    
                            }
                        case 2 : ;
                            System.out.println("Estadisticas de los pokemones");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Giratina Vida:300 Ataque:70 Defensa: 25%");
                            System.out.println("Dragonite Vida:250 Ataque:75 Defensa:20%");
                            System.out.println();
                            
                            System.out.println("Ingrese una pelea determinada");
                            System.out.println("1.- Sylveon     vrs     Dragonite");
                            System.out.println("2.- Gyarados    vrs     Giratina");
                            System.out.println("3.- Dragonite   vrs     Giratina");
                            System.out.println("4.- Giratina    vrs     Sylveon");
                            System.out.println();
                            pelea = leer.nextInt();
                            switch (pelea){
                                case 1 : ;
                                    System.out.print("Ingrese cantidad de rounds: ");
                                    int cantidad = leer.nextInt();
                                    
                                    while (vidaSylv > 0 && vidaDrag >0){
                                        for (int i=1; i<=cantidad; i++){
                                       
                                        System.out.println("----------------Ronda "+i+"----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaSylv);
                                        System.out.println("Vida de Pokemon 2: "+vidaDrag);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueSylv = 64;
                                        ataqueDrag = 63.75;
                                        
                                        vidaSylv=vidaSylv-ataqueDrag;
                                        vidaDrag=vidaDrag-ataqueSylv;
                                        if (vidaSylv>=0 && vidaDrag>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaSylv);
                                        System.out.println("Vida de Pokemon 2: "+vidaDrag);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaSylv<=0 && vidaDrag>vidaSylv){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaDrag);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaDrag<=0 && vidaSylv>vidaDrag){
                                            System.out.println("Vida de pokemon 1: "+vidaSylv);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                            
                                     break;
                   
                            
                                    }
                                    case 2: ;
                                 System.out.print("Ingrese cantidad de rounds: ");
                                 cantidad = leer.nextInt();
                                    
                                    while (vidaGyar> 0 && vidaGir >0){
                                        for (int i=1; i<=cantidad; i++){
                                         
                                        System.out.println("----------------Ronda"+ i +"----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaGyar);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueGyar = 37.5 ;
                                        ataqueGir = 63;
                                        
                                        vidaGyar=vidaGyar-ataqueGir;
                                        vidaGir=vidaGir-ataqueGyar;
                                        if (vidaGyar>=0 && vidaGir>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaGyar);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaGyar<=0 && vidaGir>vidaGyar){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaGir);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaGir<=0 && vidaGyar>vidaGir){
                                            System.out.println("Vida de pokemon 1: "+vidaGyar);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                          
                                     }
                                        break;
                                    }
                                    case 3: ;
                                        System.out.print("Ingrese cantidad de rounds: ");
                                        cantidad = leer.nextInt();
                                    
                                    while (vidaDrag > 0 && vidaGir >0){
                                        for (int i=1; i<=cantidad; i++){
                                        
                                        System.out.println("----------------Ronda"+ i +"----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaDrag);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueDrag = 56.25;
                                        ataqueGir = 56;
                                        
                                        vidaDrag=vidaDrag-ataqueGir;
                                        vidaGir=vidaGir-ataqueDrag;
                                        if (vidaDrag>=0 && vidaGir>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaDrag);
                                        System.out.println("Vida de Pokemon 2: "+vidaGir);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaDrag<=0 && vidaGir>vidaDrag){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaGir);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaGir<=0 && vidaDrag>vidaGir){
                                            System.out.println("Vida de pokemon 1: "+vidaDrag);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                                        break;
                                    }
                                    case 4: ;
                                        System.out.print("Ingrese cantidad de rounds: ");
                                        cantidad = leer.nextInt();
                                    
                                    while (vidaGir > 0 && vidaSylv >0){
                                        for (int i=1; i<=cantidad; i++){
                                     
                                        System.out.println("----------------Ronda"+ i +"----------------");
                                        System.out.println("Vida de pokemon 1: "+vidaGir);
                                        System.out.println("Vida de Pokemon 2: "+vidaSylv);
                                        System.out.println();
                                        System.out.println("Pokemon 1 Ha atacado!");
                                        System.out.println("Pokemon 2 Ha atacado!");
                                        
                                        ataqueGir = 59.5 ;
                                        ataqueSylv = 60 ;
                                        
                                        vidaGir=vidaGir-ataqueSylv;
                                        vidaSylv=vidaSylv-ataqueGir;
                                        if (vidaGir>=0 && vidaSylv>=0){
                                        System.out.println("Vida de Pokemon 1: "+vidaGir);
                                        System.out.println("Vida de Pokemon 2: "+vidaSylv);
                                        }else {
                                        System.out.println();
                                        
                                     if (vidaGir<=0 && vidaSylv>vidaGir){
                                            System.out.println("Vida de Pokemon 1: 0.0");
                                            System.out.println("Vida de Pokemnon 2: "+vidaSylv);
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 2 Ha sido el ganador");
                                            
                                        }else if (vidaSylv<=0 && vidaGir>vidaSylv){
                                            System.out.println("Vida de pokemon 1: "+vidaGir);
                                            System.out.println("Vida de Pokemon 2: 0.0");
                                            System.out.println("********Fin de la Batalla********");
                                            System.out.println("Pokemon 1 Ha sido el ganador");
                                            System.out.println();
                                        }
                                    }
                                       
                                        
                                     }
                                        break;
                                    
                            }
                        
                    }//fin switch interno          
                            }
                    case 3: ;
                            System.out.println("Ejercicio 3 - Asterisco en casa");
                            System.out.print("Ingresar numero impar mayor o igual a 7: ");
                            int n = leer.nextInt();
                            while (n >=7 && n % 2 !=0){
                                for(int i = 1; i<=n;i++){
                                    for(int j = 1; j<= n;j++){
                                        if(i==1||i==n||j==n||j==1){
                                            System.out.print(" * ");
                                         
                                        }else if(j == n/2 +1){
                                            System.out.print(" | ");
                                        }else if(i==j||i+j==n+1){
                                            System.out.print(" > ");
                                        }else{
                                            System.out.print("   ");
                                        }
                                    
                                }
                                    System.out.println("");
                            }
                              System.out.print("Ingresar numero impar mayor o igual a 7: ");
                              n = leer.nextInt();  
                            }
                           
            
            }//fin switch
            
        }//fin while
        
        
    }//fin del main
    
}//fin de clase


