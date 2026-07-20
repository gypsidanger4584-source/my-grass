class Solution{
	public int solution(int a, int b){
int gcd = a;
int temp = b;
while(temp != 0){
	int r = gcd % temp;
	gcd = temp;
	temp = r;
	}
	b/=gcd;
	while(b % 2 == 0) b/=2;
	while(b % 5 == 0) b/=5;
	return (b == 1) ? 1:2;
	}
}