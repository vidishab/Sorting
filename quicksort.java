import java.util.Scanner;

public class quicksort {
    public void quick(int n[],int low, int high)
    {
        int pivot;
        if(high > low)
        {
            pivot=partition(n,low,high);
            quick(n,low,pivot);
            quick(n,pivot+1,high);
        }
    }
    public int partition(int n[],int low, int high)
    {
        int temp=0;
        int left,right,pivot_item=n[low];
        left=low;
        right=high;
        while(left<right)
        {
            while (n[left]<=pivot_item)
                left++;
            while (n[right]>pivot_item)
                right--;
            if(left<right)
            {
                temp=n[left];
                n[left]=n[right];
                n[right]=temp;
            }
        }
        n[low]=n[right];
        n[right]=pivot_item;
        return right;
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
        quicksort ob = new quicksort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[] = new int[v];
        System.out.println("Enter elements");
        for (int i = 0; i < v; i++)
        {
            n[i]=sc.nextInt();
        }
        ob.quick(n,0,v-1);
        ob.print(n,v);
    }
}

