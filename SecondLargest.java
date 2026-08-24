import java.util.Scanner;

public class SecondLargest{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.print("Enter the array size:");
int n=sc.nextInt();
 int[]arr=new int[n];

System.out.print("Enter the array elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int SecondLargest=arr[0];
int Largest=arr[0];
for(int i=1;i<n;i++){
if(arr[i]>Largest){
SecondLargest=Largest;
Largest=arr[i];
}
else if(arr[i]>SecondLargest && arr[i]!=Largest){
SecondLargest=arr[i];
}
}
System.out.println("Largest:"+SecondLargest);
sc.close();
}
}

