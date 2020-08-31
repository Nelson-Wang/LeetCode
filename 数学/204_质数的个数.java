package typeMoudle.数学;

/**
 * Created by wWX945273 on 2020/8/31.
 */

/**
 204. Count Primes 质数的个数

 Count the number of prime numbers less than a non-negative number, n.

 Example:

 Input: 10
 Output: 4
 Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 References:
 How Many Primes Are There?

 Sieve of Eratosthenes

 Credits:
 Special thanks to @mithmatt for adding this problem and creating all test cases.
 */

/**
 素数分解

    每一个数都可以分解成素数的乘积，例如 84 = 22 * 31 * 50 * 71 * 110 * 130 * 170 * …

 整除

     令 x = 2m0 * 3m1 * 5m2 * 7m3 * 11m4 * …

     令 y = 2n0 * 3n1 * 5n2 * 7n3 * 11n4 * …

     如果 x 整除 y（y mod x == 0），则对于所有 i，mi <= ni

 最大公约数最小公倍数

 x 和 y 的最大公约数为：gcd(x,y) = 2min(m0,n0) * 3min(m1,n1) * 5min(m2,n2) * ...

 x 和 y 的最小公倍数为：lcm(x,y) = 2max(m0,n0) * 3max(m1,n1) * 5max(m2,n2) * ...

 思路：埃拉托斯特尼筛法在每次找到一个素数时，将能被素数整除的数排除掉。
 */

public class 质数的个数_204 {
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n];
        int count = 0;
        for (int i=2; i<n; i++){
            if (primes[i]){
                continue;
            }
            count++;
            // 从 i * i 开始，因为如果 k < i，那么 k * i 在之前就已经被去除过了
            for (long j = (long) i*i; j<n; j+=i){
                primes[(int)j] = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(countPrimes(num));
    }
}
