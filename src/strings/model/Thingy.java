/**
 * Creates a thingy object to show access and proper variable
 * @author bsha6756
 * @version 1.0 09/24/15
 * 
 */


package strings.model;

public class Thingy
{
	private String name;
	private int age;
	private double weight;
	/**the first constructor is making the name,age,and weight for all the classes.
	 * 
	 * @return
	 */
	
	public Thingy()
	{
		name = "";
		age = -99;
		weight = - 0.008;	
	}
	
	public Thingy (String name, int age, double weight)
	{
		//this. refers to the current instance of this object ( a thingy) 
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	
	
	public String getName()
	{
		String name = null;
		
		return name;
	}
	public int getAge()
	{
		
		return age;
	}
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setWeight(double weight)
	{
		this.weight=weight;
	}
	
}
