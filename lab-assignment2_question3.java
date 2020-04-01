import java.io.*; 
  
class pascalTriangle { 

    static void printPascal(int n) 
    { 
          
 
    for (int row = 0; row < n; row++) 
    { 

        for (int p = 0; p <= row; p++) 
        System.out.print(binomialCoeff 
                        (row, p)+" "); 
                          
        System.out.println(); 
    } 
    } 
    static int binomialCoeff(int n, int q) 
    { 
        int coe = 1; 
          
        if (q > n - q) 
        q = n - q; 
              
        for (int p = 0; p < q; ++p) 
        { 
            coe *= (n - p); 
            coe /= (p + 1); 
        } 
        return coe; 
    } 
      
    public static void main(String args[]) 
    { 
    int n = 10; 
    printPascal(n); 
    } 
} 
