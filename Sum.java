import java.util.Scanner;

public class Sum{

public static void main(String[]args){


Scanner sc=new Scanner(System.in);

System.out.print("Enter the array size:");
int n=sc.nextInt();


int[]arr=new int[n];


System.out.print("Enter the array Element:");
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
}
 int sum=0;

for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}
System.out.println("Sum of array:"+sum);
sc.close();
}
}


