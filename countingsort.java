

import java.util.Scanner;

public class countingsort {
    int count=1,val,pos;
    public void count(int n[],int v,int range)
    {
        int b[]=new int[range+1];
        int c[]=new int[v+1];
        for(int i=0;i<=range;i++)
        {
            b[i]=0;
        }
        for(int i=0;i<n.length;i++)
        {
            b[n[i]]=b[n[i]]+1;
        }
        for(int i=1;i<b.length;i++)
        {
            b[i]+=b[i-1];
        }
        for(int i=0;i<n.length && pos<=v ;i++)
        {
            val=n[i];
            pos=b[val];
            //System.out.println(val + " " + pos);
            c[pos]=val;
            b[val]--;
        }
        for(int i=1;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
    public static void main(String args[])
    {
        countingsort ob = new countingsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[] = new int[v];
        System.out.println("Enter elements");
        for (int i = 0; i < v; i++)
        {
            n[i]=sc.nextInt();
        }
        ob.count(n,v,range);
    }
}

