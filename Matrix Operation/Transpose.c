#include <stdio.h>
void main()
{
    int i,j,a[100][100],r,c,transpose[100][100];
    printf("Enter the no. of rows and columns : ");
    scanf("%d%d",&r,&c);
    
    for(i=0;i<r;i++){
        for(j=0;j<c;j++){
       printf("Enter element a%d%d : ",i+1,j+1);       //scan
       scanf("%d",&a[i][j]);
       }
    }
    
    printf("\nMatrix A : \n");
     for(i=0;i<r;i++){
         for(j=0;j<c;j++){
             printf("%d\t",a[i][j]);               //print A
         }
         printf("\n");
     }

    for(i=0;i<r;i++){                  //transpose logic
        for(j=0;j<c;j++){
            transpose[j][i]=a[i][j];
            
        }
    }      
       printf("\nTranspose of matrix A : \n");
       for(i=0;i<r;i++){
           for(j=0;j<c;j++){
               printf("%d\t",transpose[i][j]);             //print Transposr
           }
           printf("\n");
       }
}





