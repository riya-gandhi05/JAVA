import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        int counter = 0;
//                while(counter<10){
//                    System.out.println("hello world");
//                    counter++;
//                }

//        int num=0;
//        System.out.println("the numbers are");
//        while(num<=10){
//            System.out.println(num);
//            num++;
//        }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//        int counter = 1;
//        while(counter <= num){
//            System.out.println(counter);
//            counter++;
//        }
//


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//        int counter = 1;
//        int product=1;
//        while(counter <= num){
//            System.out.println(counter);
//            product=product*counter;
//            counter++;
//
//        }
//        System.out.println(product);


//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//        int counter = 1;
//        int sum=1;
//        while(counter <= num){
//            System.out.println(counter);
//            sum=sum+counter;
//            counter++;
//
//        }
//        System.out.println(sum)



//
//
//        for(int i =1;i<=10;i++){
//            System.out.println("Deepak♥Riya");
//        }


//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the num:");
//        int n=sc.nextInt();
//        while(n>0){
//            int last_digit=(n)%10;   // gives reminder of the number
//            System.out.print(last_digit);
//            n=n/10;
//            int removed_digit=(n)/10;// delete or removes the number
//            System.out.println("print the removed :"+removed_digit);
//        }
//        System.out.println();
//
//        int i=1;
//        do{
//            System.out.println("Riya♥Deepak");
//            i++;
//        } while(i<=10);
//


//        for(int i=1;i<10;i++){
//            if(i==5){
//                break; // condition true ho toh execution khtm
//            }
//            System.out.println(i);
//        }
//        System.out.println("out");


//       int i =1;
//       do{
//           System.out.println(i);
//           i++;
//       }while(i%10!=0);
     Scanner sc=new Scanner(System.in);
     do{
         System.out.print("enter your number :");
         int n=sc.nextInt();
         if(n%10==0){
             break;
         }
         System.out.println(n);
     }while(true);
   }
}
