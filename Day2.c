#include <stdio.h>


int main(void)
{
    int num;
    printf("숫자입력");
    scanf("%d", &num);
    printf("숫자입력값은 %d \n", num);
    rewind(stdin);
    int i = 1;
    while(i<11){
        if(i==5) break;
        printf("나무가 %d번 찍혔습니다.\n",i);
        if(i==10){
            printf("나무가 넘어갑니다.\n");
        }
        i++;
    }
    for(int a = 1; a<11; a++){
        printf("나무가 %d번 찍혔습니다.\n", a);
        if(a==10){
            printf("나무가 넘어갑니다.\n");
        }
    }
    int arrayA[5] = {90, 25, 67, 45, 80};
    for(int k=0; k<5; k++){
        if(arrayA[k]>60){
            printf("%d번째 학생은 합격입니다.\n", k+1);
        }
        else{
             printf("%d번째 학생은 불합격입니다.\n", k+1);
        }
    }
    int l=0;
        while(1){
            l++;
            if(l==101)break;
            if(l%2 ==0) continue;
            printf("%d\t",l);
        }
        for(int p=2; p<10;p++){
            for(int q=2; q<10; q++){
                printf("%d X %d = %d\n",p,q,p*q);
            }
        }
}
