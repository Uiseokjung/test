#include <stdio.h>
#include <stdlib.h>//malloc,free
#pragma warning(disable 4996)

int main(void){
    //스택
    int grade[3] = {85, 60, 90};
    printf("0번째 값은 ? %d\n", grade[0]);
    printf("0번째 주소는 ? %d\n", &grade[0]);
    printf("0번째 주소는 ? %#x\n", grade); // grade == &grade[0]
    printf("0번째 주소는 ? %d\n", grade);// grade == &grade[0]

    printf("국어 점수는? %d\n", grade[0]);
    printf("영어 점수는? %d\n", grade[1]);
    printf("수학 점수는? %d\n", grade[2]);
    printf("국어 점수 주소는? %#x\n", &grade[0]);
    printf("영어 점수 주소는? %#x\n", &grade[1]);
    printf("수학 점수 주소는? %#x\n", &grade[2]);

    int* pgrade = grade;
    printf("포인터를 이용한 국어점수는? %d\n", *pgrade);  
    printf("포인터를 이용한 영어점수는? %d\n", *(pgrade+1));   
    printf("포인터를 이용한 수학점수는? %d\n", *(pgrade+2));   

    int var = 10;
    printf("변수 var의 초기값은 %d입니다.\n", var);
    local(&var);
    printf("local() 함수 호출 후 변수 var의 값은 %d입니다.\n", var);

    int num00 = 0;
    int* ptr_int = &num00;//NULL;
    printf("포인터 ptr_int가 현재 가리키고 있는 value값은 %#x입니다.\n", *ptr_int);
    printf("포인터 ptr_int가 현재 가리키고 있는 주소값은 %#x입니다.\n", ptr_int+1);
    printf("포인터 ptr_int가 현재 가리키고 있는 주소값은 %#x입니다.\n", ++ptr_int);

    int arr[3] = {10,20,30};
    int* ptr = arr;
    //*ptr == arr[0] == *arr
    printf("arr의 주소는 %#x\n", arr);
    printf("ptr의 주소는 %#x\n", ptr);
    printf("ptr사용\n");
    printf("첫번째 주소의 value는? %d\n", *ptr);
    printf("두번째 주소의 value는? %d\n", *(ptr+1));
    printf("세번째 주소의 value는? %d\n", *(ptr+2));
    printf("arr사용\n");
    printf("첫번째 주소의 value는? %d\n", arr[0]);
    printf("두번째 주소의 value는? %d\n", arr[1]);
    printf("세번째 주소의 value는? %d\n", arr[2]);
    printf("*arr사용\n");
    printf("첫번째 주소의 value는? %d\n", *arr);
    printf("두번째 주소의 value는? %d\n", *(arr+1));
    printf("세번째 주소의 value는? %d\n", *(arr+2));

    //main함수가 있고 func함수가 있다. main함수에서 배열을 로컬함수로 넘겨 호출하면
    //로컬함수에서 for문을 돌려 메인함수에서 넘겨주는 배열을 for문으로 출력하라
    func(&arr);
    /*
    포인터배열이란 배열요소로 포인터변수를 가지는 배열
    int* arr[3] = {&num01, &num02, &num03};*/
    int num01 = 10, num02 = 20, num03 = 30;
    int* arr1[3] = {&num01, &num02, &num03}; //int 형 포인터 배열 선언

    //for문을 이용해서 해당 배열이 바라보고있는 value 출력
    //arr배열을 이용해서 10,20,30이 출려되도록 하여라
    for(int i=0; i<sizeof(arr1)/sizeof(int); i++){
        printf("arr1배열의 value값은 %d\n", *arr1[i]);
    }
    /*배열포인터란 배열을 가리킬 수 있는 포인터를 의미
    2차원이상 배열에서만 의미
    */
   int arr2[2][3] = {{10,20,30},{40,50,60}};

    char abc = 'a';
    char *pabc = &abc;
    int num1 = 20;
    int* numPtr1 = &num1;
    printf("%#x\n", numPtr1);
    int ptr2 = local1();
    int* test = ptr2;
    printf("test주소 값은? %#x", test);
}
void local(int* var){
    *var += 10;
    // 자바나 파이썬 >> 객체에다가 담으면 휘발되지 않는다. 객체 : 힙메모리
    printf("local 함수에서의 var값은? %d\n", *var);// 20
}

void func(int* arr){
    for(int i=0; i<=sizeof(arr)/sizeof(int); i++){
        printf("arr 배열의 value값은 %d\n", *(arr+i));
    }
}
void printArr(int(*arr)[4], int row, int col){

}
int local1(){
    int* numPtr2 = malloc(sizeof(int));
    *numPtr2 = 3;
    printf("numPtr2 값은? %d\n", *numPtr2);       
    printf("numPtr2 주소는? %d\n", numPtr2);
    printf("numPtr2 크기는? %d\n", sizeof(numPtr2));

    free(numPtr2);
    return numPtr2;
}