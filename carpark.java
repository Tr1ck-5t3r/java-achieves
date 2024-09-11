package tarun;

import java.util.*;
public class carpark
{
    double money;
    int noc;
    void carpark()
    {
        noc=0;
        money=0;
    }
    public void payingCar()
    {
        noc++;
        money+=0.5;
    }
    public void nopaycar()
    {
        noc++;
    }
    public void total()
    {
        System.out.println(" no of cars: "+noc);
        System.out.println("money: "+money);
    }
    public static void main(String[] args) 
    {
        carpark o = new carpark();
        Scanner kb= new Scanner (System.in);

        while(true)
        {
            System.out.println("Enter 1 to add a paying car, 2 to adda non paying car 3 to display total and exit ");
            int ch=kb.nextInt();
            if(ch==1)
            o.payingCar();
            else if (ch==2)
            o.nopaycar();
            else if( ch==3)
            {
                o.total();
                break;
            }
            else
            System.out.println("invalid input");
            
        }

        kb.close();
    }
}
