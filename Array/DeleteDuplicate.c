#include <stdio.h>
void main()
{
    int i,j,k,n;
    printf("Enter no. of elements : ");
    scanf("%d",&n);
    
   int a[n];

    for(i=0;i<n;i++){
    printf("Enter element no.%d : ",i+1);
    scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(a[i]==a[j]){
                for(k=j;k<n;k++){
                    a[k]=a[k+1];
                }
                n--;
                j--;
            }
        }
    }
    printf("\nNew Array : ");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    }

