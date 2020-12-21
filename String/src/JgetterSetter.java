
public class JgetterSetter {
	String name;
	int roll;
	
//     public void	JgetterSetter(String name,int rollno)
//	{
//		this.name=name;
//		this.roll=roll;
//	}
	
    public int getRoll()
    {
    	return roll;
    }
    public void setRoll(int roll)
    {
    	this.roll=roll;
    }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    
     public void printDetails()
     {
    	 System.out.println(getName() + "," + getRoll());
     }
    
     public static void main(String[] args)
     {
		JgetterSetter j=new JgetterSetter();
		j.setName("arp");
		j.setRoll(1);
		System.out.println(j.getName());
		System.out.println(j.getRoll());
		j.printDetails();
		
	}

}