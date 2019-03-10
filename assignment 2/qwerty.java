package assignment;
class info{
	public String name;
	public int age;
	public String city;
	info(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
}
class qwerty{
	public static int countstu(info f1,info f2,info f3)
	{
		  int c=1;
		  boolean m=false,d=false,e=false;
		
		  if((f1.age==f2.age)&&(f1.city==f2.city))
		  {
			if((f2.age==f3.age)&&(f2.city==f3.city))
			{
				if((f1.age==f3.age)&&(f1.city==f3.city)) {
					return 3;
				}
			}
			
		  }
		  else if((f1.age==f2.age)&&(f1.city==f2.city))
{
	c++;
}
		  else if((f2.age==f3.age)&&(f2.city==f3.city))
		  {
			 c++;
			
			
		}
		  else if((f1.age==f3.age)&&(f1.city==f3.city))
		  {
			 c++;
			 
		
	}
		  
		  else 
		  {
			  return 0;
		  }
		  
		return c;
	}
}
 class Student {
public static void main(String args[])
{
	
	
	info f1=new info("goku",1148,"bombo");
	info f2=new info("gokul",1148,"bombob");
	info f3=new info("goku",1148,"bombo");
	
	qwerty a=new qwerty();
	int count=a.countstu(f1,f2,f3);
	System.out.println(count);
	
	
}
}







