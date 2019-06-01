import java.util.Scanner;

public class selectionsort {
    public void selection(int n[],int v)
    {
        int min=0,temp=0;
        for(int i=0;i<v-1;i++)
        {
            min=i;
            for(int j=i+1;j<v;j++)
            {
                if(n[j]<n[min])
                    min=j;
            }
            temp=n[i];
            n[i]=n[min];
            n[min]=temp;
        }
        //print(n,v);
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
        selectionsort ob = new selectionsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[]=new int[v];
        System.out.println("Enter elements");
        for(int i=0;i<v;i++)
        {
            n[i]=sc.nextInt();
        }
        ob.selection(n,v);
        ob.print(n,v);
    }
}

