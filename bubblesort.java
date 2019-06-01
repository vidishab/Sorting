import java.util.Scanner;

public class bubblesort {
    public void bubble(int n[],int v)
    {
        int temp=0,swapped=1;
        for(int pass=v-1;pass>=0 && swapped==1 ;pass--)
        {
            swapped=0;
            for (int i=0;i<pass-1;i++)
            {
                if(n[i] > n[i+1])
                {
                    System.out.println("Swap " + n[i] + " " + n[i+1]);
                    temp=n[i];
                    n[i]=n[i+1];
                    n[i+1]=temp;
                    swapped=1;
                }
            }
        }
    }
    public void print(int n[],int v)
    {
        for (int i=0;i<v;i++)
        {
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String args[])
    {
        bubblesort ob = new bubblesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[]=new int[v];
        System.out.println("Enter elements");
        for(int i=0;i<v;i++)
        {
            n[i]=sc.nextInt();
        }
        ob.bubble(n,v);
        ob.print(n,v);
    }
}

