/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gursi
 */

    
import java.util.*;

import java.util.Scanner;

public class Main

{



public static int[] getGrades(int grade_arr[])

{

  

Scanner sc = new Scanner(System.in);

int a = 0,n = grade_arr.length;

System.out.println("Please Enter up to 20 grades follwed by a -1 when you are done.");



for(a=0;a<n;a++)

{

int temp = sc.nextInt();



if(temp==-1)

{

break;

}

else

{


grade_arr[a] = temp;

}

}


return grade_arr;

}



public static float calcAvg(int grade_arr[])

{

float avg = 0;

int a =0,sum=0,c=0;

int n = grade_arr.length;

//runs the loop

while(grade_arr[a]!=0)

{



sum = sum+grade_arr[a];



c++;

a++;

}



avg = sum/c;


return avg;

}



public static int calcMax(int grade_arr[])

{

int n = grade_arr.length;



int max = grade_arr[0],a=0;

  

while(grade_arr[a]!=0)

{


if(max<grade_arr[a])

{

max = grade_arr[a];

}

a++;

}

return max;

}



public static int calcMin(int grade_arr[])

{

  

int min = grade_arr[0],a=0;

  

while(grade_arr[a]!=0)

{



if(grade_arr[a]<min)

{

min = grade_arr[a];

}

  

a++;

}

return min;

}

   public static void main(String[] args)

   {

  

   int grade_arr[] = new int[20];

   int min=0,max = 0;

   float avg = 0;



   grade_arr = getGrades(grade_arr);


   min = calcMin(grade_arr);

   

   max = calcMax(grade_arr);

   

   avg = calcAvg(grade_arr);

   System.out.print("Lowest grade: "+min);

   System.out.println("\nHighest grade: "+max);

   System.out.print("Average grade: "+avg);

  

   }

}

