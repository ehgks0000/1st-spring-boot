# 스프링 부트 2.6 연습

## 실행 방법

'spring' 네트워크를 외부에 만들어 주고, mysql 이미지 실행(네트워크 연결)

0. docker network create spring

1. demo 폴더로 이동
2. ./gradlew clean build -x test
3. docker-compose up --build