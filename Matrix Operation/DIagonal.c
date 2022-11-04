#include <stdio.h>
void main()
{
    int i,j,n;
    printf("Enter the no. of rows : ");
    scanf("%d",&n);

    int a[n][n];

    for(i=0;i<n;i++){                                      //scan 
        for(j=0;j<n;j++){
            printf("Enter element a%d%d : ",i+1,j+1);
            scanf("%d",&a[i][j]);
        }
    }
    printf("\nMatrix A : \n");
    for(i=0;i<n;i++){                                       //print
        for(j=0;j<n;j++){
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }
        printf("\nThe first diagonal elements are : ");
        for(i=0;i<n;i++){
            printf("%d\t",a[i][i]);
        }
        printf("\nThe second diagonal elements are : ");
        for(i=0;i<n;i++){
            printf("%d\t",a[i][n-1-i]);
        }
        
    }