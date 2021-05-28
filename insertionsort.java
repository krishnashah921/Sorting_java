import java.util.*;
class insertion_sort
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
    void insertionsort_func(int arr[],int size)
    {
        int i,j,key;
        for (i=1;i<size;i++)
        {
            key=arr[i];
            j=i-1;
            while (j>=0 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
class insertionsort
{
    public static void main(String args[])
    {
        insertion_sort l1=new insertion_sort();
        System.out.println("Size of the array");
        Scanner myobj=new Scanner(System.in);
        int size,ch=1,choice;
        size=myobj.nextInt();
        int arr[]=new int[size];
        System.out.println("1.Creating the array\n2.Displaying the array\n3.insertion_sort\n4.exit");
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
                    l1.insertionsort_func(arr,size);
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