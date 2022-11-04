#include <stdio.h>
void main()
{
    int i,j,n[100][100],m[100][100],row,column;
    printf("Enter the no. of rows : ");
    scanf("%d",&row);
    printf("Enter the no. of columns : ");
    scanf("%d",&column);
    
    for(i=0;i<row;i++){
        for(j=0;j<column;j++){
            printf("Enter element m%d%d : ",i+1,j+1);
            scanf("%d",&m[i][j]);
        }
    }
    
        for(i=0;i<row;i++){
        for(j=0;j<column;j++){
            printf("Enter element n%d%d : ",i+1,j+1);
            scanf("%d",&n[i][j]);
        }
    }
    printf("\nMatrix m :\n");
     for(i=0;i<row;i++){
        for(j=0;j<column;j++){
            printf("%d\t",m[i][j]);
        }
        printf("\n");
        }
        
    printf("\nMatrix n :\n");
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                printf("%d\t",n[i][j]);
            }
            printf("\n");
        }
        
    printf("\nSum of martrix m+n :\n");
           for(i=0;i<row;i++){
            for(j=0;j<column;j++){
              int sum=m[i][j]+n[i][j];
           printf("%d\t",sum);
            }
            printf("\n");
            }
            
        }
    
    
    





