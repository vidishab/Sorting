import java.util.Scanner;

public class mergesort {
    public void mergei(int n[],int temp[],int left,int right)
    {
        //print(n,right+1);
        int mid;
        if(right > left)
        {
            mid = (right + left) / 2;
            mergei(n, temp, left, mid);
            mergei(n, temp, mid + 1, right);
            merge(n, temp, left, mid + 1, right);
        }
    }
    public void merge(int n[],int temp[],int left,int mid,int right)
    {
        int size,left_end,temp_pos;
        size=right-left+1;
        temp_pos=left;
        left_end=mid-1;
        while ((left<=left_end) && (mid <= right))
        {
            if(n[left] <= n[mid])
            {
                //System.out.println(n[left]);
                temp[temp_pos]=n[left];
                temp_pos+=1;
                left+=1;
            }
            else
            {
                temp[temp_pos]=n[mid];
                temp_pos+=1;
                mid+=1;
            }
        }
        while (left<=left_end)
        {
            temp[temp_pos]=n[left];
            temp_pos+=1;
            left+=1;
        }
        while (mid<=right)
        {
            temp[temp_pos]=n[mid];
            temp_pos+=1;
            mid+=1;
        }
        for(int i=0;i<size;i++)
        {
            n[right]=temp[right];
            right-=1;
        }
    }
    public void print(int n[], int v)
    {
        for(int i=0;i<v;i++)
        {
            System.out.print(n[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        mergesort ob = new mergesort();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int v = sc.nextInt();
        int n[] = new int[v];
        int temp[]=new int[v];
        System.out.println("Enter elements");
        for (int i = 0; i < v; i++)
        {
            n[i]=sc.nextInt();
        }
        ob.mergei(n,temp,0,v-1);
        ob.print(n,v);
    }
}

