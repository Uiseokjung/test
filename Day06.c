/*#include <stdio.h>

int main(void){
    int num;
    printf("은행 콜센터 프로그램입니다. 원하시는 서비스 번호를 누르세요.\n");
    scanf("%d", &num);

    switch(num){
        case 1: 
            printf("1번 선택\n"); 
            break;
        case 2:
            printf("2번 선택\n"); 
            break;
        case 3:
            printf("3번 선택\n"); 
            break;
        default: 
            printf("제대로 된 입력값이 아닙니다.");
            break;
    }
}*/
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<conio.h>
#include<time.h>
#pragma warning(disable : 4996)warning pragma

int point = 0;

//편의함수
void nums_to_arr(int** p, int a, int  b, int  c, int  d, int  e, int  f, int  g, int  h)
{
	p[0][0] = a;
	p[0][1] = b;
	p[1][0] = c;
	p[1][1] = d;
	p[2][0] = e;
	p[2][1] = f;
	p[3][0] = g;
	p[3][1] = h;
	return;
}
int spin(int n)
{
	if (n == 3) return 0;
	else return n + 1;
}
int anti_spin(int n)
{
	if (n == 0) return 3;
	else return n - 1;
}
void show_graphic(char*** p)
{
	int i, j = 0;
	for (i = 0; i < 30; i++)
	{
		for (j = 0; j < 30; j++)
		{
			printf("%s", p[i][j]);
		}
		printf("\n");
	}
	printf("                  현재점수 : %d", point);
	return;
}
int arrow(char key)
{
	switch (key)
	{
	case 72:
		return 0;
	case 75:
		return 1;
	case 77:
		return 3;
	case 80:
		return 2;
	default:
		return -1;
	}
}
int anti_arrow(char key)
{
	switch (key)
	{
	case 72:
		return 2;
	case 75:
		return 3;
	case 77:
		return 1;
	case 80:
		return 0;
	default:
		return -1;
	}
}
void show_coords(int** block_coors, int* location)
{
	int i;
	for (i = 0; i < 4; i++)
	{
		printf("%3d%3d\n", location[0] + block_coors[i][0], location[1] + block_coors[i][1]);
	}
	return;
}
void coor_to_coor(int** p, int** q)
{
	int i, j;
	for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 4; j++)
		{
			p[i][j] = q[i][j];
		}
	}
	return;
}




/********블록관련**********/
//블럭정보를 받으면 중심기준 점들의 위치를 반환
void block_type_to_coors(int** p, int blocktype, int spinvalue)
{
	switch (blocktype)
	{
	case 0:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, -1, 0, 0, 0, 1, 0, 2, 0);
			return;
		case 1:
			nums_to_arr(p, 0, -1, 0, 0, 0, 1, 0, 2);
			return;
		case 2:
			nums_to_arr(p, -1, 0, 0, 0, 1, 0, 2, 0);
			return;
		case 3:
			nums_to_arr(p, 0, -1, 0, 0, 0, 1, 0, 2);
			return;
		}
	case 1:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, -1, -1, 0, -1, 0, 0, 0, 1);
			return;
		case 1:
			nums_to_arr(p, -1, 0, 0, 0, 1, 0, 1, -1);
			return;
		case 2:
			nums_to_arr(p, 0, -1, 0, 0, 0, 1, 1, 1);
			return;
		case 3:
			nums_to_arr(p, -1, 0, -1, 1, 0, 0, 1, 0);
			return;
		}
	case 2:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, 0, -1, 0, 0, 0, 1, -1, 1);
			return;
		case 1:
			nums_to_arr(p, -1, -1, -1, 0, 0, 0, 1, 0);
			return;
		case 2:
			nums_to_arr(p, 1, -1, 0, -1, 0, 0, 0, 1);
			return;
		case 3:
			nums_to_arr(p, -1, 0, 0, 0, 1, 0, 1, 1);
			return;
		}
	case 3:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, -1, 0, 0, 0, 0, 1, 1, 1);
			return;
		case 1:
			nums_to_arr(p, 0, -1, 0, 0, -1, 0, -1, 1);
			return;
		case 2:
			nums_to_arr(p, -1, 0, 0, 0, 0, 1, 1, 1);
			return;
		case 3:
			nums_to_arr(p, 0, -1, 0, 0, -1, 0, -1, 1);
			return;
		}
	case 4:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, 0, 0, 0, 1, -1, 1, 1, 0);
			return;
		case 1:
			nums_to_arr(p, -1, -1, -1, 0, 0, 0, 0, 1);
			return;
		case 2:
			nums_to_arr(p, 0, 0, 0, 1, -1, 1, 1, 0);
			return;
		case 3:
			nums_to_arr(p, -1, -1, -1, 0, 0, 0, 0, 1);
			return;
		}
	case 5:
		switch (spinvalue)
		{
		case 0:
			nums_to_arr(p, 0, 0, 0, 1, 1, 0, 1, 1);
			return;
		case 1:
			nums_to_arr(p, 0, 0, 0, 1, 1, 0, 1, 1);
			return;
		case 2:
			nums_to_arr(p, 0, 0, 0, 1, 1, 0, 1, 1);
			return;
		case 3:
			nums_to_arr(p, 0, 0, 0, 1, 1, 0, 1, 1);
			return;
		}
	}
}

