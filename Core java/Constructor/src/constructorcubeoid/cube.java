package constructorcubeoid;

public class cube {
int depth;
int height;
int width;
public cube(int depth, int height, int width) {
	super();
	this.depth = depth;
	this.height = height;
	this.width = width;
}
public cube(int depth, int width) {
	super();
	this.depth = depth;
	this.width = width;
	this.height=10;
}
public cube(int value) {
	super();
	this.width = value;
	this.depth=value;
	this.height=value;
}
public cube() {
	this.depth=30;
	this.height=10;
	this.width=20;
}
public int cubeof()
{
	return height*width*depth;
	
}
public static void main(String ar[])
{
	cube cubiod=new cube(10,20,20);
	System.out.println(cubiod.cubeof());
	cube cubiod1=new cube(10,20);
	System.out.println(cubiod1.cubeof());
	cube cubiod2=new cube(10);
	System.out.println(cubiod2.cubeof());
	cube cuboid3=new cube();
	System.out.println(cuboid3.cubeof());
}
}
