public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a;                 // Объявление переменной 'a' типа 'int'
                               // Объявление переменной 'A' типа 'Point'
        Point A = new Point(); // Создание объекта (экземпляра) 'А' класса 'Point'
        A.x = 2;
        A.y = 3;
        System.out.println("X = " + A.x);
        System.out.println("Y = " + A.y);

        Point B = new Point();
        B.x = 0;
        B.y = 0;
        System.out.println("X = " + B.x);
        System.out.println("Y = " + B.y);


        Point.distance(A,B);
    }
         class Point {
             double x;
             double y;
             static void distance(double A, double B) {

             }
         }
     }