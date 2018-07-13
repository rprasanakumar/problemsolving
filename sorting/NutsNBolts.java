import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

class NutsNBolts {

    /*
     * Complete the solve function below.
     */
    static String[] solve(int[] nuts, int[] bolts) {
        /*
         * Write your code here.
         */
         
         // sort the nuts array
         String[] result=new String[nuts.length];
        // Arrays.sort(bolts);
          quickSort(nuts,bolts,0,nuts.length-1);     
         
         for(int i=0;i<nuts.length;i++){
            result[i]=nuts[i]+" "+bolts[i];
         }
         
         return result;
    }
    
    
    static void quickSort(int[] nuts, int[] bolts,int start, int end){
        
   /*     if(start==end){
            return;
        }
        
        if(start==end+1){
            return;
        }*/
        
        int pivotIndex=randomPick(start, end);
        int partitionIndex= partition(nuts,start,end,bolts[pivotIndex]);
        
        partition(bolts,start,end,nuts[partitionIndex]);
        
        if(start<partitionIndex-1){
            quickSort(nuts,bolts,start,partitionIndex-1);    
        }
        
        if(partitionIndex+1<end){
            quickSort(nuts,bolts,partitionIndex+1,end);
        }
        
        
        
    }
    
    static int randomPick(int start, int end){
        return java.util.concurrent.ThreadLocalRandom.current().nextInt(start, end + 1);
    }
    
    static int partition(int[] arr,int start, int end, int pivot){
        
        int lowIndex=start-1;
        
        for(int i=start; i<end;i++){
            
            if(arr[i]==pivot){
                int temp=arr[end];
                arr[end]=pivot;
                arr[i]=temp;
            }
            
            if(arr[i]<pivot){
                lowIndex++;
                int temp=arr[lowIndex];
                arr[lowIndex]=arr[i];
                arr[i]=temp;
            }
            
        }
        
                
                int temp=arr[lowIndex+1];
                arr[lowIndex+1]=arr[end];
                arr[end]=temp;
                
                return lowIndex+1;
        
        
    }
    
private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nutsCount = Integer.parseInt(scan.nextLine().trim());

        int[] nuts = new int[nutsCount];

        for (int nutsItr = 0; nutsItr < nutsCount; nutsItr++) {
            int nutsItem = Integer.parseInt(scan.nextLine().trim());
            nuts[nutsItr] = nutsItem;
        }

        int boltsCount = Integer.parseInt(scan.nextLine().trim());

        int[] bolts = new int[boltsCount];

        for (int boltsItr = 0; boltsItr < boltsCount; boltsItr++) {
            int boltsItem = Integer.parseInt(scan.nextLine().trim());
            bolts[boltsItr] = boltsItem;
        }

        String[] res = solve(nuts, bolts);

        for (int resItr = 0; resItr < res.length; resItr++) {
            bw.write(res[resItr]);

            if (resItr != res.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}



private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nutsCount = Integer.parseInt(scan.nextLine().trim());

        int[] nuts = new int[nutsCount];

        for (int nutsItr = 0; nutsItr < nutsCount; nutsItr++) {
            int nutsItem = Integer.parseInt(scan.nextLine().trim());
            nuts[nutsItr] = nutsItem;
        }

        int boltsCount = Integer.parseInt(scan.nextLine().trim());

        int[] bolts = new int[boltsCount];

        for (int boltsItr = 0; boltsItr < boltsCount; boltsItr++) {
            int boltsItem = Integer.parseInt(scan.nextLine().trim());
            bolts[boltsItr] = boltsItem;
        }

        String[] res = solve(nuts, bolts);

        for (int resItr = 0; resItr < res.length; resItr++) {
            bw.write(res[resItr]);

            if (resItr != res.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}


