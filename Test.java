 class shape3D {
    String shape_type;
    shape3D(String S){
        shape_type=S;
    }
    double find_volume(double r){
        if(shape_type.equals("cube"))return r*r*r;
        else return(4.0/3.0)*3.14*r*r*r;
    }
    double find_volume(double r, double h){
        return(1.0/3.0)*3.14*r*r*h;
    }
    double find_volume(double l,double b,double h){
        return l*b*h;
    }
    
}
public class Test{
    public static void main(String[] args){
        shape3D S1= new shape3D("cube");
        shape3D S2= new shape3D("Sphere");
        shape3D S3= new shape3D("cone");
        shape3D S4= new shape3D("Cuboid");
        System.out.println("Volume of cube:"+S1.find_volume(5.0));
        System.out.println("Volume of Sphere:"+S2.find_volume(3.0));
        System.out.println("Volume of cone:"+S3.find_volume(3.0,5.0));
        System.out.println("Volume of cuboid:"+S4.find_volume(2.0,3.0,4.0));
        
    }

}
