# 회고

## 접근 방식
- 처음 떠올린 방법: for문을 거꾸로 돌면서 `substring`을 사용하여 문자열을 만들고 `endsWith(pat)`를 사용하여 `pat`로 끝나는 문자열인지 확인.
  맞다면 answer에 넣고 break;
- 최종 선택한 방법과 이유: 동일

## 막혔던 점
- `subString()`이 아닌 `substring()`이 맞음.

## 복잡도
- 시간: O( )
- 공간: O( )

## 다른 풀이에서 배운 점
- `.lastIndexOf(String str)` 매소드를 사용하면 간단하게 해결 가능
```
int idx = myString.lastIndexOf(pat);
answer = myString.substring(0, idx) + pat;
```

## 다시 풀 때 기억할 것
-
