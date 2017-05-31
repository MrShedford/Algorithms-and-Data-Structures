package pack;
import java.util.*;


public class Stub{

    public static void main (String[] args){
        Scanner myscanner = new Scanner(System.in);
        int days = 753;
        int stocks = 487;
        double[][] contents = new double[days][stocks];//the array is made up of each day followed by the value of stocks on that day
        for(int i=0;i<days;i++){//goes through each day
            for(int j=0;j<stocks;j++){//goes through each stock on each day
                contents[i][j]=myscanner.nextDouble();//is filled from the scanner, the value of the stock
            }
        }
        double[][] contents2 = new double[days][stocks];//recreates the first one to hold onto it
        for(int i=0;i<days;i++){
            for(int j=0;j<stocks;j++){
                contents2[i][j]=contents[i][j];
            }
        }
        double[] solution = solve(contents);//takes in the content array of days and stocks
        double diff=0;
        int chosen=0;
        double totalweight=0;
        for(int i=0;i<stocks;i++){
            if(solution[i]<0){
                chosen=i;//one stock is denoted with the -1 to show it's the one being chosen
            }else{
                totalweight+=solution[i];//total weight is everything else in this array
            }
        }

        for(int i=0;i<days;i++){
            double portfolio=0;
            for(int j=0;j<stocks;j++){
                if(solution[j]>0){
                    portfolio+=solution[j]/totalweight*contents2[i][j];
                }
            }
            diff+=(contents2[i][chosen]-portfolio)*(contents2[i][chosen]-portfolio);
        }
        System.out.println(diff*1000);
    }



    public static double[] solve(double[][] contents){

        //fill this in
        //return a solution array with one negative weight indicating your selected stock and positive weights making up your portfolio
        int stocks = contents[0].length;
        double[] solution = new double[stocks];
        for(int i=0; i<stocks;i++){
            solution[i]=1;
        }
        solution[100]=-1;
        return solution;
    }
}