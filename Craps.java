public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise the amount won.
    public int play ( ) { 
        int x = r.total();
        if(x  == 7|| x == 11) 
            return 1;
        else if(x == 2 || x == 3 || x == 12) 
            return 0;
        else{
            while(x != r.total()){
                
            }
            return 1;
        }
       
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
    	
    }
}
