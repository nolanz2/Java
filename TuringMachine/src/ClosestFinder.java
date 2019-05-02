package project1;

import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class ClosestFinder {

	public static List<CoordinateDetail> allPoints = new ArrayList<>();
	public static void output(final String msg, PrintWriter outputfile) {        
	    outputfile.println(msg);
	    
	}
    public static void main(String[] args) throws IOException {

	    FileWriter fwriter = new FileWriter("results_closest.txt", true);
	    PrintWriter outputfile = new PrintWriter(fwriter);
        File f = new File("results_closest.txt");
        Scanner scan = new Scanner(System.in);
        String line = System.getProperty("line.separator");
        scan.useDelimiter(line);

        List<Coordinate> points = new ArrayList<>();
        Random random = new Random();
        //Generate 30 random points, between -100 and 100 to avoid very large numbers (for easier readability)
        for (int x=1;x<30;x++){
            points.add(new Coordinate(getRandomNumberInRange(-100,100),getRandomNumberInRange(-100,100)));
        }

        System.out.println("Enter an 'n' for 'nth pair of closest points: ");
        System.out.println("Coordinate list: " + points);
        output("Coordinate list: " + points, outputfile);
        CoordinateDetail bruteForceClosestPair = bruteForce(points);       
        CoordinateDetail dqClosestPair = divideAndConquer(points);
        //collect all pairs of points and their respective distance, then output to screen.
        for(int i = 0; i <= allPoints.size()-1; i++){
            System.out.print(allPoints.get(i) + "\n");
            output(allPoints.get(i) + "\n", outputfile);
         }
        System.out.println("");
        System.out.println("Brute force: " + bruteForceClosestPair);
        System.out.println("Divide and conquer" + dqClosestPair);
        //output("");
        output("Brute force: " + bruteForceClosestPair , outputfile);
        output("Divide and conquer" + dqClosestPair , outputfile);
        
        outputfile.close();
    }

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
    private static class Coordinate {
    	private int id;
        private double x;
        private double y;

        public Coordinate(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public String toString() {
            return "(" + x + ", " + y +")";
        }
    }

    private static class CoordinateDetail {
        private Coordinate point1 = null;
        private Coordinate point2 = null;
        private double distance = 0.0;

        public CoordinateDetail(Coordinate point1, Coordinate point2, double distance) {
            this.point1 = point1;
            this.point2 = point2;
            this.distance = distance;
        }

        public Coordinate getPoint1() {
            return point1;
        }

        public Coordinate getPoint2() {
            return point2;
        }


        public double getDistance() {
            return distance;
        }


        public void set(Coordinate point1, Coordinate point2, double distance) {
            this.point1 = point1;
            this.point2 = point2;
            this.distance = distance;
        }

        public String toString() {
            return getPoint1() +" "+getPoint2()+" : distance = "+getDistance();
        }
    }

    private static double calDistance(Coordinate p1, Coordinate p2) {
        double xdist = p2.getX() - p1.getX();
        double ydist = p2.getY() - p1.getY();
        return Math.hypot(xdist, ydist);
    }

    private static CoordinateDetail bruteForce(List<Coordinate> points) {
        int coorSize = points.size();
        if (coorSize < 2)
            return null;
        
        for (int i=0;i<coorSize-1;i++) {
        	for (int j=i+1;j<coorSize-1;j++) {
        		CoordinateDetail coorPointAll = new CoordinateDetail(points.get(i), points.get(j),calDistance(points.get(i), points.get(j)));
        		if (!allPoints.contains(coorPointAll)) {
        		allPoints.add(coorPointAll);
        		}
        	}
        }
        
        
        
        CoordinateDetail coorPoint = new CoordinateDetail(points.get(0), points.get(1),calDistance(points.get(0), points.get(1)));

        if (coorSize > 2) {
            for (int i = 0; i < coorSize - 1; i++) {
                Coordinate point1 = points.get(i);
                for (int j = i + 1; j < coorSize; j++) {
                    Coordinate point2 = points.get(j);
                    double distance = calDistance(point1, point2);
                    if (distance < coorPoint.getDistance()) {
                        coorPoint.set(point1, point2, distance);
                    }
                }
            }
        }
        return coorPoint;
    }

    private static void sortByX(List<Coordinate> points) {
        Collections.sort(points, new Comparator <Coordinate>() {
            public int compare(Coordinate point1, Coordinate point2) {
                if (point1.getX() < point2.getX())
                    return -1;
                if (point1.getX() > point2.getX())
                    return 1;
                return 0;
            }
        });
    }

    private static void sortByY(List<Coordinate> points) {
        Collections.sort(points, new Comparator <Coordinate>() {
            public int compare(Coordinate point1, Coordinate point2) {
                if (point1.getY() < point2.getY())
                    return -1;
                if (point1.getY() > point2.getY())
                    return 1;
                return 0;
            } 
        });
    }


    public static CoordinateDetail divideAndConquer(List<Coordinate> points) {
        List<Coordinate> sortedX = new ArrayList<> (points);
        sortByX(sortedX);
        List<Coordinate> sortedY = new ArrayList<> (points);
        sortByY(sortedY);
        return divideAndConquer(sortedX, sortedY);
    }

    private static CoordinateDetail divideAndConquer(List<Coordinate> sortedX, List<Coordinate> sortedY) {
        int coorSize = sortedX.size();
        if (coorSize <= 3)
            return bruteForce(sortedX);

        int index = coorSize >>> 1;
        List<Coordinate>leftOfCenter = sortedX.subList(0, index);
        List<Coordinate>rightOfCenter = sortedX.subList(index, coorSize);

        List<Coordinate>tempList= new ArrayList<>(leftOfCenter);
        sortByY(tempList);

        CoordinateDetail closestPair = divideAndConquer(leftOfCenter, tempList);

        tempList.clear();

        tempList.addAll(rightOfCenter);
        sortByY(tempList);

        CoordinateDetail closestPairRight = divideAndConquer(rightOfCenter, tempList);

        if (closestPairRight.getDistance() < closestPair.getDistance())
            closestPair = closestPairRight;

        tempList.clear();

        double shortestDistance = closestPair.getDistance();
        double centerX = rightOfCenter.get(0).getX();
        for (Coordinate point: sortedY)
            if (Math.abs(centerX - point.getX()) < shortestDistance)
                tempList.add(point);

        for (int i=0; i<tempList.size()-1;i++) {
            Coordinate point1 = tempList.get(i);
            for (int j=i+1;j<tempList.size();j++) {
                Coordinate point2 = tempList.get(j);
                if ((point2.getY() - point1.getY()) >= shortestDistance)
                    break;
                double distance = calDistance(point1, point2);
                if (distance < closestPair.getDistance()) {
                    closestPair.set(point1, point2, distance);
                    shortestDistance = distance;
                }
            }
        }
        return closestPair;
    }

}
   