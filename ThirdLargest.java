import java.util.Scanner;

public class ThirdLargest{

public static void main(String[]args){

Scanner sc=new Scanner(System.in);

System.out.print("Enter the array size:");
int n=sc.nextInt();

int []arr=new int[n];


System.out.print("Enter the array Element:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int firstLargest=arr[0];
int secondLargest=-1000;
int thirdLargest=-999;
for(int i=0;i<n;i++){
if(arr[i]>firstLargest){
thirdLargest=secondLargest;
secondLargest=firstLargest;
firstLargest=arr[i];
}
else if(arr[i]>secondLargest && arr[i]!=firstLargest){
thirdLargest=secondLargest;
}
else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=firstLargest){
thirdLargest=arr[i];
}
}
System.out.println("Third Largest::"+thirdLargest);
sc.close();
}
}


