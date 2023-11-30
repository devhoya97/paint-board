## 그림판 프로젝트 - 2단계: 콘솔로 원 그리기
- 사용자로부터 중심점의 좌표와 반지름을 입력받아 * 마크로 원을 그린다.

***

### 요구사항
- 사용자로부터 x, y, r 을 입력받는다.
- 주어진 좌표로 원을 그릴 수 있을 경우 * 마크로 채워진 원을 그리고 프로그램을 종료한다.
- 원의 최대 지름은 28 이내여야 한다.
- 원이 테두리를 침범하거나 벗어나면 안 된다.
- 실제로 동그란 모양으로 그려야 한다.

### 입력 
- 입력은 x, y, r 형식으로 입력받는다.
- 반지름은 2 <= r <= 14 이다.
- 단 콤마 다음에는 공백이 하나 있어도 무관하다.
- 잘못된 입력이 있을 경우 다시 입력받는다.
  
### 정상입력
```
10, 20, 5
10,20,5
```

### 잘못된 입력
```
10, 20, 100
90, 이십, 5
0,0,0
```

### 출력
- 먼저 아래 텍스트를 참고하여 80 * 30의 테두리를 그린다.
- 사용자가 입력한 원은 테두리 내부에 위치해야 한다.
```
+--------------------------+
|                          |
|            **            |
|           ****           |
|           ****           |
|            **            |
|                          |
+--------------------------+
```

### 프로그램 예시
```
원 그리기 프로그램
x,y,r을 입력하세요. (예: 10, 20, 5)
10, 20, 5
(테투리와 원 출력)
프로그램을 종료합니다
```

### 2단계 코딩 요구사항
- 컴파일 또는 실행이 가능해야 한다.
- 컴파일이나 실행되지 않을 경우 큰 감점 요인이므로 주의!
- 자기만의 기준으로 최대한 간결하게 코드를 작성한다.
- README.md에 풀이 과정 및 코드 설명, 실행 결과를 기술한다.
- 2단계 완료 커밋에 v2 태그를 만들고 저장소에 push한다.

***

### 구현할 기능 목록

- InputView
  - [ ] 사용자로부터 (x,y,r)을 입력받는다.
    - [ ] 콤마 다음에는 공백이 하나 있어도 무관하다.
    - [ ] [예외처리]첫 번째 숫자 앞에 공백이 있으면 IllegalArgumentException을 발생시킨다.
    - [ ] [예외처리]`숫자,숫자,숫자`형식으로 입력하지 않은 경우 IllegalArgumentException을 발생시킨다.
- 로직
  - [ ] InputView에서 받은 좌표를 저장한다.
    - [ ] 잘못된 입력이 있을 경우 다시 입력받는다.
      - [ ] InputView에서 IllegalArgumentException을 던진 경우를 처리한다.
      - [ ] 원의 조건에 부합하지 않은 경우 발생한 IllegalArgumentException을 처리한다.
  - [x] 그림판을 만든다.
    - [x] 80*30의 테두리를 그린다.
      - [x] 공백으로만 이루어진 이차원 배열을 생성한다.
      - [x] 꼭짓점을 `+`로 채운다.
      - [x] 가로 테두리를 `-`로 채운다.
      - [x] 세로 테두리를 `|`로 채운다.
  - [ ] (x,y,r)을 받아 원을 만든다.
    - [x] [예외처리]x좌표가 1미만 또는 78초과인 경우 IllegalArgumentException을 발생시킨다.
    - [x] [예외처리]y좌표가 1미만 또는 28초과인 경우 IllegalArgumentException을 발생시킨다.
    - [ ] [예외처리]x좌표에 반지름을 뺀 값이 1미만일 경우 IllegalArgumentException을 발생시킨다.
    - [ ] [예외처리]x좌표에 반지름을 더한 값이 78초과일 경우 IllegalArgumentException을 발생시킨다.
    - [ ] [예외처리]y좌표에 반지름을 뺀 값이 1미만일 경우 IllegalArgumentException을 발생시킨다.
    - [ ] [예외처리]y좌표에 반지름을 더한 값이 28초과일 경우 IllegalArgumentException을 발생시킨다.
    - [ ] 원의 경계와 안쪽에 *을 채워 넣는다.
      - [ ] 원의 중심과 특정 점 사이의 거리를 계산한다.
      - [ ] 계산한 거리 값이 원의 반지름보다 작으면 *을 채워 넣는다.
- OutputView
  - [x] 이차원배열을 받아 출력해준다.
  - [ ] 프로그램 시작 메시지를 출력한다.
  - [x] 프로그램 종료 메시지를 출력한다.

***

### 풀이과정 및 코드 설명
- 실제 시험문제에는 자세히 기술하겠습니다!

***

### 실행 결과
```
```