SELECT * 
FROM   member b
;

INSERT INTO member VALUES(1, 'hong', '홍길동');
INSERT INTO member VALUES(2, 'hEHOFE', 'PARK');
INSERT INTO member VALUES(3, 'hong123', '홍길동');
INSERT INTO member VALUES(4, 'ho', '호길동');
INSERT INTO member VALUES(5, 'ng', '베트남분');
#INSERT INTO member VALUES(6, 'ehofhe', 'Abdula');

UPDATE member SET 
seq = 1,
id = 'kildong',
name = '홍길동'
WHERE seq = 1;

DELETE FROM member WHERE seq = 1;