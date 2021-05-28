import java.util.*;
class radix_sort
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
    void radixsort_func(int arr[],int size)
    {
        int max=getmax(arr,size);
        for (int pos=1;(max/pos)>0;pos=pos*10)
        {
            countsort(arr,size,pos);
        }
    }
    void countsort(int arr[],int size,int pos)
    {
        int count[]=new int[10];
        int copy[]=new int[size];
        int i;
        for ( i=0;i<size;i++)
        {
            ++count[(arr[i]/pos)%10];
        }
        for (i=1;i<10;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for (i=size-1;i>=0;i--)
        {
            copy[--count[(arr[i]/pos)%10]]=arr[i];
        }
        for (i=0;i<size;i++)
    {
        arr[i]=copy[i];
    }
    }
    int getmax(int arr[],int size)
    {
        int i,max;
        max=0;
        for (i=0;i<size;i++)
        {
            if (arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    
}
class radixsort
{
    public static void main(String args[])
    {
        radix_sort l1=new radix_sort();
        System.out.println("Size of the array");
        Scanner myobj=new Scanner(System.in);
        int size,ch=1,choice;
        size=myobj.nextInt();
        int arr[]=new int[size];
        System.out.println("1.Creating the array\n2.Displaying the array\n3.Radix sort\n4.exit");
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
                    l1.radixsort_func(arr,size);
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