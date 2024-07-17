package sumbyconst;

public class sum {
int x,y,z;

public sum(int x, int y, int z) {
	super();
	this.x = x;
	this.y = y;
	this.z = z;
}

public sum(int x, int y) {
	super();
	this.x = x;
	this.y = y;
	this.z=10;
}

public sum(int x) {
	super();
	this.x = x;
	this.y=x;
	this.z=x;
}

public sum() {
	this.x=10;
	this.y=10;
	this.z=10;
}
public int sumof()
{
	return x+y+z;
	
}
public static void main(String ar[])
{
	sum s=new sum(2,3,5);
	System.out.println("The sum is= "+s.sumof());
	sum s1=new sum(2,3);
	System.out.println("The sum is= "+s1.sumof());
	sum s2=new sum(2);
	System.out.println("The sum is= "+s2.sumof());
	sum s3=new sum();
	System.out.println("The sum is= "+s3.sumof());
}
}
