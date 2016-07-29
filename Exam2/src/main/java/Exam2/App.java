package Exam2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("请输入工资");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double count = a-3500;
        double gz = 0;
        if(count<=1500){
        	gz = count*0.03;
        }else if(count<=4500){
        	gz = (count-1500)*0.1+1500*0.03;
        }else if(count<=9000){
        	gz = (count-4500)*0.2+3000*0.1+1500*0.03;
        }else if(count<=35000){
        	gz = (count-9000)*0.25+(9000-4500)*0.2+3000*0.1+1500*0.03;
        }else if(count<=55000){
        	gz = (count-35000)*0.3+(35000-9000)*0.25+(9000-4500)*0.2+3000*0.1+1500*0.03;
        }else if(count<=80000){
        	gz = (count-55000)*0.35+20000*0.3+(35000-9000)*0.25+(9000-4500)*0.2+3000*0.1+1500*0.03;
        }else{
        	gz = (count-80000)*0.4+(80000-55000)*0.35+20000*0.3+(35000-9000)*0.25+(9000-4500)*0.2+3000*0.1+1500*0.03;
        }
        System.out.println(gz);
    }
}
