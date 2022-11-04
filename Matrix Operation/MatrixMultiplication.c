#include <stdio.h>
    void main()
    {
        int i,j,k,row,column;
        printf("Enter the no. of rows : ");
        scanf("%d",&row);
        printf("Enter the no. of columns : ");
        scanf("%d",&column);
        
    int A[row][column],B[row][column],mul[row][column];

        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                printf("Enter element m%d%d : ",i+1,j+1);
                scanf("%d",&A[i][j]);
            }
        }
        
            for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                printf("Enter element n%d%d : ",i+1,j+1);
                scanf("%d",&B[i][j]);
            }
        }
        printf("\nMatrix A : \n");
        for(i=0;i<row;i++){                                     //print matrix A
            for(j=0;j<column;j++){
                printf("%d\t",A[i][j]);
            }
            printf("\n");
        }
        printf("\nMatrix B : \n");
                for(i=0;i<row;i++){                             //print matrix B
            for(j=0;j<column;j++){
                printf("%d\t",B[i][j]);
            }
            printf("\n");
                }
                 for(i=0;i<row;i++){                 //multiplication logic
                  for(j=0;j<column;j++){
                       mul[i][j]=0;
                       for(k=0;k<column;k++){
                        mul[i][j]+=A[i][k]*B[k][j];
                       }
                  }
                 }
                 printf("\nMartrix AxB :\n");
                 for(i=0;i<row;i++){            
                  for(j=0;j<column;j++){
                    
                    printf("%d\t",mul[i][j]);
                  }
                  printf("\n");
                 }
                }
            
        
        
        
    
    
    
    
    
    
    
