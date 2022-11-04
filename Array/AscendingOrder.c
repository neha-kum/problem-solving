#include <stdio.h>
void main()
{
    int n;
    printf("Enter the no. of elements : ");
    scanf("%d",&n);

      int a[n],temp;
    
    for(int i=0;i<n;i++){
        printf("Enter no.%d : ",i+1);
        scanf("%d",&a[i]);
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j])
                {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        printf("Ascending Order : ");
        for(int i=0;i<n;i++){
            printf("%d ",a[i]);
            
        }
        
        
}
