package prog_obj;
import java.util.Scanner;
import java.io.PrintStream;

public class Prog_obj {
    public static void main(String[] args) {
      String name="jan - 'cytat'"; // '' to cytat w string
      
      int dlugosc = name.length();
      System.out.println("dlugosc string "+dlugosc);
      
      String DName = name.toUpperCase();
      String Mname = name.toLowerCase();
      
      int index = name.indexOf("an");
      int index2 = name.lastIndexOf("a"); //wartosc ostatniego indeksu
      
      String replace = name.replace('a','A'); //zamiana liter, trzeba jako char
     
      String nazwisko = "nowak";
      
      String IM=name+" "+nazwisko;
      
      //tablice
      String[] tablica={"a","b","c"}; //dynamiczny rozmiar
      int[] tabInt={1,2,3};
      
      System.out.println(tablica[0]);
      System.out.println(tablica.length);
      
      for(int i=0;i<tablica.length;i++){
           System.out.println(tablica[i]);
      }
      
      String[][] tablica2={ {"a","b","c"}, {"d","e","f"}};
      
      
      //zadanie1(); //tworzac metode ze static mozna wywolac bez obiektu
      //zadanie2();
      //zadanie3();
      //zadanie4();
      //zadanie5();
      
      Pracownik prac = new Pracownik("Jan","Kowalski",4000);
      System.out.println("Imie: "+prac.imie+", Nazwisko: "+prac.nazwisko+", Wypłata: "+prac.wyplata);
      
      Szef s1=new Szef(); // konstruktor domyślny niejawny
      s1.imie="Anna";
      s1.nazwisko="Nowak";
      s1.wyplata=20000;
      s1.premie=1000;
      System.out.println("Imie: "+s1.imie+", Nazwisko: "+s1.nazwisko+", Wypłata: "+s1.wyplata+" ,Premia "+s1.premie);
      
      System.out.println(prac.toString());
      
     
    }
    
      public static void zadanie1(){
      
      int[] tab1={3,5};
      int suma=0;
      for (int i : tab1){
            suma+= i;
      }  
      System.out.println(suma);
    }
      public static void zadanie2(){
          
          int[] tab2={10,3,6};
          int najwieksza=0;
          for (int i=0;i<tab2.length;i++){
              if(tab2[i]>najwieksza){
                   najwieksza=tab2[i];
              }
          }
         System.out.println(najwieksza);
      }
      public static void zadanie3(){
          String[] tekst={"sdf","sdff","asdnb"};
          
          for(int i=0;i<tekst.length;i++){
              System.out.println(tekst[i].toUpperCase());
          }
      }
      
      public static void zadanie4(){
           Scanner skan = new Scanner(System.in);
           int[] tab4 = new int[8];
           
           for(int i=0;i<8;i++){       
             tab4[i]=skan.nextInt();
           }
           
           int temp=0;
           for(int i=0; i<8; i++){  
                 for(int j=1; j<(8-i); j++){  
                    if(tab4[j-1]>tab4[j]){  
                        temp=tab4[j-1];  
                        tab4[j-1]=tab4[j];  
                        tab4[j]=temp;  
                         }         
                 }  
            }
            for(int x=0;x<8;x++){       
             System.out.print(tab4[x]+" ");
           }
          
               
       }
      public static void zadanie5(){
        Scanner skan = new Scanner(System.in);
         int[] tab5 = new int[5];
         
          for(int i=0;i<5;i++){       
             tab5[i]=skan.nextInt();
           }
          for (int i=0;i<tab5.length;i++){
              int temp=tab5[i];
              int silnia=1;
              for(int j=1;j<=temp;j++){
                  silnia *= j;
                  System.out.print(silnia+" ");
              }
              System.out.println("");
          }
      }

}
