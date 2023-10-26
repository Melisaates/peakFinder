# PeakFinder
--

PeakFinder is a Java program used to find peak points in 2D and 3D arrays. The program generates random 2D and 3D arrays and identifies peak points within these arrays.

Usage

To use the program, follow these steps:

- Download or copy the Java file that contains the PeakFinder class.
- Open the file in your Java development environment (IDE).
- Inside the main method, you can use the `random2dArray` or `random3dArray` methods to create a 2D or 3D array. You can specify the dimensions (rows, columns, depth) and the maximum random value for the array to be generated.
- You can find peak points using the `peakFinder2D` or `peakFinder3D` methods. You can provide the generated array, dimensions (rows, columns, depth), and a parameter specifying which axis you want to find the peak point on.
- You can print the results to the screen using the `print2d` or `print3d` methods.

Example usage:
--

```java
PeakFinder pf = new PeakFinder();
int n = 6, m = 6, rowOrCol = 1;
int[][] a = pf.random2dArray(n, m);

// Print the 2D array

pf.print2d(a);

// Find the peak point in the 2D array

int[] peak = pf.peakFinder2D(a, n, m, rowOrCol);
System.out.println("Peak Point: " + a[peak[0]][peak[1]]);

PeakFinder pf = new PeakFinder();
int n = 6, m = 6, d = 6;
int[][][] a = pf.random3dArray(n, m, d);

// Print the 3D array

pf.print3d(a);

// Find the peak point in the 3D array

int[] peak = pf.peakFinder3D(a, n, m, d);
System.out.println("Peak Point: " + a[peak[0]][peak[1]][peak[2]]);
```
License

This project is licensed under the MIT License. For more information, you can review the LICENSE file.
