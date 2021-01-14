public class MatrixAdditionExample
{  
    public static void main(String args[])
    {    
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};                  
        int s[][]=new int[3][3]; 
        int m[][]=new int[3][3]; 
        System.out.print("After matrix addition :\n");  
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                s[i][j]=a[i][j]+b[i][j];  
                System.out.print(s[i][j]+" ");    
            }    
            System.out.println();  
        } 
        System.out.print("After matrix multiplication :\n"); 
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
            {    
                m[i][j]=0;      
                for(int k=0;k<3;k++)      
                {      
                    m[i][j]+=a[i][k]*b[k][j];      
                } 
                System.out.print(m[i][j]+" "); 
            } 
            System.out.println();   
        }    
    }
} 
