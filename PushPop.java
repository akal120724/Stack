import java.util.*;  
public class PushPop   
{  
public static void main(String args[])   
{  

Stack <Integer> stk = new Stack<>();  
System.out.println("stack: " + stk);  

  
pushelement(stk, 20);  
pushelement(stk, 13);  
pushelement(stk, 89);  
pushelement(stk, 90);  
pushelement(stk, 11);  
pushelement(stk, 45);  
pushelement(stk, 18);  

popelement(stk);  
popelement(stk);  

try   
{  
popelement(stk);  
}   
catch (EmptyStackException e)   
{  
System.out.println("empty stack");  
}  
}  

static void pushelement(Stack stk, int x)   
{  
   
stk.push(new Integer(x));  
System.out.println("push -> " + x);  

System.out.println("stack: " + stk);  
}  

static void popelement(Stack stk)   
{  
System.out.print("pop -> ");  

Integer x = (Integer) stk.pop();  
System.out.println(x);  
 
System.out.println("stack: " + stk);  
}  
}  
