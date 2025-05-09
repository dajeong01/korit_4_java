package ch24_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("김영", "김일", "김이", "김삼", "김사", "최오", "최육", "최칠");

        // filter()
        List<String> namesWithKim = names.stream()
                .filter(name -> name.startsWith("김"))
                .toList();      // to어쩌고 메서드가 실행되었다는 말은, 걔 이전의 자료형이 절대 List가 아니라는 점

        System.out.println(names);
        System.out.println(namesWithKim);
        System.out.println();

        // 사실 filter는 그 자체로 한 방에 쓰이기보다는 합쳐서 쓰입니다.
        // filter / map / sorted / collect
        List<String> englishNames = Arrays.asList("alice", "anya","bacon","camel","pascal","yor","spy","family");
        List<String> result = englishNames.stream()
                // .여기 사이에 다양한 메서드들을 쓰라는 의미입니다(마치 builder 패턴 사용할때 .build()가 자동생성됐던것처럼
                .filter(name -> name.startsWith("a"))   // "a"로 시작하는 element만 추출
                .map(String::toUpperCase)                       // 이상의 결과값으로 "a"로 시작하는걸 뽑았는데, 대문자로 변환
                .sorted()                                       // 정렬입니다 sort()가 아니죠. 이런게 좀 일관성이 없습니다
                .toList();
        System.out.println(englishNames);
        System.out.println(result);

        // count
        int count1 = englishNames.size();           // element의 전채 게수를 세는 것만 가능
        System.out.println(count1);

        long count2 = englishNames.stream().filter(name -> name.length() > 3).count();
        System.out.println(count2);


    }
}
