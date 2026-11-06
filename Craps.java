public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise the amount won.
    public int play ( ) { 
        r.roll();
        int x = r.total();
        if(x  == 7|| x == 11) 
            return 1;
        else if(x == 2 || x == 3 || x == 12) 
            return 0;
        else{
           int point = x;
           r.roll();
           x = r.total();
           while(point != 7){
            if(point == x)
                return 1;
            else if(point != x)
                return 1;
                
           }
           return 0;
        }
       
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	
    }
    public static void main(String[] args) {
        Craps c1 = new Craps();
        System.out.println(c1);
    }
}
