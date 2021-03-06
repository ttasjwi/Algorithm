# \[BOJ 01233] 주사위

- 난이도 : Bronze2
- 세 주사위의 면의 갯수가 주어질 때, 주사위를 던진 눈의 합들을 모두 집계하고 가장 많이 출현한 합(같다면 작은 값)을 반환하기
- 문제 : <a href="https://www.acmicpc.net/problem/1233" target="_blank">링크</a>
- 풀이 소스코드 :  <a href="src/Main.java" target="_blank">gitHub</a>

---  

## Main.java : 백준 제출 답안
- 주사위의 면의 수를 int `S1`, `S2`, `S3`에 저장한다.
- 합의 등장횟수를 저장하는 배열 `sumCounter` 정의 (배열의 길이는 S1, S2,S3의 합 +1 만큼으로 함. (0,1,2, ..., S1+S2+S3))
- 모든 주사위의 눈의 케이스에 대하여(브루트포스) 합을 구하고, 그 합에 대응하는 인덱스의 값(등장 횟수)을 증가시킨다.
- 최대등장횟수를 가지는 합을 `maxCountSum` 라고 하고, 이를 3으로 초기화한다.(합의 최숫값은 3이다.)
- `sumCounter`의 4번 인덱스부터, 배열 끝까지 배열에 저장된 값을 `sumCounter[maxCountSum]`과 비교하고, 더 크면 인덱스를 `maxCountSum`으로 갱신시킨다.
- 이를 계속 반복하면, 가장 많이 출현한 값(같다면 작은 값)이 `maxCountSum`에 저장되고, 이를 출력하면 된다.

---

# Review
- 합이 3부터 시작하므로 앞의 0, 1, 2는 불필요하다. 이를 고려하여 배열의 길이를 최소화할 수 있기야 하다.
- 하지만 이렇게 하게 될 경우 인덱스와 합 간에 3만큼 차이가 발생하게 되는데, 매번 이 만큼의 차이를 계산해야한다. 결과적으로 느려짐.
그래서 처음부터 0~S1+S2+S3 만큼 배열을 만들면, 배열의 길이가 불필요한 부분이 있지만, 합을 구한 것이 바로 배열의 인덱스에 매치되므로 더 속도 면에서 저렴하다.


---
