/*package whatever //do not write package name here */

import java.util.*;

public class StringIntReverse {
    public static void main (String[] args) {


        Scanner sc= new Scanner(System.in);

        String input=sc.nextLine();

        if(isInteger(input)){
            int num=Integer.parseInt(input);
            processIntegerInput(num);
        }
        else {
            processStringInput(input);
        }



    }


    public static boolean isInteger(String input)
    {
        try {
            Integer.parseInt(input);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    private static void processIntegerInput(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
    }

    private static void processStringInput(String input)
    {
        String[] str=input.split(" ");

        reverse(str);

        for(int i=0;i<str.length;i++){
            int count=0;
            StringBuilder temp=new StringBuilder("");
            for(int j=0;j<str[i].length();j++){

                if(j==0){
                    temp.append(str[i].charAt(j));
                    count=1;
                }
                else if(str[i].charAt(j)==str[i].charAt(j-1))
                {
                    count++;
                    if(j==str[i].length()-1)
                        temp.append(count);


                }
                else{
                    if(count>1)
                    {
                        temp.append(count);
                    }
                    temp.append(str[i].charAt(j));
                    count=1;
                }
            }

            System.out.print(temp+" ");

        }
    }

    public static void reverse(String[] arr)
    {
        for( int i=0; i<arr.length/2;i++){
            String temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }
}