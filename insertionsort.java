import java.util.Scanner;

public class insertionsort {
    public void insertion(int n[],int v)
    {
        int j,val=0;
        for(int i=1;i<v-1;i++)
        {
            j=i;
            val=n[i];
            //System.out.println(j + " " + val);
            while ( j>=1 && n[j-1] > val)
            {
                n[j]=n[j-1];
                //System.out.println(n[j] + " " + n[j-1]);
                j--;
                //System.out.println(j);
            }
            n[j]=val;
            //System.out.println(n[j]);
        }
    }
    public void print(int n[],int v)
    {
        for(int i=0;i<v;i++)
        {
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String args[])
    {
        insertionsort ob = new insertionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[]=new int[v];
        System.out.println("Enter elements");
        for(int i=0;i<v;i++)
        {
            n[i]=sc.nextInt();
        }
        ob.insertion(n,v);
        ob.print(n,v);
    }
}

