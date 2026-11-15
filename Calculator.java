import java.util.*;
class calculator{
    double op1,op2;
    calculator(double d1,double d2){
        op1=d1;
        op2=d2;
    }
    double add(){
        return op1+op2;
        }
    double sub(){
        return op1-op2;
    }
    double mul(){
        return op1*op2;
    }
    double div(){
        return op1/op2;
    }
}
class Demo
{
    public static void main(String args[])
    {
        int ch=0;
        double op1=0.0,op2=0.0;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter 1 to add"); 
            System.out.println("Enter 2 to Subtract");
            System.out.println("Enter 3 to Multiply");
            System.out.println("Enter 4 to Divide"); 
            System.out.println("Enter 5 to Exit"); 
            ch=sc.nextInt();
            if(ch == 5){
                System.out.println("Exiting...");
                break;
            }

            if(ch<1 ||ch>4){
                System.out.println("Invalid choice!");
                continue;
            }
        {
            System.out.println("Enter 1st value:");
            op1=sc.nextDouble();
            System.out.println("Enter 2nd value:");
            op2=sc.nextDouble();
        }
        calculator op=new calculator(op1,op2);
        switch(ch){
            case 1: 
            System.out.println("Addition =" +op.add());
            break;
            case 2:
            System.out.println("Subtraction ="+op.sub());
            break;
            case 3:
            System.out.println("Multiplication="+op.mul());
            break;
            case 4:
                if(op2==0){
                    System.out.println("Cannot divide by zero!");
                }
                else{
                    System.out.println("Divison="+op.div());
                }
            break;
            }
        }
        sc.close();

    }
}


