package MPP.Prob2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
    List<ClosedCurve> objects = new ArrayList<>();
    static List<ClosedCurvePoly> objects2=new ArrayList<>();
    public static void main(String[] args) {
        DataMiner dm = new DataMiner();
        dm.objects.add(new Circle(6));
        dm.objects.add(new Ellipse(3, 4));
        System.out.println(dm.computeAveragePerimeter());


        //ClosedCurvePoly...
        objects2.add(new Rectangle(3, 2));
        objects2.add(new EQTriangle(3));
        double ComputeSum=0;
        for (ClosedCurvePoly closedCurvePoly : objects2) {
            ComputeSum = ComputeSum + closedCurvePoly.computePerimeter();
        }
        System.out.println("Compute Perimeter for ClosedCurvePoly(Rectangle and EQTriangle): "+ComputeSum);
    }
    //OO (good) way of performing computation
    public double computeAveragePerimeter() {
        if(objects == null || objects.isEmpty()) return 0.0;
        double sum = 0.0;
        for(int i = 0; i < objects.size(); ++i) {
            sum += objects.get(i).computePerimeter();
        }
        return sum/objects.size();
    }

}
