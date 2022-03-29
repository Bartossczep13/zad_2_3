import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  System.out.println("Podaj napis:  ");
    Scanner s = new Scanner(System.in);
    String napis = s.nextLine();
    
    String wynik="";
    char znak;
    int kod_ascii;
    
    for(int i=0;i<napis.length();i++)
      {
        znak=napis.charAt(i);
        kod_ascii = (int) znak;

        if(kod_ascii >=97  && kod_ascii<=122)
        {
          kod_ascii -= 32;
          znak = (char)kod_ascii;
        }
        wynik=wynik + znak;
        if(kod_ascii >=41 && kod_ascii <=90)
        {
          kod_ascii += 32;
          znak = (char)kod_ascii;
        }
        wynik=wynik + znak;
      }
   System.out.println(wynik);
      }
    

    
  }
