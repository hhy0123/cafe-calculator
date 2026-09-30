# cafe-calculator

# cafe-calculator (포카칩)

카페 음료 및 간식을 즐기는 사람을 위한 계산기입니다. 하루 칼로리를 관리하고, 개수로 환산하고, 주문 금액을 나눕니다.

## 팀원과 담당 기능

| 메뉴 | 기능                 | 담당          | 클래스             | 메소드 이름   | Issue | PR  |
|------|----------------------|---------------|--------------------|---------------|-------|-----|
| 1    | 오늘 먹은 칼로리 합계 | 황하윤 (팀장) | PlusCalculator     | sum | #3    | #7  |
| 2    | 남은 칼로리          | 황하윤        | MinusCalculator    | remain,  judge | #4    | #8  |
| 3    | 개수 별 칼로리 계산      | 박유수        | MultiplyCalculator | multiply, CalorieTable | #2    | #5  |
| 4    | 더치페이        | 이영주        | DivideCalculator   | individual_cost | #4    | #6  |

## 실행 화면

<img width="850" height="982" alt="실행화면1" src="https://github.com/user-attachments/assets/e166ae40-c20f-4e18-ae69-a7f4d225e88c" />
<img width="1100" height="1164" alt="실행화면2" src="https://github.com/user-attachments/assets/ddb1a7f8-7b56-46fb-a266-a0168647eeb8" />


## 충돌 해결 기록

- PR #5 : Application.java의 메뉴와 case 위치 겹쳐져서 충돌 발생. 메뉴 4번 코드와 내 메뉴 3번(개수 별 칼로리 계산)을 남기고 번호순으로 정렬.
- PR #7 : Application.java의 메뉴 줄과 case 블록이 충돌. 메뉴 3번,4번 코드와 내 메뉴 1번(하루 칼로리 합계)을 모두 남기고 번호순으로 정렬.
- PR #8 : 메뉴 줄과 case 블록이 충돌. 이미 합쳐진 1번,3번,4번과 내 메뉴 2번을 모두 남기고 번호순으로 정렬. 

## 협업하며 배운 점

-첫 번째 PR은 그냥 들어가지만, 두 번째부터는 Application.java에서 충돌이 발생한다.
-Application.java에서 충돌이 발생하는 이유는 모두 같은 자리에 메뉴 줄과 case를 넣었기 때문이다.
-각자 만든 개별의 클래스 파일은 하나씩이기 때문에 충돌이 일어나지 않는다.
-PR은 한 번 올린 후에도 새로운 커밋을 Push하면 기존 PR에 자동으로 반영된다는 것을 경험했다.
-혼자 작업할 때와 달리 팀 프로젝트에서는 다른 사람의 작업과 내 작업이 겹칠 수 있기 때문에, 변경 사항을 자주 확인하고 팀원들과 작업 내용을 맞추는 것이 중요하다는 것을 배웠다.
