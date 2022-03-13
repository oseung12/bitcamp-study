-- mysql
mysql -h 52.79.247.137 -u pompeu -p

-- 지역
insert into location(do,gu,address) values('서울특별시','광진구','군자동 천호대로109길 9 리아리움더언타워 레드포인트클라이밍');
insert into location(do,gu,address) values('인천광역시','계양구','봉오대로 855 계양체육관');
insert into location(do,gu,address) values('서울특별시','서초구','신반포로11길 40 반포한강공원');
insert into location(do,si,address) values('경상북도','경주시','황성동 444-2 화랑탁구클럽');
insert into location(do,gu,address) values('광주광역시','남구','효덕동 124-1 진월국제테니스장');

-- 소모임
insert into party(location_no,name,content,start_date,end_date,max_member,in_out_ex,register_date)
values(9,'클라이밍 함께 즐겨요','언제든지 즐길 수 있는 실내 클라이밍 함께 시작해요. 실내 클라이밍에 필요한 준비물품은 대여도 가능합니다.','2022-03-15 14:00','2022-03-13 23:00',6,1,now());
insert into party(location_no,name,content,start_date,end_date,max_member,in_out_ex,register_date)
values(10,'어쩌다 배구','일상의 모든 스트레스를 배구공으로 날려버리는 배구 소모임 시작해요 남녀노소 배구를 즐기고 싶으신 분들 환영합니다.','2022-03-19 19:00','2022-03-18 14:00',8,1,now());
insert into party(location_no,name,content,start_date,end_date,max_member,in_out_ex,register_date)
values(11,'러닝크루 정규런','야간 러닝크루 모집합니다. 매주 정규런을 계획하고있지만 하루 도전해보셔도 괜찮습니다.','2022-03-25 19:00','2022-03.24 20:00',6,2,now());
insert into party(location_no,name,content,start_date,end_date,max_member,in_out_ex,register_date)
values(12,'우리동네 탁구 함께 해요','우리 동네에서 함께 탁구하실 분들 환영합니다. 기초가 없으신 분들도 시작하실수 있으세요','2022-04-03 11:00','2022-04-01 21:00',4,1,now());
insert into party(location_no,name,content,start_date,end_date,max_member,in_out_ex,register_date)
values(13,'테니스 즐기기','실외에서 즐기는 테니스 혼자가 아닌 같이 재미있게 운동해요','2022-04-09 10:00','2022-04-08 11:00',4,2,now());

-- 소모임이미지
insert into party_image(party_no, image) values(7,'run.jpg');
insert into party_image(party_no, image) values(10,'volleyball.jpg');
insert into party_image(party_no, image) values(6,'climbing.jpg');
insert into party_image(party_no, image) values(8,'pingpongjpg');
insert into party_image(party_no, image) values(9,'tennis.jpg');

-- 소모임참여자
insert into party_user(users_no,party_no,party_maker,join_date) values(1,6,'N',now());
insert into party_user(users_no,party_no,party_maker,join_date) values(2,6,'N',now());
insert into party_user(users_no,party_no,party_maker,join_date) values(3,6,'N',now());
insert into party_user(users_no,party_no,party_maker) values(4,6,'1');
insert into party_user(users_no,party_no,party_maker) values(1,8,'0');
insert into party_user(users_no,party_no,party_maker) values(2,7,'1');
insert into party_user(users_no,party_no,party_maker) values(4,7,'0');
insert into party_user(users_no,party_no,party_maker) values(3,9,'1');
insert into party_user(users_no,party_no,party_maker) values(4,6,'1');
insert into party_user(users_no,party_no,party_maker) values(1,10,'0');
insert into party_user(users_no,party_no,party_maker) values(1,6,'0');
insert into party_user(users_no,party_no,party_maker) values(5,10,'1');


-- 소모임찜
insert into party_wishlist(party_no,users_no) values(9,3);
insert into party_wishlist(party_no,users_no) values(9,1);
insert into party_wishlist(party_no,users_no) values(6,1);
insert into party_wishlist(party_no,users_no) values(9,4);
insert into party_wishlist(party_no,users_no) values(10,2);

-- 소모임신고
insert into party_claim(party_no,users_no) values(8,1);
insert into party_claim(party_no,users_no) values(7,1);
insert into party_claim(party_no,users_no) values(7,5);
insert into party_claim(party_no,users_no) values(10,1);
insert into party_claim(party_no,users_no) values(6,3);

-- 태그명
insert into tag_name(tag_no, tag) values(1,'클라이밍');
insert into tag_name(tag_no, tag) values(2,'배구');
insert into tag_name(tag_no, tag) values(3,'테니스');
insert into tag_name(tag_no, tag) values(4,'탁구');
insert into tag_name(tag_no, tag) values(5,'러닝');
insert into tag_name(tag_no, tag) values(6,'10세 이상');
insert into tag_name(tag_no, tag) values(7,'20세 이상');
insert into tag_name(tag_no, tag) values(8,'30세 이상');
insert into tag_name(tag_no, tag) values(9,'30세 미만');
insert into tag_name(tag_no, tag) values(10,'50세 미만');
insert into tag_name(tag_no, tag) values(11,'60세 미만');
insert into tag_name(tag_no, tag) values(12,'연령제한없음');

-- 태그관리
insert into tag_management(tag_no,party_no) values(1,6);
insert into tag_management(tag_no,party_no) values(6,6);
insert into tag_management(tag_no,party_no) values(7,6);
insert into tag_management(tag_no,party_no) values(2,10);
insert into tag_management(tag_no,party_no) values(10,10);
insert into tag_management(tag_no,party_no) values(11,10);
insert into tag_management(tag_no,party_no) values(3,9);
insert into tag_management(tag_no,party_no) values(6,9);
insert into tag_management(tag_no,party_no) values(4,8);
insert into tag_management(tag_no,party_no) values(12,8);
insert into tag_management(tag_no,party_no) values(5,7);
insert into tag_management(tag_no,party_no) values(12,7);
insert into tag_management(tag_no,party_no) values(2,10);
insert into tag_management(tag_no,party_no) values(10,10);
insert into tag_management(tag_no,party_no) values(11,10);