//포인터의 포인터의 포인터입니다. 해당 영상에서는 문자열을 원소로 가지고 2차원인 배열을 할당하기 위해  포인터의 포인터의 포인터를 사용
//좌표, 블록점좌표배열, 기준점을 받으면 블럭을 그래픽에 찍음
void put_block(char*** p, int** q, int a, int b)
{
	int i, tempi, tempj;
	for (i = 0; i < 4; i++)
	{
		tempi = a + q[i][0];
		tempj = b + q[i][1];
		p[tempi][tempj] = "■";
	}
}
//좌표, 블록점좌표배열, 기준점을 받으면 블럭을 그래픽에서 지움
void del_block(char*** p, int** q, int a, int b)
{
	int i, tempi, tempj;
	for (i = 0; i < 4; i++)
	{
		tempi = a + q[i][0];
		tempj = b + q[i][1];
		p[tempi][tempj] = "  ";
	}
}
//기준점, 방향키를 입력받으면 기준점을 변환
void move_coors(int* location, int key)
{
	int i;
	switch (key)
	{
	case 0:
		location[0] -= 1;
		return;
	case 1:
		location[1] -= 1;
		return;
	case 2:
		location[0] += 1;
		return;
	case 3:
		location[1] += 1;
		return;
	}
}
//블럭상대좌표, 기준점을 입력받으면 그래픽에 찍을 수 있는지를 판단
int can_put(char*** graphic, int** block_coors, int* location)
{
	int a, b, i;
	for (i = 0; i < 4; i++)
	{
		a = location[0] + block_coors[i][0];
		b = location[1] + block_coors[i][1];//a,b가 각각의 사각형좌표에 대응
		if ((b < 10) || (b > 19)) return 0;
		if (graphic[a][b] != "  ") return 0;
	}
	return 1;
}


/*******게임진행******/
//그래픽, 행을 입력받으면 해당 행이 꽉찼는지를 판단
int is_row_full(char*** graphic, int r)
{
	int j;
	for (j = 10; j < 20; j++) if (graphic[r][j] == "  ") return 0;
	return 1;
}
//그래픽을 받으면 줄지워주며 그래픽도 보여줌
void row_clear(char*** graphic)
{
	int i, j, k, high = 4;
	for (i = 24; i > high; i--)
	{
		if (is_row_full(graphic, i))//i열이 꽉찼으면
		{
			graphic[i][10] = "▣";
			graphic[i][11] = "▣";
			graphic[i][12] = "▣";
			system("cls");
			show_graphic(graphic);
			graphic[i][13] = "▣";
			graphic[i][14] = "▣";
			graphic[i][15] = "▣";
			system("cls");
			show_graphic(graphic);
			graphic[i][16] = "▣";
			graphic[i][17] = "▣";
			system("cls");
			show_graphic(graphic);
			graphic[i][18] = "▣";
			graphic[i][19] = "▣";
			system("cls");
			show_graphic(graphic);
			for (k = i; k > high; k--)//i행부터 위로 쭉
			{
				for (j = 10; j < 20; j++)//모든 열에
				{
					graphic[k][j] = graphic[k - 1][j];
				}
			}
			i++;
			high++;
			point += 1000;

		}
	}
}


