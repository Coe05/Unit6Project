public class Equipment extends garage
{
    private String Type; 
    public Equipment(int Q, boolean CD, String T)
    {
        super(Q,CD); 
        Type = T; 
    }
    //Accesor Methods
    public String getType()
    {
        return Type;
    }
    //update method
    public void updateType(String x)
    {
        Type = x;
    }
    //toString 
    public String toString()
    {
        return super.toString() + "Type;" + Type;
    }

}
