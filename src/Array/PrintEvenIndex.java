package Array;

public class PrintEvenIndex {

    public static void main(String[] args) {

        int arr[]={10,20,30,40,50};

        //display even index value
        for (int i=0;i<5;i++)
        {
            if(i%2==0)
            {
                System.out.println(arr[i]);
            }
        }

        System.out.println("********************************");
        for (int i=0;i<5;i++)
        {
            if(i%2!=0)
            {
                System.out.println(arr[i]);
            }
        }



    }
}
