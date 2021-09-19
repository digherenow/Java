class Point {
    int x,y;
    Point(){}
}

class Point3D extends Point {
    int z;
    Point3D(int x){
        z = x;
    }
}

class Ex_10 {
    public static void main(String[] args) {
        Point3D p = new Point3D(100);
        System.out.println(p.z);
    }
}