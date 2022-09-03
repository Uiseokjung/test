#include <stdio.h>
#pragma warning(disable:4996)

int main(void)
{
    /* code */
    int result = sum(10);
    printf("for문으로 1~n까지 합 : %d\n", result);
    int result1 = sum(10);
    printf("재귀함수로 1~n까지 합 : %d\n", result1);
    int n;
    printf("숫자를 입력하시오 : ");
    scanf("%d", &n);
    checkNum(n);

    int arrayA[5] = {10, 20, 30, 40, 50};
    int arrayAlen = sizeof(arrayA) / sizeof(int);
    printf("arrayA의 배열크기 : %d\narrayA배열 : ", arrayAlen);
    for(int i =0; i<5; i++){
        printf("%d\t", arrayA[i]);
    }

    int mathNum[10] = {85,65,90,70,100,50,30,75,80,90};
    printf("\nA반 수학점수 : ");
    for(int i = 0; i<10; i++){
        printf("%d\t", mathNum[i]);
    }
    int mathSum = 0;
    for(int i = 0; i<10; i++){
        mathSum += mathNum[i];
    }
    printf("\nA반 수학점수 총합 : %d\n", mathSum);
    printf("A반 수학점수 평균 : %f\n", (double)mathSum/10);

    int arrayB[3][3] = {{1,2,3},{5,1,2},{10,20,30}};
    printf("arrayB의 배열 : ");
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            printf("%d\t", arrayB[i][j]);
        }
    }

    int grade[3] = {85,65,90};
    //메모리 주소는 16진수로 되어있다.
    printf("\ngrade의 메모리 주소 : %#x\n", grade);
    printf("&grade의 메모리 주소 : %#x\n", &grade);
    for(int i=0;i<3;i++){
         printf("grade[%d]의 메모리 주소 : %#x\n",i, &grade[i]);
    }
    int k = 100;
    int *ptr = &k;
    printf("int *ptr = &k : %d\n",ptr);
    printf("int *ptr = &k : %#x\n",ptr);
    printf("int *ptr = &k : %d\n",*ptr);
    //int ptra = &k;
    //printf("int ptra = &k : %d\n",ptra);
}
int sum(int n){
    int result = 0;
    for(int i=1; i<n+1; i++){
        result += i;
    }
    return result;
}

int sum1(int n){
    if(n==1){
        return 1;
    }
    return n + sum(n-1);
}

int checkNum(int n){
   if(n==0) return 0;
   checkNum(n/10);
   printf("%d\n", n%10);
}
