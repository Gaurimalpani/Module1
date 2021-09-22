package Classes;

class Box {
    double weight;
    double depth;
    double height;
    double width;

    double volume(){
        return width * height * depth;
    }
    void  setValues(double a, double b, double c, double d){
        weight = a;
        depth = b;
        height = c;
        width = d;
    }
}