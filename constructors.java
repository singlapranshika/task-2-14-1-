class epam
{
private String name,task,college;
private int floor;

epam()
{
System.out.println("welcome to epam");
}
epam(String name,String college)
{
this.name=name;
this.college=college;
System.out.println(name+" from "+college);
}
epam(String task,int floor)
{
this.task=task;
this.floor=floor;
System.out.println(task+" on "+floor+ "floor");
}
}
class constructors
{
public static void main(String args[])
{
epam e=new epam();
epam e1=new epam("Pranshika","Chitkara University");
epam e2=new epam(".NET",10);
}
}