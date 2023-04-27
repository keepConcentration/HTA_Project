drop table PROJECTMANAGERS purge;

create table PROJECTMANAGERS(
	NUM 		NUMBER PRIMARY KEY,
	BOARD_NUM 	NUMBER REFERENCES BOARD(BOARD_NUM) on delete cascade,
	ID	 	VARCHAR(30) REFERENCES MEMBER(ID)
);