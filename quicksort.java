import java.util.*;
class quick_sort
{
    void create_array(int arr[],int size)
    {
        int i;
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter the data in array");
        for (i=0;i<size;i++)
        {
            arr[i]=myobj.nextInt();
        }
    }
    void display(int arr[],int size)
    {
        System.out.println("Displaying the result of the array");
        for (int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void quicksort_func(int arr[],int lb,int ub)
    {
        int i,j;
        if (lb<ub)
        {
            int loc=partition(arr,lb,ub);
            quicksort_func(arr,lb,loc-1);
            quicksort_func(arr,loc+1,ub);
        }
        
    }
    int partition(int arr[],int lb,int ub)
    {
        int pivot,start,end;
        pivot=arr[lb];
        start=lb;
        end=ub;
        while (start<end)
        {
            while (arr[start]<=pivot)
            {
                start++;
            }
            while (arr[end]>pivot)
            {
                end--;
            }
            if (start<end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int k;
        k=arr[lb];
        arr[lb]=arr[end];
        arr[end]=k;
        return end;
    }
}
class quicksort
{
    public static void main(String args[])
    {
        quick_sort l1=new quick_sort();
        System.out.println("Size of the array");
        Scanner myobj=new Scanner(System.in);
        int size,ch=1,choice;
        size=myobj.nextInt();
        int arr[]=new int[size];
        System.out.println("1.Creating the array\n2.Displaying the array\n3.Quick sort\n4.exit");
        int lowerbound=0,upperbound=size-1;
        while (ch==1)
        {
            System.out.println("Enter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    l1.create_array(arr,size);
                    break;
                }
                case 2:
                {
                    l1.display(arr,size);
                    break;
                    
                }
                case 3:
                {
                    l1.quicksort_func(arr,lowerbound,upperbound);
                    break;
                }
                case 4:
                {
                    ch=0;
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
        
    }
}