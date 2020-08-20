package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int res = 1+2;
        System.out.println(res);

        boolean isAlien = false;
        if(isAlien == true)
            System.out.println("it is not an alien");

        int newValue = 50;
        if(newValue == 50){

            System.out.println("this is error");

        }
        boolean iscar = true;
        if(!iscar)
        {
            System.out.println("this should not happen");
        }
        //ternary operator
        boolean wasCar = iscar? true : false; //ternary or conditional operator
        if(wasCar){
            System.out.println("wascar is true");
        }
        //operator challenge
        double myvar = 20.00d;
        double myvar2 = 80.00d;
        double myres = (myvar + myvar2) * 100.00d;
        System.out.println(myres);
        myres = myres % 40.00d;
        System.out.println(myres);
        boolean isremainder = (myres == 0)? true:false;
        if(!isremainder) {
            System.out.println("true");
        }


    }
}
