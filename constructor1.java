class hello
{
protected hello()
{
System.out.println("this is the parent class");
}
}
class hello1 extends hello
{
hello1()
{
super();
System.out.println("subclass constructor");
}
}
class constructor1
{
public static void main(String args[])
{
hello1 h=new hello1();
}}