//□■▩▣
int main()
{
	int i = 0, j = 0, key, a, b;
	int blocktype, spinvalue, next_blocktype, next_spinvalue;
	char*** graphic;//문자열을 원소로 갖는 2차원 배열
	int** block_coors;//블럭의 상대좌표들
	int** next_block_coors;
	int* location;//블럭중심의 위치
	int* tl;
	clock_t start;

	//graphic 동적할당
	graphic = (char***)malloc(sizeof(char**) * 30);
	for (i = 0; i < 30; i++)
	{
		graphic[i] = (char**)malloc(sizeof(char*) * 30);//30개의 열 확보
	}

	//block_coors 동적할당
	block_coors = (int**)malloc(sizeof(int*) * 4);
	for (i = 0; i < 4; i++)	block_coors[i] = (int*)malloc(sizeof(int) * 2);
	next_block_coors = (int**)malloc(sizeof(int*) * 4);
	for (i = 0; i < 4; i++)	next_block_coors[i] = (int*)malloc(sizeof(int) * 2);

	//location 동적할당
	location = (int*)malloc(sizeof(int) * 2);
	tl = (int*)malloc(sizeof(int) * 2);
	tl[0] = 7;
	tl[1] = 24;

	//기본세팅
	for (i = 0; i < 30; i++)
	{
		for (j = 0; j < 30; j++)
		{
			if (i == 25 && j > 8 && j < 21) graphic[i][j] = "▩";
			else if (j == 9 && i > 4 && i < 26) graphic[i][j] = "▩";
			else if (j == 20 && i > 4 && i < 26) graphic[i][j] = "▩";
			else graphic[i][j] = "  ";
		}
	}

	location[0] = 4;
	location[1] = 14;//기준점이 생성되는 점
	srand(time(NULL));
	blocktype = rand() % 6;
	spinvalue = rand() % 4;
	next_blocktype = rand() % 6;
	next_spinvalue = rand() % 4;
	block_type_to_coors(block_coors, blocktype, spinvalue);
	block_type_to_coors(next_block_coors, next_blocktype, next_spinvalue);
	put_block(graphic, block_coors, location[0], location[1]);
	put_block(graphic, next_block_coors, 7, 24);
	system("cls");
	show_graphic(graphic);
	start = clock();
	while (1)
	{
		//키가 눌린 경우
		if (kbhit())
		{
			key = getch();

			//방향키가 눌린경우
			if (key == 224)
			{
				key = getch();

				//상 키가 눌린경우
				if (arrow(key) == 0)
				{
					del_block(graphic, block_coors, location[0], location[1]);//블럭을 지우고
				spinvalue = spin(spinvalue);//블럭회전상수를 키우고
				block_type_to_coors(block_coors, blocktype, spinvalue);//그에맞춰 블럭좌표들을 변환한 뒤
				if (can_put(graphic, block_coors, location))//놓을 수 있다면
				{
					put_block(graphic, block_coors, location[0], location[1]);//블럭찍고
					system("cls");
					show_graphic(graphic);//보여주기
				}
				else //놓을 수 없다면
				{
					spinvalue = anti_spin(spinvalue);//블럭회전상수를 1 줄이고(원상복귀)
					block_type_to_coors(block_coors, blocktype, spinvalue);
					put_block(graphic, block_coors, location[0], location[1]);//블럭찍고
					system("cls");
					show_graphic(graphic);//보여주기
				}
				}
				//좌,하,우
				else
				{
					del_block(graphic, block_coors, location[0], location[1]);//블럭을 지우고
					move_coors(location, arrow(key));//기준점을 움직임
					if (can_put(graphic, block_coors, location))//변경된 기준점에 놓을 수 있다면
					{
						put_block(graphic, block_coors, location[0], location[1]);
						system("cls");
						show_graphic(graphic);

					}
					else//변경된 기준점에 놓을 수 없다면
					{
						if (arrow(key) == 2)//아래로가 막힌 경우
						{
							move_coors(location, 0); //기준점 원상복귀
							put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
							row_clear(graphic);
							location[0] = 4;
							location[1] = 14;//기준점이 생성되는 점
							del_block(graphic, next_block_coors, 7, 24);
							coor_to_coor(block_coors, next_block_coors);
							blocktype = next_blocktype;
							spinvalue = next_spinvalue;
							next_blocktype = rand() % 6;
							next_spinvalue = rand() % 4;//랜덤블럭정보입력
							block_type_to_coors(next_block_coors, next_blocktype, next_spinvalue);//블럭좌표 파악

							if (can_put(graphic, block_coors, location))//새 블럭을 놓을 수 있다면
							{
								put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
								put_block(graphic, next_block_coors, 7, 24);
								system("cls");
								show_graphic(graphic);//보여줌
							}
							else//새 블럭 생성할 자리가 없음
							{
								put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
								put_block(graphic, next_block_coors, 7, 24);
								system("cls");
								show_graphic(graphic);//보여줌
								printf("\n게임오버.");
								return 0;
							}
						}
						else//좌우가 막힌 경우
						{
							move_coors(location, anti_arrow(key)); //기준점 원상복귀
							put_block(graphic, block_coors, location[0], location[1]);
							system("cls");
							show_graphic(graphic);//다시 찍고 보여줌
						}
					}
				}

			}

			//회전키가 입력된 경우
			else
			{
                del_block(graphic, block_coors, location[0], location[1]);//블럭을 지우고
					while (1)
					{
						move_coors(location, 2);//기준점을 한칸 내림
						if (can_put(graphic, block_coors, location))//변경된 기준점에 놓을 수 있다면
						{
							continue;
						}
						else//변경된 기준점에 놓을 수 없다면
						{
							move_coors(location, 0); //기준점 원상복귀
							put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
							row_clear(graphic);
							location[0] = 4;
							location[1] = 14;//기준점이 생성되는 점
							del_block(graphic, next_block_coors, 7, 24);
							coor_to_coor(block_coors, next_block_coors);
							blocktype = next_blocktype;
							spinvalue = next_spinvalue;
							next_blocktype = rand() % 6;
							next_spinvalue = rand() % 4;//랜덤블럭정보입력
							block_type_to_coors(next_block_coors, next_blocktype, next_spinvalue);//블럭좌표 파악
							if (can_put(graphic, block_coors, location))//새 블럭을 놓을 수 있다면
							{
								put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
								put_block(graphic, next_block_coors, 7, 24);
								system("cls");
								show_graphic(graphic);//보여줌
							}
							else//새 블럭 생성할 자리가 없음
							{
								put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
								put_block(graphic, next_block_coors, 7, 24);
								system("cls");
								show_graphic(graphic);//보여줌
								printf("\n게임오버.");
								return 0;
							}
							break;
						}
					}
			}
		}

		//단위시간마다 블럭을 떨어뜨림
		if ((clock() - start) > 1499)
		{
			start = clock();
			del_block(graphic, block_coors, location[0], location[1]);//블럭을 지우고
			move_coors(location, 2);//기준점을 움직임
			if (can_put(graphic, block_coors, location))//변경된 기준점에 놓을 수 있다면
			{
				put_block(graphic, block_coors, location[0], location[1]);
				system("cls");
				show_graphic(graphic);
			}
			else//변경된 기준점에 놓을 수 없다면
			{
				move_coors(location, 0); //기준점 원상복귀
				put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
				row_clear(graphic);
				location[0] = 4;
				location[1] = 14;//기준점이 생성되는 점
				del_block(graphic, next_block_coors, 7, 24);
				coor_to_coor(block_coors, next_block_coors);
				blocktype = next_blocktype;
				spinvalue = next_spinvalue;
				next_blocktype = rand() % 6;
				next_spinvalue = rand() % 4;//랜덤블럭정보입력
				block_type_to_coors(next_block_coors, next_blocktype, next_spinvalue);//블럭좌표 파악
				if (can_put(graphic, block_coors, location))//새 블럭을 놓을 수 있다면
				{
					put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
					put_block(graphic, next_block_coors, 7, 24);
					system("cls");
					show_graphic(graphic);//보여줌
				}
				else//새 블럭 생성할 자리가 없음
				{
					put_block(graphic, block_coors, location[0], location[1]);//블럭놓음
					put_block(graphic, next_block_coors, 7, 24);
					system("cls");
					show_graphic(graphic);//보여줌
					printf("\n게임오버.");
					return 0;
				}
			}
		}
	}

	//show_graphic(graphic);
	return 0;
}