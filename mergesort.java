import java.util.*;
class merge_sort
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
    void mergesort_func(int arr[],int lb,int ub,int size)
    {
        int i,j;
        if (lb<ub)
        {
            int mid=(lb+ub)/2;
            mergesort_func(arr,lb,mid,size);
            mergesort_func(arr,mid+1,ub,size);
            merge(arr,lb,mid,ub,size);
        }
        
    }
    void merge(int arr[],int lb,int mid,int ub,int size)
    {
        int i,j,k,temp;
        int copy[]=new int[size];
        i=lb;
        k=lb;
        j=mid+1;
        while (i<=mid && j<=ub)
        {
            if (arr[i]<=arr[j])
            {
                copy[k]=arr[i];
                i++;
                k++;
            }
            else
            {
                copy[k]=arr[j];
                k++;
                j++;
            }
        }
     /*   while (i<=mid)
        {
            copy[k]=arr[i];
            i++;
            k++;
        }
        while (j<=ub)
        {
            copy[k]=arr[j];
            j++;
            k++;
        }*/
        if (i>mid)
        {
            while (j<=ub)
            {
                copy[k]=arr[j];
                k++;
                j++;
                
            }
            
        }
        else 
        {
            while (i<=mid)
            
            {
                copy[k]=arr[i];
                i++;
                k++;
            }
        }
         for (temp=lb;temp<=ub;temp++)
    {
        arr[temp]=copy[temp];
    }

    }
   
}
class mergesort
{
    public static void main(String args[])
    {
        merge_sort l1=new merge_sort();
        System.out.println("Size of the array");
        Scanner myobj=new Scanner(System.in);
        int size,ch=1,choice;
        size=myobj.nextInt();
        int arr[]=new int[size];
        System.out.println("1.Creating the array\n2.Displaying the array\n3.Merge sort\n4.exit");
        int upperbound=size-1,lowerbound=0;
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
                    l1.mergesort_func(arr,lowerbound,upperbound,size);
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