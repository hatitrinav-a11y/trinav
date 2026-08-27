#include<stdio.h>

int max(int a[],int l, int h){
    int mid;
    mid = (l+h)/2;
    if(l == h)
       return a[l];
    int left_max = max(a, l, mid );
    int right_max = max(a, mid+1, h);
    if(left_max > right_max)
         return left_max;
    else
         return right_max;

}

int min(int a[],int l, int h){
    int mid;
    mid = (l+h)/2;
    if(l == h)
       return a[l];
    int left_min = min(a, l, mid );
    int right_min = min(a, mid+1, h);
    if(left_min < right_min)
         return left_min;
    else
         return right_min;

}

int main()
{
    int n,i,p,q;
    printf("Enter the array sise :");
    scanf("%d", &n);
    int arr[n];
    printf("Enter the array elements :");
    for(i=0; i<n; i++){
        scanf("%d", &arr[i]);
    }
       // scanf("%d", &arr[i]);
    
    p = max(arr, 0, n-1);
    printf("\nMax element is :%d", p);

    q = min(arr, 0, n-1);
    printf("\nMin element is :%d", q);

    
    return 0;
}