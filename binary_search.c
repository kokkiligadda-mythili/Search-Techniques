#include <stdio.h>
#include <stdlib.h>

int main() {
    int arr[100], st, mid, end, i, num, tgt;

    printf("Define the size of the array: \n");
    scanf("%d", &num);
    printf("Enter the values in sorted array either ascending or descending order: \n");
    for (i = 0; i < num; i++) {
        printf("arr[%d] = ", i);
        scanf("%d", &arr[i]);
    }

    st = 0;
    end = num - 1;
    printf("Define a value to be searched from sorted array: \n");
    scanf("%d", &tgt);
    while (st <= end) {
        mid = (st + end) / 2;
        if (arr[mid] == tgt) {
            printf("Element is found at index %d", mid);
            exit(0);
        } else if (tgt > arr[mid]) {
            st = mid + 1;
        } else if (tgt < arr[mid]) {
            end = mid - 1;
        }
    }
    printf("Number is not found. \n");
    return 0;
}
