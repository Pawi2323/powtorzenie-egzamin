import java.util.Scanner;

class Main{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj a");
        int a = sc.nextInt();
        System.out.println("Podaj b");
        int b = sc.nextInt();

        nwd(a, b);
        
        
    }
    // **********************************************
    // nazwa funkcji: nwd
    // opis funkcji: najwiekszy wspolny dzielnik
    // parametry: a - pierwsza liczba
    // b - druga liczba
    // zwracany typ i opis: void, nie zwraca nic
    // autor: ja
    // ***********************************************
    public static void nwd(int a, int b){
        if(a==b) System.out.println(a);
        else{
            if(a>b){
                a = a-b;
                nwd(a, b);
            }
            else{
                b = b-a;
                nwd(a, b);
            }
        }
    }
}