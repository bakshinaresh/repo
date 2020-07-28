import java.io*;
import java.lang.*;
class A
{
A()
{
System.out.println(" this is class A constructor");
}
void m1()
{
System.out.println("this A m1");
}
}
class B extends A
{
B()
{
System.out.println(" B belongs Constructor");
}
void m1()
{
System.out.println("this is B Constructor");
}
}
class Ctest
{
public static void main(String args[])
{
A a=new B();
a.m1();
B b=new B();
b.m1();
}
}

