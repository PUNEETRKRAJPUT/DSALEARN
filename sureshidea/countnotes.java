package sureshidea;
import java.util.*;

public class countnotes {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int amount=sc.nextInt(); 
        int count500=0;
        int count200=0;
        int count100=0;
        int count50=0;
        int count20=0;
        int count10=0;
        int count5=0;
        int count2=0;
        int count1=0;
        while (amount>0){
        if(amount>=500){   
            count500=amount/500; //164
            amount=amount-(count500*500);//82300-(164x500)300 == 300

        } else if(amount>=200){
            count200=amount/200;
            amount=amount-(count200*200);//100
        
        } else if(amount>=100){
            count100=amount/100;
            amount=amount-(count100*100);//100
        }
        else if(amount>=50){
            count50=amount/50;
            amount=amount-(count50*50);//100
        }
        else if(amount>=20){
            count20=amount/20;
            amount=amount-(count20*20);//100
        }
        else if(amount>=10){
            count10=amount/10;
            amount=amount-(count10*10);//100
        }
        else if(amount>=5){
            count5=amount/5;
            amount=amount-(count5*5);//100
        }
        else if(amount>=2){
            count2=amount/2;
            amount=amount-(count2*2);//100
        }
        else if(amount>=1){
            count1=amount/1;
            amount=amount-(count1*1);//100
        }
    }

        System.out.println("500 :"+ count500);
        System.out.println("200 :"+ count200);
        System.out.println("100 :"+ count100);
        System.out.println("50 :"+ count50);
        System.out.println("20 :"+ count20);
        System.out.println("10 :"+ count10);
        System.out.println("5 :"+ count5);
        System.out.println("2 :"+ count2);
        System.out.println("1 :"+ count1);
    }
}
