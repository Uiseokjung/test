#include <stdio.h>

int main(void){
    char ch01 = 'a';
    printf("ch01의 메모리상의 주소는?? %d\n",&ch01);
    //메모리 사이즈 출력하는 함수는 sizeof(변수명)
    printf("ch01 메모리의 사이즈는?? %d\n", sizeof(ch01));
    //int형에 실수를 담아서
    int num = 3.14;
    //다른 데이터 타입에 값을 담았을때 어떤일이 벌어지는지를 보려함
    printf("num = %d\n",num);
    //더하기
    //num01, num02 선언하여 값을 할당하고
    int num01 = 21;
    int num02 = 5;
    //더한 값을 num03에 담아서 출력
    int num00 = num01 + num02;
    printf("num03 = %d\n",num00);
    //사칙연산(+, -, *, /, %나머지)
    printf("+ 연산자에 의한 결과값은 %d입니다.\n", num01 + num02);
    printf("- 연산자에 의한 결과값은 %d입니다.\n", num01 - num02);
    printf("* 연산자에 의한 결과값은 %d입니다.\n", num01 * num02);
    //몫을 구할경우, int형으로 연산하면 몫만 튀어나온다.
    printf("/ 연산자에 의한 결과값은 %d입니다.\n", num01 / num02);
    //나머지는 %로 구한다.
    printf("% 연산자에 의한 결과값은 %d입니다.\n", num01 % num02);
    int num03 = 20;
    int num04 = 3;
    printf("%f\n", (float)num03 / (float)num04);
    //printf("%f", num03 / num04);
    
    
}