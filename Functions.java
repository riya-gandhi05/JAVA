import java.util.Scanner;

public class Functions {
    //    public static int printhelloworld() {
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        return ;
//    }
//    public static void main(String args[]) {
//        printhelloworld();
//    }
//}
//    public static int printhelloworld() {
//        System.out.println("Hello world");
//        return 5;
//    }
//
//    public static void main(String args[]) {
//        int x = printhelloworld();
//        System.out.println(x);
//    }

//    public static void swaps(int num1,int num2){
//        int temp=num1;
//         num1=num2;
//         num2=temp;
//
//    }
//
//    public static void main(String[] args) {
//        int a=5;
//        int b=6;
//        swaps(a,b);
//        System.out.println(a);
//        System.out.println(b);
//
//    }


//    public static int prod(int a,int b){
//        int product=a*b;
//        System.out.println(product);
//        return product;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter number1 :");
//        int num1=sc.nextInt();
//        System.out.println("enter number2:");
//        int num2=sc.nextInt();
//        prod(num1,num2);
//
//        //prod(2,4);
//    }
//
//    public static int fact(int n){
//
//        int f=1;
//        for(int i =1;i<=n;i++){
//            f=f*i;
//        }
////        for(int i =1;i<=r;i++){
////            f=f*i;
////        }
//        System.out.println(f);
//        return f;
//    }
//
//    public static int Binomialcoef(int n,int r){
//
//
//
//        int n_fact = fact(n);
//        int r_fact = fact(r);
//        int nmr_fact = fact(n-r);
//
//        int bincoeff = n_fact / (r_fact * nmr_fact);
//        return bincoeff;
//    }
//
//
//    public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter the number ");
//    int n= sc.nextInt();
//    int r= sc.nextInt();
//    fact(n);
//
//    }
//
//public static int primeNum(int num){
//    for(int i=2;i<=num-1;i++){
//        if(num%i==0){
//            System.out.println("is not prime");
//        }else{
//            System.out.println("is prime");
//        }
//    }
//
//    return num;
//}
//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("enter the number:");
//    int num=sc.nextInt();
//    primeNum(num);

//}
    public static void binToDec(int binNum){
    int myNum=binNum;
    int pow=0;
    int decNum=0;

    while(binNum>0){
        int lastDigit=binNum%10;
        decNum=decNum+(lastDigit*(int)Math.pow(2,pow));

        pow++;
        binNum=binNum/10;
    }
        System.out.println("decimal of"+myNum+"="+decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}