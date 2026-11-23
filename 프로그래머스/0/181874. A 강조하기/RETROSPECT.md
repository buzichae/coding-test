# 회고

## 접근 방식
- 처음 떠올린 방법: for문 돌면서 myString.charAt(i)의 값이 A이거나 a인 경우는 대문자로, 그렇지 않으면 소문자로 만들어서 answer에 추가하는 방식
- 최종 선택한 방법과 이유: for문 안에서 Character al = myString.charAt(i); 로 값을 뽑아서 그 값이 a이거나 A이면 대문자로 변환 후 추가

## 막혔던 점
- if문에서 바로 myString.charAt(i).equals('a') || myString.charAt(i).equals('A')로 판별 진행하려 하였으나 `char cannot be dereferenced` 컴파일 에러 발생
- charAt()의 결과는 char형으로 equals를 호출 불가 -> equals가 아닌 == 연산자 사용 + 비교는 `Character.toUpperCase(al)`, `Character.toLowerCase(al)`로 해결

## 다른 풀이에서 배운 점
- for문을 돌지 않아도 한 줄로 해결할 수 있음
- 핵심은 모든 문자 소문자로 변경 + a이거나 A이면 A로 "대체"한다는 것
```java
return myString.toLowerCase().replace('a', 'A');
```

## 다시 풀 때 기억할 것
- `charAt()` 결과는 `char`(기본형) → 메서드 호출 불가, `Character` 클래스의 static 메서드 사용
- 문자 단위 변환 문제는 String 메서드(`toLowerCase`, `replace`) 조합으로 먼저 생각해 보기
