import java.util.Scanner;

public class ThirdSmallest{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.print("Enter the array size:");
int n=sc.nextInt();

int []arr=new int[n];


System.out.print("Enter the array elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int smallest=arr[0];
int secondSmallest=999;
int thirdSmallest=1000;



for(int i=1;i<n;i++){
if(arr[i]<smallest){
 thirdSmallest=secondSmallest;
 secondSmallest=smallest;
 smallest=arr[i];
}
else if(arr[i]<secondSmallest && arr[i]!=smallest){
thirdSmallest=secondSmallest;
secondSmallest=arr[i];
}
else if(arr[i]<thirdSmallest && arr[i]!=secondSmallest && arr[i]!=smallest){
thirdSmallest=arr[i];
}
}
System.out.println("Third Smallest:"+thirdSmallest);
sc.close();
}
}








