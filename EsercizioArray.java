package esercizioarray;
import java.util.Scanner;
public class EsercizioArray 
{
   public static void leggi (int m[][])
   {
       Scanner s=new Scanner (System.in);
       for (int i=0; i<m.length; i++)
           for (int j=0; j<m.length; j++)
           {
               System.out.println ("Inserisci elemento in posizione "+
                       +(i+1)+","+(j+1));
               m[i][j]=s.nextInt();
           }
   }
   
   public static void stampa (int m[][])
   {
         for (int i=0; i<m.length; i++)
         {
             System.out.println("\n");
             for (int j=0; j<m.length; j++)
                 System.out.print("\t"+m[i][j]);
         }
   }
   
   public static int massimo (int m[][])
   {
       int max=m[0][0];
       for (int i=0; i<m.length; i++)
           for (int j=0; j<m.length; j++)
               if (m[i][j]>max)
                   max=m[i][j];
       return max;
   }
    
   public static int minimo (int m[][])
   {
       int min=m[0][0];
       for (int i=0; i<m.length; i++)
           for (int j=0; j<m.length; j++)
               if (m[i][j]<min)
                   min=m[i][j];
       return min;
   }

   public static int[] diagonale (int m[][])
   {
       int v[] = new int [m.length];
       for (int i=0; i<m.length; i++)
               v[i]=m[i][i];
       return v;
   }
   
   public static int[][] trasposta (int m[][])
   {
       int t[][]=new int[m.length][m.length];
       for (int i=0; i<m.length; i++)
           for (int j=0; j<m.length; j++)
               t[i][j]=m[j][i];
       return t;
   }
   
   public static void main(String[] args)
   {
       Scanner s=new Scanner (System.in);
       int dim;
       do
       {
           System.out.println ("Inserisci la dimensione della matrice: ");
           dim=s.nextInt();
       }
       while (dim<2);
       int m[][] = new int [dim][dim];
       leggi(m);
       stampa(m);
       System.out.println("\n");
       int max=massimo(m);
       int min=minimo(m);
       System.out.println("Elemento massimo della matrice: "+max);
       System.out.println("Elemento minimo della matrice: "+min);
       int diag[]=diagonale(m);
       System.out.println("Elementi in diagonale principale:");
       for (int i=0; i<m.length; i++)
           System.out.print("\t"+diag[i]);
       int trasp[][]=trasposta(m);
       System.out.println("\nMatrice trasposta:");
       stampa(trasp);
       System.out.println("\n");
   }