import java.util.*;
class selection_sort
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
    void selectionsort_func(int arr[],int size)
    {
       int i,j,min;
       for (i=0;i<size;i++)
       {
           min=i;
           for (j=i+1;j<size;j++)
           {
               if (arr[j]<arr[min])
               {
                   min=j;
               }
           }
           if (min!=i)
           {
               int temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp;
           }
       }
    }
}
class selectionsort
{
    public static void main(String args[])
    {
        selection_sort l1=new selection_sort();
        System.out.println("Size of the array");
        Scanner myobj=new Scanner(System.in);
        int size,ch=1,choice;
        size=myobj.nextInt();
        int arr[]=new int[size];
        System.out.println("1.Creating the array\n2.Displaying the array\n3.Selection_sort\n4.exit");
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
                    l1.selectionsort_func(arr,size);
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