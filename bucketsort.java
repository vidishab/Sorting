import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class bucketsort {
    public void bucket(float n[],int range)
    {
        int index=0;
        float res[]=new float[n.length];
        LinkedList<Float> arr[]=new LinkedList[range];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new LinkedList<Float>();
        }
        for(int i=0;i<n.length;i++)
        {
            float val=(n[i]*10);
            int val1=(int)(n[i]*10);
            System.out.println(val);
            arr[val1].add(val);
        }
        for(int i=0;i<arr.length;i++)
        {
            Collections.sort(arr[i]);
        }
        for(int i=0;i<range;i++)
        {
            for(int j=0;j<arr[i].size();j++)
            {
                res[index]=arr[i].get(j);
                index+=1;
            }
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] + " ");
        }
    }
    public static void main(String args[])
    {
        bucketsort ob = new bucketsort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        float n[] = new float[v];
        System.out.println("Enter elements");
        for (int i = 0; i < v; i++)
        {
            n[i]=sc.nextFloat();
        }
        ob.bucket(n,range);
    }
}

