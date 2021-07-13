package edu.handong.csee.java.timesTable;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e05();
  }
  void e05(){
    Scanner s = new Scanner(System.in);
    int mode;
    int column;
    int i, j;

    System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
    mode = s.nextInt();
    System.out.print("Enter a numbers of column > ");
    column = s.nextInt();

    if(mode == 1){
      for(i = 3; i < 10; i += 2){
        for(j = 1; j < 10; j++){
          System.out.print(i + " X " + j + " = ");
          if(j%column != 0 && j%9 != 0)
            System.out.printf("%-8d", i*j);
          
          if(j%column == 0 || j%9 == 0)
            System.out.print(i*j + "\n");
        }
  
      }
    }else{
      for(i = 2; i < 9; i += 2){
        for(j = 1; j < 10; j++){
          System.out.print(i + " X " + j + " = ");
          if(j%column != 0 && j%9 == 0)
            System.out.printf("%-8d", i*j);
          
          if(j%column == 0 || j%9 == 0)
            System.out.print(i*j + "\n");
        }
    
      }
    }
  }
}