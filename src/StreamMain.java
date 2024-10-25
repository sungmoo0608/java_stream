import java.util.Arrays;

public class StreamMain {

	public static void main(String[] args) {
		
		int[] ar = {1,2,3,4,5};
		//IntStream stm1 = Arrays.stream(ar);
		
		//IntPredicate predicate = Predicate<Integer> predicate;
		//IntStream stm2 = stm1.filter(n->n%2==1);//중간연산
		//int sum = stm2.sum();//최종연산
		
		int sum = Arrays.stream(ar)
				.filter(n->n%2==1)
				.sum();
		
		System.out.println(sum);

	}

}
